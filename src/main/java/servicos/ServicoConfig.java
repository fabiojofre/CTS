package servicos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import conexao.ConexaoServidor;
import dominio.Config;
import vrrecifeframework.classes.VrProperties;

public class ServicoConfig {

	private void lerProperties() {
		VrProperties vp = new VrProperties();
		Config.host = vp.getString("database.ip");
		Config.base = vp.getString("database.nome");
		Config.porta = vp.getInt("database.porta");
		Config.usuario = vp.getString("database.usuario");
		Config.senha = vp.getString("database.senha");
		Config.id_loja = vp.getInt("system.numeroloja");

		Config.metaUsuario = vp.getString("meta.usuario");
		Config.metaAmbiente = vp.getString("meta.ambiente");
		Config.metaCNPJ = vp.getString("meta.cnpj");
		Config.metaToken = vp.getString("meta.token");

		String dadosProp ="";
		int cont = 0;
		if(Config.metaUsuario == null) {
			dadosProp = dadosProp+"\n meta.usuario";
			cont=cont+1;
		}
		if(Config.metaAmbiente == null) {
			dadosProp = dadosProp+"\n meta.ambiente ";
			cont=cont+1;
		}
		if(Config.metaCNPJ == null) {
			dadosProp = dadosProp+"\n meta.cnpj ";
			cont=cont+1;
		}
		if(Config.metaToken == null) {
			dadosProp = dadosProp+"\n meta.token";
			cont=cont+1;
		}
		if(cont >0) {
			JOptionPane.showMessageDialog(null, "Verifique se os dados abaixo estão inseridos corretamnte no vr.properties.\n"+dadosProp+"","Erro de configuração!",JOptionPane.ERROR_MESSAGE);
		}
	}

	public void trataConfig() {
		lerProperties();
		ConexaoServidor cs = new ConexaoServidor();

		try {
			cs.abrirConexao(Config.host, Config.porta, Config.base, Config.usuario, Config.senha);
			System.out.println("Conexao inicial bem sucedida!");
			String sql = "select l.descricao,f.id_estado,(select substring(versao from 1 for 3) from versao where id_programa = 86)versao from loja l join fornecedor f on l.id_fornecedor = f.id where l.id= ?";
			PreparedStatement stmt = cs.prepareStatement(sql);
			stmt.setInt(1, Config.id_loja);
			ResultSet rs = stmt.executeQuery();

			String loja = "";
			int estado = 0;
			while (rs.next()) {
				Config.nomeLoja = rs.getString(1);
				Config.id_estado = rs.getInt(2);
				Config.versao = rs.getString(3);
			}
			cs.close();
		} catch (Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados!", "Erro configuração VR.",
					JOptionPane.ERROR_MESSAGE);
		}

		System.out.println("\nOs dados carregados sao: ");
		System.out.println("\n**** Dados da conexao: **** ");
		System.out.println("Servidor: " + Config.host);
		System.out.println("Banco: " + Config.base);
		System.out.println("Porta: " + Config.porta);
		System.out.println("Usuario: " + Config.usuario);
		System.out.println("Senha: " + Config.senha);
		System.out.println("Versao do sistema: "+Config.versao);

		System.out.println("\n****Dados da loja configurada: ****");
		System.out.println("Loja: " + Config.id_loja);
		System.out.println("Nome: " + Config.nomeLoja);
		System.out.println("Id da UF loja: " + Config.id_estado);

		System.out.println("\n**** Meta: **** ");
		System.out.println("Ambiente: " + Config.metaAmbiente);
		System.out.println("CNPJ: " + Config.metaCNPJ);
		System.out.println("Token: " + Config.metaToken);
		System.out.println("Usuario: " + Config.metaUsuario);
	}
}
