package servicos;

import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import conexao.ConexaoServidor;
import dominio.Config;

public class Atualizador {
	
	public void atualizaCest(int idProduto,Integer idCest) {
		ConexaoServidor cs = new ConexaoServidor();
		try {
			cs.abrirConexao(Config.host, Config.porta, Config.base, Config.usuario, Config.senha);
			String sql = "update produto set id_cest = ? where id = ?;";
			
			PreparedStatement stmt = cs.prepareStatement(sql);
	
			stmt.setInt(1, idCest);
			stmt.setInt(2, idProduto);
			
			int rowsInserted = stmt.executeUpdate();
			 
			 if (rowsInserted > 0) {
			     System.out.println("Cest atualizado com sucesso!");
			 }
			 cs.close();
		}catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao atualizar o CEST! \n"+"Favor contactar o suporte para verificacao na base VR. \n","Aviso VR!",JOptionPane.ERROR_MESSAGE);
		}		
	}
	public void atualizaAliquota(int idProdutoAliquota,int idAliquota) {
		ConexaoServidor cs = new ConexaoServidor();
		try {
			cs.abrirConexao(Config.host, Config.porta, Config.base, Config.usuario, Config.senha);
			String sql = "update produtoaliquota set id_aliquotadebito = ?, id_aliquotaconsumidor = ? where id = ?;";
			
			PreparedStatement stmt = cs.prepareStatement(sql);
	
			stmt.setInt(1, idAliquota);
			stmt.setInt(2, idAliquota);
			stmt.setInt(3, idProdutoAliquota);
			
			int rowsInserted = stmt.executeUpdate();
			 
			 if (rowsInserted > 0) {
			     System.out.println("Aliquota atualizada com sucesso!");
			 }
			
		}catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao atualizar Aliquotas! \n"+"Favor contactar o suporte para verificacao na base VR. \n","Aviso VR!",JOptionPane.ERROR_MESSAGE);
		}		
	}
	public void atualizaNCM(int idProduto, int ncm1, int ncm2, int ncm3) {
		ConexaoServidor cs = new ConexaoServidor();
		try {
			cs.abrirConexao(Config.host, Config.porta, Config.base, Config.usuario, Config.senha);
			String sql = "update produto set ncm1 = ?, ncm2 =?, ncm3 = ? where id = ?;";
			
			PreparedStatement stmt = cs.prepareStatement(sql);
	
			stmt.setInt(1, ncm1);
			stmt.setInt(2, ncm2);
			stmt.setInt(3, ncm3);
			stmt.setInt(4, idProduto);
			
			int rowsInserted = stmt.executeUpdate();
			 
			 if (rowsInserted > 0) {
			     System.out.println("NCM atualizada com sucesso!");
			 }
			 cs.close();
		}catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao atualizar NCM! \n"+"Favor contactar o suporte para verificacao na base VR. \n","Aviso VR!",JOptionPane.ERROR_MESSAGE);
		}		
	}
	public void atualizaGia(int idProduto,Integer idGia) {
		ConexaoServidor cs = new ConexaoServidor();
		try {
			cs.abrirConexao(Config.host, Config.porta, Config.base, Config.usuario, Config.senha);
			String sql = "update produto set id_codigogia = ? where id =?;";
			
			PreparedStatement stmt = cs.prepareStatement(sql);
	
			stmt.setInt(1, idGia);
			stmt.setInt(2, idProduto);
			
			int rowsInserted = stmt.executeUpdate();
			 
			 if (rowsInserted > 0) {
			     System.out.println("Cogigo GIA atualizado com sucesso!");
			 }
			 cs.close();
		}catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao atualizar GIA! \n"+"Favor contactar o suporte para verificacao na base VR. \n","Aviso VR!",JOptionPane.ERROR_MESSAGE);
		}		
	}
	public void deletaGia(int idProduto) {
		ConexaoServidor cs = new ConexaoServidor();
		try {
			cs.abrirConexao(Config.host, Config.porta, Config.base, Config.usuario, Config.senha);
			String sql = "update produto set id_codigogia = null where id =?;";
			
			PreparedStatement stmt = cs.prepareStatement(sql);
			stmt.setInt(1, idProduto);
			
			int rowsInserted = stmt.executeUpdate();
			 
			 if (rowsInserted > 0) {
			     System.out.println("Cogigo GIA apagado com sucesso!");
			 }
			 cs.close();
		}catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao atualizar GIA! \n"+"Favor contactar o suporte para verificacao na base VR. \n","Aviso VR!",JOptionPane.ERROR_MESSAGE);
		}		
	}
	public void atualizaBeneficio(int idProdutoAliquota,Integer idGiaBeneficio, int idAliquota, Integer idProdutoAliquotaBeneficio) {
		
		ConexaoServidor cs = new ConexaoServidor();
		try {
			cs.abrirConexao(Config.host, Config.porta, Config.base, Config.usuario, Config.senha);
			
			String sql = "";
			if(idGiaBeneficio == null && idProdutoAliquotaBeneficio != null) {
				sql = "delete from produtoaliquotabeneficio where id="+idProdutoAliquotaBeneficio+"; ";
				System.out.println("Produto aliquota beneficio "+idProdutoAliquotaBeneficio+" foi excluida!");
				
			} if(idGiaBeneficio != null && idProdutoAliquotaBeneficio == null) {
				sql = "insert into produtoaliquotabeneficio (id_produtoaliquota, id_aliquota, id_beneficio) values ("+idProdutoAliquota+","+idAliquota+","+idGiaBeneficio+");";
			} if(idGiaBeneficio != null && idProdutoAliquotaBeneficio != null) {
				sql = "update produtoaliquotabeneficio set id_produtoaliquota = "+idProdutoAliquota+", id_aliquota = "+idAliquota+", id_beneficio = "+idGiaBeneficio+" where id = "+idProdutoAliquotaBeneficio+";";
			}else {
				JOptionPane.showMessageDialog(null, "Erro de lógica");
			}
				
			
			PreparedStatement stmt = cs.prepareStatement(sql);
				
			int rowsInserted = stmt.executeUpdate();
			 
			 if (rowsInserted > 0) {
			     System.out.println("Bnefício atualizado com sucesso!");
			 }
			 cs.close();
		}catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao atualizar GIA! \n"+"Favor contactar o suporte para verificacao na base VR. \n","Aviso VR!",JOptionPane.ERROR_MESSAGE);
		}		
	}
	public void atualizaPisCofina_4_0(int idProduto,int pisCredito,int pisDebito,Integer idNaturezaReceita) {
		ConexaoServidor cs = new ConexaoServidor();
		try {
			cs.abrirConexao(Config.host, Config.porta, Config.base, Config.usuario, Config.senha);
			String sql = "update produto set id_tipopiscofinscredito = ?, id_tipopiscofins =?,tiponaturezareceita = ? where id = ?;";
			
			PreparedStatement stmt = cs.prepareStatement(sql);
	
			stmt.setInt(1, pisCredito);
			stmt.setInt(2, pisDebito);
			stmt.setInt(3, idNaturezaReceita);
			stmt.setInt(4, idProduto);
			int rowsInserted = stmt.executeUpdate();
			 
			 if (rowsInserted > 0) {
			     System.out.println("PisCofins atualizados com sucesso!");
			 }
			 cs.close();
		}catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao atualizar PisCofins! \n"+"Favor contactar o suporte para verificacao na base VR. \n","Aviso VR!",JOptionPane.ERROR_MESSAGE);
		}		
	}
	public void atualizaPisCofins_4_1(int idProduto,int pisCredito,int pisDebito,Integer idNaturezaReceita) {
		ConexaoServidor cs = new ConexaoServidor();
		try {
			cs.abrirConexao(Config.host, Config.porta, Config.base, Config.usuario, Config.senha);
			String sql = "update produtopiscofins set id_piscofinscredito = ?, id_piscofinsdebito =?,codigonaturezareceita =? where id_produto = ? ;";
			
			PreparedStatement stmt = cs.prepareStatement(sql);
	
			stmt.setInt(1, pisCredito);
			stmt.setInt(2, pisDebito);
			stmt.setInt(3, idNaturezaReceita);
			stmt.setInt(4, idProduto);
			
			int rowsInserted = stmt.executeUpdate();
			 
			 if (rowsInserted > 0) {
			     System.out.println("PisCofins atualizados com sucesso!");
			 }
			 cs.close();
		}catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao atualizar PisCofins! \n"+"Favor contactar o suporte para verificacao na base VR. \n","Aviso VR!",JOptionPane.ERROR_MESSAGE);
		}		
	}
}
