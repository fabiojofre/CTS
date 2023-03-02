package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import org.json.JSONObject;

import conexao.ConexaoServidor;
import dominio.Config;
import dominio.ProdutoCTS;
import dominio.ProdutoRetorno;
import servicos.Servico;
import servicos.ServicoConfig;
import util.Util;

public class TrataProdutos {
	Servico srv = new Servico();
	
	ProdutoCTS p = new ProdutoCTS();
	ProdutoRetorno pr = new ProdutoRetorno();
	ServicoConfig conf = new ServicoConfig();
	public static int limpador = 0;
	
	
	//futuramente nao ira retornar nada, apens alimentar o objeto
	public ProdutoCTS alimentaProdutoCTS() {
		JSONObject objeto = new JSONObject(srv.consultarProduto());
		String retorno = Util.retornaResultadoConsulta(objeto).substring(0,3);
		if (retorno.equals("000")) {
			p.setCodigo(Util.retornaProduto(objeto).getInt("Codigo"));
			p.setEAN(Util.retornaProduto(objeto).getString("EAN"));
			p.setProdutoDescricao(Util.retornaProduto(objeto).getString("produtoDescricao"));
			p.setProdutoDescricaoNota(Util.retornaProduto(objeto).getString("produtoDescricaoNota"));
			p.setProdutoDescricaoFornecedor(Util.retornaProduto(objeto).getString("produtoDescricaoFornecedor"));
			p.setProdutoDiasValidade(Util.retornaProduto(objeto).getString("produtoDiasValidade"));
			p.setEmbalagemUnitariaPesoBruto(Util.retornaProduto(objeto).getString("embalagemUnitariaPesoBruto"));
			p.setEmbalagemUnitariaPesoLiquido(Util.retornaProduto(objeto).getString("embalagemUnitariaPesoLiquido"));
			p.setEmbalagemUnitariaAltura(Util.retornaProduto(objeto).getString("embalagemUnitariaAltura"));
			p.setEmbalagemUnitariaLargura(Util.retornaProduto(objeto).getString("embalagemUnitariaLargura"));
			p.setEmbalagemUnitariaProfundidade(Util.retornaProduto(objeto).getString("embalagemUnitariaProfundidade"));
			p.setEmbalagemUnitariaId(Util.retornaProduto(objeto).getInt("embalagemUnitariaId"));
			p.setEmbalagemUnitariaDescricao(Util.retornaProduto(objeto).getString("embalagemUnitariaDescricao"));
			p.setEmbalagemUnitariaCapacidade(Util.retornaProduto(objeto).getString("embalagemUnitariaCapacidade"));
			p.setEmbalagemUnitariaUnidadeMedida(
					Util.retornaProduto(objeto).getString("embalagemUnitariaUnidadeMedida"));
			p.setEmbalagemUnitariaUnidadeMedida(Util.retornaProduto(objeto).getString("embalagemUnitariaUnidadeSigla"));
			p.setFabricanteId(Util.retornaProduto(objeto).getInt("fabricanteId"));
			p.setFabricanteNome(Util.retornaProduto(objeto).getString("fabricanteNome"));
			p.setFabricanteId(Util.retornaProduto(objeto).getInt("fabricanteMarcaid"));
			p.setFabricanteMarcaDescricao(Util.retornaProduto(objeto).getString("fabricanteMarcaDescricao"));
			p.setMercadologicaDepartamentoId(Util.retornaProduto(objeto).getInt("mercadologicaDepartamentoId"));
			p.setMercadologicaDepartamentoNome(Util.retornaProduto(objeto).getString("mercadologicaDepartamentoNome"));
			p.setMercadologicaSecaoId(Util.retornaProduto(objeto).getInt("mercadologicaSecaoId"));
			p.setMercadologicaSecaoNome(Util.retornaProduto(objeto).getString("mercadologicaSecaoNome"));
			p.setMercadologicaGrupoId(Util.retornaProduto(objeto).getInt("mercadologicaGrupoId"));
			p.setMercadologicaGrupoNome(Util.retornaProduto(objeto).getString("mercadologicaGrupoNome"));
			p.setMercadologicaSubgrupoId(Util.retornaProduto(objeto).getInt("mercadologicaSubgrupoId"));
			p.setMercadologicaSubgrupoNome(Util.retornaProduto(objeto).getString("mercadologicaSubgrupoNome"));
			p.setAtivo(Util.retornaProduto(objeto).getInt("Ativo"));
			p.setLogEmbalagem(Util.retornaDadosLogisticos(objeto).getString("logEmbalagem"));
			p.setLogDum14(Util.retornaDadosLogisticos(objeto).getString("logDum14"));
			p.setLogAlturaCm(Util.retornaDadosLogisticos(objeto).getDouble("logAlturaCm"));
			p.setLogLarguraCm(Util.retornaDadosLogisticos(objeto).getDouble("logLarguraCm"));
			p.setLogProfundidadeCm(Util.retornaDadosLogisticos(objeto).getDouble("logProfundidadeCm"));
			p.setLogPesoKg(Util.retornaDadosLogisticos(objeto).getDouble("logPesoKg"));
			p.setQtdEmbal(Util.retornaDadosLogisticos(objeto).getDouble("QtdEmbal"));
			p.setLogQtdLastro(Util.retornaDadosLogisticos(objeto).getDouble("LogQtdLastro"));
			p.setLogQtdCamadas(Util.retornaDadosLogisticos(objeto).getDouble("LogQtdCamadas"));
			p.setTributarioNcm(Util.retornaDadosTributarios(objeto).getString("tributarioNcm"));
			p.setTributarioCest(Util.retornaDadosTributarios(objeto).getString("tributarioCest"));
			p.setTributarioFiguraFiscal(Util.retornaDadosTributarios(objeto).getString("tributarioFiguraFiscal"));
			p.setCodigoBeneficioFiscalIcms(Util.retornaDadosTributarios(objeto).getString("CodigoBeneficioFiscalIcms").substring(0,8).trim());
			p.setCodigoBeneficioFiscalPisCofins(
					Util.retornaDadosTributarios(objeto).getString("CodigoBeneficioFiscalPisCofins"));
			p.setTribRegraDescricao(Util.retornaRegrasTributarias(objeto).getString("tribRegraDescricao"));
			p.setTribRegraUfOrigem(Util.retornaRegrasTributarias(objeto).getString("tribRegraUfOrigem"));
			p.setTribRegraPerfilOrigem(Util.retornaRegrasTributarias(objeto).getString("TribRegraPerfilOrigem"));
			p.setTribRegraCodPerfilOrigem(Util.retornaRegrasTributarias(objeto).getString("TribRegraCodPerfilOrigem"));
			p.setTribRegraUfDestino(Util.retornaRegrasTributarias(objeto).getString("tribRegraUfDestino"));
			p.setTribRegraCodPerfilDestino(Util.retornaRegrasTributarias(objeto).getString("TribRegraPerfilDestino"));
			p.setTribRegraCodPerfilDestino(
					Util.retornaRegrasTributarias(objeto).getString("TribRegraCodPerfilDestino"));
			p.setTribRegraCfop(Util.retornaRegrasTributarias(objeto).getString("tribRegraCfop"));
			p.setTribIcmsCst(Util.retornaRegrasTributarias(objeto).getString("tribIcmsCst"));
			p.setTribIcmsAliq(Util.retornaRegrasTributarias(objeto).getDouble("tribIcmsAliq"));
			p.setTribIcmsReducao(Util.retornaRegrasTributarias(objeto).getDouble("tribIcmsReducao"));
			p.setTribIcmsStAliq(Util.retornaRegrasTributarias(objeto).getDouble("tribIcmsStAliq"));
			p.setTribIcmsStPauta(Util.retornaRegrasTributarias(objeto).getString("tribIcmsStPauta"));
			p.setTribIcmsStMva(Util.retornaRegrasTributarias(objeto).getDouble("tribIcmsStMva"));
			p.setTribFcpAliq(Util.retornaRegrasTributarias(objeto).getDouble("tribFcpAliq"));
			p.setTribDifalAliq(Util.retornaRegrasTributarias(objeto).getDouble("tribDifalAliq"));
			p.setTribRegraPisCst(Util.retornaRegrasTributarias(objeto).getString("tribRegraPisCst"));
			p.setTribRegraPisCstE(Util.retornaRegrasTributariasE(objeto).getString("tribRegraPisCst"));
			p.setTribPisReducao(Util.retornaRegrasTributarias(objeto).getString("tribPisReducao"));
			p.setTribPisAliq(Util.retornaRegrasTributarias(objeto).getString("tribPisAliq"));
			p.setFisRegraCofinsCst(Util.retornaRegrasTributarias(objeto).getString("fisRegraCofinsCst"));
			p.setTribCofinsReducao(Util.retornaRegrasTributarias(objeto).getString("tribCofinsReducao"));
			p.setTribCofinAliq(Util.retornaRegrasTributarias(objeto).getString("tribCofinAliq"));
			p.setFisRegraValidadeInicio(Util.retornaRegrasTributarias(objeto).getString("fisRegraValidadeInicio").substring(0,10));
			p.setFisRegraValidadeFinal(Util.retornaRegrasTributarias(objeto).getString("fisRegraValidadeFinal").substring(0,10));
			p.setResultadoConsulta(Util.retornaResultadoConsulta(objeto));
			limpador = 0;
			
		} else {
			p.setResultadoConsulta(Util.retornaResultadoConsulta(objeto));
		JOptionPane.showMessageDialog(null,p.getResultadoConsulta(),"Aviso CTS!",JOptionPane.WARNING_MESSAGE);
		limpador =1;
		}
		System.out.println("Produtos importados do WebSevice: \n"+p.toString()+"\nAliquota encontrada:");
		
		return p;
	}
	
	//une ProdutoCTS e Produto(do banco VR) ao Produtoretorno 
	public void alimentaICMS() {
		ConexaoServidor cs = new ConexaoServidor();

		alimentaProdutoCTS();
		if(p.getEAN()!=null) {
			try {
				cs.abrirConexao(Config.host, Config.porta, Config.base, Config.usuario, Config.senha);
				String sql = "select * from aliquota where id_aliquotapdv is not null and id_situacaocadastro = 1 and reduzido = ? and porcentagem = ? and situacaotributaria =? and porcentagemfcp =?";
				PreparedStatement stmt = cs.prepareStatement(sql); 
				stmt.setDouble(1,p.getTribIcmsReducao());
				stmt.setDouble(2, p.getTribIcmsAliq());
				stmt.setInt(3, Integer.parseInt(p.getTribIcmsCst()));
				stmt.setDouble(4, p.getTribFcpAliq());
				
				ResultSet rs = stmt.executeQuery();
				String resposta = "";
				int contador= 0;
				int idAliq =0;
				String descAliq = "";
				while(rs.next()){ 
					contador=contador+1;
					idAliq= rs.getInt(1);
					descAliq = rs.getString(2);
					resposta = resposta + "Aliq. ("+idAliq+" - "+descAliq+") ";
					
					 System.out.println(idAliq+" - "+descAliq);
					 }
				
				if(contador > 1){
					JOptionPane.showMessageDialog(null, resposta+"\nAliquotas acima estao duplicadas. \nFavor entrar em contato com o suporte da VR pra corrigir o problema","Aviso VR!",JOptionPane.WARNING_MESSAGE);
					System.out.println("quantidade de aliquotas repetidas (com mesmo CST, Percentual ICMS, Reducao, FCP, AliquotaPDV e Ativo): \n"+contador);
				}
				if(contador < 1) {
					JOptionPane.showMessageDialog(null, "Aliquota com (CST: "+p.getTribIcmsCst()+", PercentualICMS: "+p.getTribIcmsAliq()+", Reducao: "+p.getTribIcmsReducao()+" FCP: "+
				p.getTribFcpAliq()+" e Aliquota PDV) não encontrada!\nFavor entrar em contato com o suporte da VR para cadastrar a mesma.","Aviso VR!",JOptionPane.WARNING_MESSAGE);
					System.out.println("Nao foi encontrada aliquota alguma com (CST: "+p.getTribIcmsCst()+", PercentualICMS: "+p.getTribIcmsAliq()+", Reducao: "+p.getTribIcmsReducao()+" FCP: "+p.getTribFcpAliq()+" e Aliquota PDV)");
				}
				if(contador == 1)  {
					pr.setNovo_id_aliquota(idAliq);
					pr.setNovo_desc_aliquota(descAliq);
					
				}
				System.out.println(pr.getNovo_id_aliquota()+" "+pr.getNovo_desc_aliquota());
			cs.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	public void alimentaProdutoRetorno() {
		alimentaICMS();
		if(pr.getNovo_id_aliquota() != null && limpador ==0) {
			
			pr.setCodigoCTS(p.getCodigo());
			pr.setEan(p.getEAN());		
			//ncm
			pr.setNovo_ncm(p.getTributarioNcm());
			pr.setAtualizacao_ncm1(Integer.parseInt(p.getTributarioNcm().substring(0,4)));
			pr.setAtualizacao_ncm2(Integer.parseInt(p.getTributarioNcm().substring(4,6)));
			pr.setAtualizacao_ncm3(Integer.parseInt(p.getTributarioNcm().substring(6,8)));
			//cest
			pr.setNovo_cest(p.getTributarioCest());
			pr.setOld_id_cest(null);//sql
			pr.setNovo_id_cest(null);//sql quebrando o p.getTributarioCest() coo n ncm acima
			pr.setCest1(Integer.parseInt(p.getTributarioCest().substring(0,2)));;
			pr.setCest2(Integer.parseInt(p.getTributarioCest().substring(2,5)));
			pr.setCest3(Integer.parseInt(p.getTributarioCest().substring(5,7)));
			//pscofins
			pr.setNovo_cst_piscofinscredito(Integer.parseInt(p.getTribRegraPisCstE()));
			pr.setNovo_cst_piscofinsdebito(Integer.parseInt(p.getTribRegraPisCst()));
			//aliquota, a jova já está alimentada
			pr.setOld_id_aliquota(null);//sql
			pr.setOld_desc_aliquota(null);//sql
			pr.setId_produtoaliquota(null);//sql
			//beneficios 
			pr.setOld_id_beneficio(null);//
		
			if(p.getCodigoBeneficioFiscalIcms().equals("N/A-NAO")) {
			pr.setNovo_beneficio(null);
			}else {
				pr.setNovo_beneficio(p.getCodigoBeneficioFiscalIcms());
			}
			
			// a serem entendidos
			// naureza da receita
			pr.setOld_id_natureza_receita(null);//sql
			System.out.println("Beneficio encontrado: >>>>>"+pr.getNovo_beneficio());
			
			if(p.getCodigoBeneficioFiscalPisCofins().substring(0,p.getCodigoBeneficioFiscalPisCofins().indexOf('-'))=="0") {
				pr.setNovo_id_natureza_receita(null);
			}else {
			pr.setNovo_id_natureza_receita(Integer.parseInt(p.getCodigoBeneficioFiscalPisCofins().substring(0,p.getCodigoBeneficioFiscalPisCofins().indexOf('-'))));
			}
			
			
		}
	}
	
	public ProdutoRetorno complentaProdutoRetorno() {
		ConexaoServidor cs = new ConexaoServidor();
		alimentaProdutoRetorno();
			if(pr.getNovo_id_aliquota() != null) {	
			try {
				cs.abrirConexao(Config.host, Config.porta, Config.base, Config.usuario, Config.senha);
				String sql = 
						"select \r\n"
						+ "p.id,\r\n"
						+ "p.descricaocompleta,\r\n"
						+ "p.id_cest old_id_cest,\r\n"
						+ "lpad(c.cest1::text,2,'0')||lpad(c.cest2::text,3,'0')||lpad(c.cest3::text,2,'0')old_cest,\r\n"
						+ "(select id from cest c where cest1 = ? and cest2 =  ?  and cest3 = ?)novo_id_cest,\r\n"
						+ "p.tiponaturezareceita old_naturezarecaita, \r\n"
						+ "p.id_tipopiscofinscredito old_id_piscofinscredito,\r\n"
						+ "pc.cst old_cst_piscredito,\r\n"
						+ "p.id_tipopiscofins old_id_piscofinsdebito,\r\n"
						+ "(select id from tipopiscofins where cst = ?)novo_id_piscofins_sentrada,\r\n"
						+ "(select id from tipopiscofins where cst = ?)novo_id_piscofins_saida,\r\n"
						+ "pd.cst old_cst_pisdebito,\r\n"
						+ "lpad(p.ncm1::text,4,'0')||lpad(p.ncm2::text,2,'0')||lpad(p.ncm3::text,2,'0')old_ncm,\r\n"
						+ "pal.id id_produtoaliquota,\r\n"
						+ "a.id old_id_aliquota,\r\n"
						+ "a.descricao ol_desc_aliq,\r\n"
						+ "p.id_codigogia old_codigogia,\r\n"
						+ "pab.id old_id_produtoaliquotabneficio,\r\n"
						+ "cb2.codigo old_codigobeneficio,\r\n"
						+ "(select id from codigobeneficiocst c where c.codigo = ? and id_estado = ?)novo_id_codigogia\r\n"
						+ "from produto p\r\n"
						+ "left join produtoautomacao pa on p.id = pa.id_produto\r\n"
						+ "left join cest c on p.id_cest = c.id\r\n"
						+ "left join tipopiscofins pc on p.id_tipopiscofinscredito = pc.id\r\n"
						+ "left join tipopiscofins pd on p.id_tipopiscofins = pd.id\r\n"
						+ "left join produtoaliquota pal on p.id = pal.id_produto and pal.id_estado = ? \r\n"
						+ "left join aliquota a on pal.id_aliquotaconsumidor = a.id\r\n"
						+ "left join codigobeneficiocst cb on p.id_codigogia = cb.id \r\n"
						+ "left join produtoaliquotabeneficio pab on  pal.id =pab.id_produtoaliquota \r\n"
						+ "left join codigobeneficiocst cb2 on pab.id_beneficio = cb2.id \r\n"
						+ "where pa.codigobarras = ?";
				
				PreparedStatement stmt = cs.prepareStatement(sql); 
				stmt.setInt(1, pr.getCest1());
				stmt.setInt(2, pr.getCest2());
				stmt.setInt(3, pr.getCest3());
				stmt.setInt(4, pr.getNovo_cst_piscofinscredito());
				stmt.setInt(5, pr.getNovo_cst_piscofinsdebito());
				stmt.setString(6, p.getCodigoBeneficioFiscalIcms());
				stmt.setInt(7, Config.id_estado);
				stmt.setInt(8, Config.id_estado);
				stmt.setLong(9, Long.parseLong(pr.getEan()));
				
				ResultSet rs = stmt.executeQuery();
				while(rs.next()){
					 pr.setId(rs.getInt(1));
					 pr.setDescricaocompleta(rs.getString(2));
					 pr.setOld_id_cest(rs.getInt(3));
					 pr.setOld_cest(rs.getString(4));
					 pr.setNovo_id_cest(rs.getInt(5));
					 pr.setOld_id_natureza_receita(rs.getInt(6));
					 pr.setOld_id_pis_credito(rs.getInt(7));
					 pr.setOld_cst_pis_credito(rs.getInt(8));
					 pr.setOld_id_pis_debito(rs.getInt(9));
					 pr.setOld_cst_pis_debito(rs.getInt(12));
					 pr.setNovo_id_pis_credito(rs.getInt(10));
					 pr.setNovo_id_pis_debito(rs.getInt(11));
					 pr.setOld_ncm(rs.getString(13));
					 pr.setId_produtoaliquota(rs.getInt(14));
					 pr.setOld_id_aliquota(rs.getInt(15));
					 pr.setOld_desc_aliquota(rs.getString(16));
					 if(rs.getInt(17)==0) {
						 pr.setOld_codigogia(null);
					 }else {
					 pr.setOld_codigogia(rs.getInt(17));
					 }
					 pr.setOld_id_produto_aliquota_beneficio(rs.getInt(18));
					 pr.setOld_beneficio(rs.getString(19));
					 if(rs.getInt(20) > 0) {
					 pr.setNovo_id_beneficio(rs.getInt(20));
					 }
					 else {
						 pr.setNovo_id_beneficio(null);
					 }
					System.out.println("###########################################\n");
				System.out.println("Id do produto na VR: "+rs.getInt(1));
				System.out.println("Descricao do produto VR: "+rs.getString(2));
				System.out.println("Id Cest VR: "+rs.getInt(3));
				System.out.println("Cest VR: "+rs.getString(4));
				System.out.println("Novo id Cest: "+rs.getInt(5));
				System.out.println("Natureza da receita VR: "+rs.getInt(6));
				System.out.println("TipoPisCofins Credito VR: "+rs.getInt(7));
				System.out.println("CST PisCofins Credito VR: "+rs.getInt(8));
				System.out.println("TipoPisCofins Debito VR: "+rs.getInt(9));
				System.out.println("Id TipopisCofins Credito CTS: "+rs.getInt(10));
				System.out.println("Id TipoPisCofins Debito CTS: "+rs.getInt(11));
				System.out.println("CST PisCofins Debito VR: "+rs.getInt(12));
				System.out.println("NCM VR: "+rs.getString(13));
				System.out.println("ID produtoAliquota VR: "+rs.getInt(14));
				System.out.println("ID Aliquota VR: "+rs.getInt(15));
				System.out.println("Aliquota VR: "+rs.getString(16));
				System.out.println("Codigogia VR: "+rs.getInt(17));
				System.out.println("Id ProdutoAliquota beneficio VR: "+rs.getInt(18));
				System.out.println("CogigoBeneficio VR: "+rs.getString(19));
				System.out.println("ID CodigoBeneficio CTS: "+rs.getInt(20));
				
				System.out.println("\n###########################################\n");
				System.out.println(pr.toString());
				}
				cs.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
			
		}
			return pr;
		
	}
	

}
