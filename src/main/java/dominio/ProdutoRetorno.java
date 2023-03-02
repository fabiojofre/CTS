package dominio;

public class ProdutoRetorno {

	private Integer id;
	private Integer codigoCTS;
	private String ean;
	private String descricaocompleta;
//	atualizacao ncm
	private String old_ncm;
	private String novo_ncm;
	private Integer atualizacao_ncm1;
	private Integer atualizacao_ncm2;
	private Integer atualizacao_ncm3;
//  autaizacao cest
	private String old_cest;
	private String novo_cest;
	private Integer old_id_cest;
	private Integer novo_id_cest;
	private Integer cest1;
	private Integer cest2;
	private Integer cest3;
	
//  atualizacao beneficio
	private String old_beneficio;
	private String novo_beneficio;
	private Integer old_id_beneficio;
	private Integer novo_id_beneficio;
	private Integer old_id_produto_aliquota_beneficio;
	private Integer old_codigogia;
	private Integer novo_codigogia;
//  atualizacao aliquota	
	private String old_desc_aliquota;
	private String novo_desc_aliquota;
	private Integer old_id_aliquota;
	private Integer novo_id_aliquota;
	private String old_cst;
	private Double old_aliquota_icms;
	private Double old_redicao;
	private Double old_fcp;
	private String novo_cst;
	private Double novo_aliquota_icms;
	private Double novo_redicao;
	private Double novo_fcp;
	
	private Integer id_produtoaliquota;
	
	private String trib_a_cadastrar;
	
//	atualizacao pis cofins
	private String descricao_pis_novo;
	private String descricao_pis_old;
	private Integer novo_cst_piscofinsdebito;
	private Integer novo_id_pis_debito;
	private Integer novo_cst_piscofinscredito;
	private Integer novo_id_pis_credito;
	private Integer old_cst_pis_debito;
	private Integer old_id_pis_debito;
	private Integer old_cst_pis_credito;
	private Integer old_id_pis_credito;
//	atualizacao natureza da receita
	private Integer old_id_natureza_receita;
	private String old_desc_natureza_receita;
	private Integer novo_id_natureza_receita;
	private String novo_desc_natureza_natureza;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCodigoCTS() {
		return codigoCTS;
	}
	public void setCodigoCTS(Integer codigoCTS) {
		this.codigoCTS = codigoCTS;
	}
	public String getEan() {
		return ean;
	}
	public void setEan(String ean) {
		this.ean = ean;
	}
	public String getDescricaocompleta() {
		return descricaocompleta;
	}
	public void setDescricaocompleta(String descricaocompleta) {
		this.descricaocompleta = descricaocompleta;
	}
	public String getOld_ncm() {
		return old_ncm;
	}
	public void setOld_ncm(String old_ncm) {
		this.old_ncm = old_ncm;
	}
	public String getNovo_ncm() {
		return novo_ncm;
	}
	public void setNovo_ncm(String novo_ncm) {
		this.novo_ncm = novo_ncm;
	}
	public Integer getAtualizacao_ncm1() {
		return atualizacao_ncm1;
	}
	public void setAtualizacao_ncm1(Integer atualizacao_ncm1) {
		this.atualizacao_ncm1 = atualizacao_ncm1;
	}
	public Integer getAtualizacao_ncm2() {
		return atualizacao_ncm2;
	}
	public void setAtualizacao_ncm2(Integer atualizacao_ncm2) {
		this.atualizacao_ncm2 = atualizacao_ncm2;
	}
	public Integer getAtualizacao_ncm3() {
		return atualizacao_ncm3;
	}
	public void setAtualizacao_ncm3(Integer atualizacao_ncm3) {
		this.atualizacao_ncm3 = atualizacao_ncm3;
	}
	public String getOld_cest() {
		return old_cest;
	}
	public void setOld_cest(String old_cest) {
		this.old_cest = old_cest;
	}
	public String getNovo_cest() {
		return novo_cest;
	}
	public void setNovo_cest(String novo_cest) {
		this.novo_cest = novo_cest;
	}
	public Integer getOld_id_cest() {
		return old_id_cest;
	}
	public void setOld_id_cest(Integer old_id_cest) {
		this.old_id_cest = old_id_cest;
	}
	public Integer getNovo_id_cest() {
		return novo_id_cest;
	}
	public void setNovo_id_cest(Integer novo_id_cest) {
		this.novo_id_cest = novo_id_cest;
	}
	public String getOld_beneficio() {
		return old_beneficio;
	}
	public void setOld_beneficio(String old_beneficio) {
		this.old_beneficio = old_beneficio;
	}
	public String getNovo_beneficio() {
		return novo_beneficio;
	}
	public void setNovo_beneficio(String novo_beneficio) {
		this.novo_beneficio = novo_beneficio;
	}
	public Integer getOld_id_beneficio() {
		return old_id_beneficio;
	}
	public void setOld_id_beneficio(Integer old_id_beneficio) {
		this.old_id_beneficio = old_id_beneficio;
	}
	public Integer getNovo_id_beneficio() {
		return novo_id_beneficio;
	}
	public void setNovo_id_beneficio(Integer novo_id_beneficio) {
		this.novo_id_beneficio = novo_id_beneficio;
	}
	public Integer getOld_id_produto_aliquota_beneficio() {
		return old_id_produto_aliquota_beneficio;
	}
	public void setOld_id_produto_aliquota_beneficio(Integer old_id_produto_aliquota_beneficio) {
		this.old_id_produto_aliquota_beneficio = old_id_produto_aliquota_beneficio;
	}
	
	public Integer getOld_codigogia() {
		return old_codigogia;
	}
	public void setOld_codigogia(Integer old_codigogia) {
		this.old_codigogia = old_codigogia;
	}
	public Integer getNovo_codigogia() {
		return novo_codigogia;
	}
	public void setNovo_codigogia(Integer novo_codigogia) {
		this.novo_codigogia = novo_codigogia;
	}
	public String getOld_desc_aliquota() {
		return old_desc_aliquota;
	}
	public void setOld_desc_aliquota(String old_desc_aliquota) {
		this.old_desc_aliquota = old_desc_aliquota;
	}
	public String getNovo_desc_aliquota() {
		return novo_desc_aliquota;
	}
	public void setNovo_desc_aliquota(String novo_desc_aliquota) {
		this.novo_desc_aliquota = novo_desc_aliquota;
	}
	public Integer getOld_id_aliquota() {
		return old_id_aliquota;
	}
	public void setOld_id_aliquota(Integer old_id_aliquota) {
		this.old_id_aliquota = old_id_aliquota;
	}
	public Integer getNovo_id_aliquota() {
		return novo_id_aliquota;
	}
	public void setNovo_id_aliquota(Integer novo_id_aliquota) {
		this.novo_id_aliquota = novo_id_aliquota;
	}
	public String getOld_cst() {
		return old_cst;
	}
	public void setOld_cst(String old_cst) {
		this.old_cst = old_cst;
	}
	
	public Integer getCest1() {
		return cest1;
	}
	public void setCest1(Integer cest1) {
		this.cest1 = cest1;
	}
	public Integer getCest2() {
		return cest2;
	}
	public void setCest2(Integer cest2) {
		this.cest2 = cest2;
	}
	public Integer getCest3() {
		return cest3;
	}
	public void setCest3(Integer cest3) {
		this.cest3 = cest3;
	}
	public Double getOld_aliquota_icms() {
		return old_aliquota_icms;
	}
	public void setOld_aliquota_icms(Double old_aliquota_icms) {
		this.old_aliquota_icms = old_aliquota_icms;
	}
	public Double getOld_redicao() {
		return old_redicao;
	}
	public void setOld_redicao(Double old_redicao) {
		this.old_redicao = old_redicao;
	}
	public Double getOld_fcp() {
		return old_fcp;
	}
	public void setOld_fcp(Double old_fcp) {
		this.old_fcp = old_fcp;
	}
	public String getNovo_cst() {
		return novo_cst;
	}
	public void setNovo_cst(String novo_cst) {
		this.novo_cst = novo_cst;
	}
	public Double getNovo_aliquota_icms() {
		return novo_aliquota_icms;
	}
	public void setNovo_aliquota_icms(Double novo_aliquota_icms) {
		this.novo_aliquota_icms = novo_aliquota_icms;
	}
	public Double getNovo_redicao() {
		return novo_redicao;
	}
	public void setNovo_redicao(Double novo_redicao) {
		this.novo_redicao = novo_redicao;
	}
	public Double getNovo_fcp() {
		return novo_fcp;
	}
	public void setNovo_fcp(Double novo_fcp) {
		this.novo_fcp = novo_fcp;
	}
	public Integer getId_produtoaliquota() {
		return id_produtoaliquota;
	}
	public void setId_produtoaliquota(Integer id_produtoaliquota) {
		this.id_produtoaliquota = id_produtoaliquota;
	}
	public String getTrib_a_cadastrar() {
		return trib_a_cadastrar;
	}
	public void setTrib_a_cadastrar(String trib_a_cadastrar) {
		this.trib_a_cadastrar = trib_a_cadastrar;
	}
	public String getDescricao_pis_novo() {
		return descricao_pis_novo;
	}
	public void setDescricao_pis_novo(String descricao_pis_novo) {
		this.descricao_pis_novo = descricao_pis_novo;
	}
	public String getDescricao_pis_old() {
		return descricao_pis_old;
	}
	public void setDescricao_pis_old(String descricao_pis_old) {
		this.descricao_pis_old = descricao_pis_old;
	}
	public Integer getNovo_cst_piscofinsdebito() {
		return novo_cst_piscofinsdebito;
	}
	public void setNovo_cst_piscofinsdebito(Integer novo_cst_piscofinsdebito) {
		this.novo_cst_piscofinsdebito = novo_cst_piscofinsdebito;
	}
	public Integer getNovo_id_pis_debito() {
		return novo_id_pis_debito;
	}
	public void setNovo_id_pis_debito(Integer novo_id_pis_debito) {
		this.novo_id_pis_debito = novo_id_pis_debito;
	}
	public Integer getNovo_cst_piscofinscredito() {
		return novo_cst_piscofinscredito;
	}
	public void setNovo_cst_piscofinscredito(Integer novo_cst_piscofinscredito) {
		this.novo_cst_piscofinscredito = novo_cst_piscofinscredito;
	}
	public Integer getNovo_id_pis_credito() {
		return novo_id_pis_credito;
	}
	public void setNovo_id_pis_credito(Integer novo_id_pis_credito) {
		this.novo_id_pis_credito = novo_id_pis_credito;
	}
	public Integer getOld_cst_pis_debito() {
		return old_cst_pis_debito;
	}
	public void setOld_cst_pis_debito(Integer old_cst_pis_debito) {
		this.old_cst_pis_debito = old_cst_pis_debito;
	}
	public Integer getOld_id_pis_debito() {
		return old_id_pis_debito;
	}
	public void setOld_id_pis_debito(Integer old_id_pis_debito) {
		this.old_id_pis_debito = old_id_pis_debito;
	}
	public Integer getOld_cst_pis_credito() {
		return old_cst_pis_credito;
	}
	public void setOld_cst_pis_credito(Integer old_cst_pis_credito) {
		this.old_cst_pis_credito = old_cst_pis_credito;
	}
	public Integer getOld_id_pis_credito() {
		return old_id_pis_credito;
	}
	public void setOld_id_pis_credito(Integer old_id_pis_credito) {
		this.old_id_pis_credito = old_id_pis_credito;
	}
	public Integer getOld_id_natureza_receita() {
		return old_id_natureza_receita;
	}
	public void setOld_id_natureza_receita(Integer old_id_natureza_receita) {
		this.old_id_natureza_receita = old_id_natureza_receita;
	}
	public String getOld_desc_natureza_receita() {
		return old_desc_natureza_receita;
	}
	public void setOld_desc_natureza_receita(String old_desc_natureza_receita) {
		this.old_desc_natureza_receita = old_desc_natureza_receita;
	}
	public Integer getNovo_id_natureza_receita() {
		return novo_id_natureza_receita;
	}
	public void setNovo_id_natureza_receita(Integer novo_id_natureza_receita) {
		this.novo_id_natureza_receita = novo_id_natureza_receita;
	}
	public String getNovo_desc_natureza_natureza() {
		return novo_desc_natureza_natureza;
	}
	public void setNovo_desc_natureza_natureza(String novo_desc_natureza_natureza) {
		this.novo_desc_natureza_natureza = novo_desc_natureza_natureza;
	}
	@Override
	public String toString() {
		return "ProdutoRetorno [\nid=" + id + ",\n codigoCTS=" + codigoCTS + ",\n ean=" + ean + ",\n descricaocompleta="
				+ descricaocompleta + ",\n old_ncm=" + old_ncm + ",\n novo_ncm=" + novo_ncm + ",\n atualizacao_ncm1="
				+ atualizacao_ncm1 + ",\n atualizacao_ncm2=" + atualizacao_ncm2 + ",\n atualizacao_ncm3=" + atualizacao_ncm3
				+ ",\n old_cest=" + old_cest + ",\n novo_cest=" + novo_cest + ",\n old_id_cest=" + old_id_cest
				+ ",\n novo_id_cest=" + novo_id_cest + ",\n cest1=" + cest1 + ",\n cest2=" + cest2 + ",\n cest3=" + cest3
				+ ",\n old_beneficio=" + old_beneficio + ",\n novo_beneficio=" + novo_beneficio + ",\n old_id_beneficio="
				+ old_id_beneficio + ",\n novo_id_beneficio=" + novo_id_beneficio + ",\n old_id_produto_aliquota_beneficio="
				+ old_id_produto_aliquota_beneficio + ",\n old_codigogia=" + old_codigogia + ",\n novo_codigogia="
				+ novo_codigogia + ",\n old_desc_aliquota=" + old_desc_aliquota + ",\n novo_desc_aliquota="
				+ novo_desc_aliquota + ",\n old_id_aliquota=" + old_id_aliquota + ",\n novo_id_aliquota=" + novo_id_aliquota
				+ ",\n old_cst=" + old_cst + ",\n old_aliquota_icms=" + old_aliquota_icms + ",\n old_redicao=" + old_redicao
				+ ",\n old_fcp=" + old_fcp + ",\n novo_cst=" + novo_cst + ",\n novo_aliquota_icms=" + novo_aliquota_icms
				+ ",\n novo_redicao=" + novo_redicao + ",\n novo_fcp=" + novo_fcp + ",\n id_produtoaliquota="
				+ id_produtoaliquota + ",\n trib_a_cadastrar=" + trib_a_cadastrar + ",\n descricao_pis_novo="
				+ descricao_pis_novo + ",\n descricao_pis_old=" + descricao_pis_old + ",\n novo_cst_piscofinsdebito="
				+ novo_cst_piscofinsdebito + ",\n novo_id_pis_debito=" + novo_id_pis_debito
				+ ",\n novo_cst_piscofinscredito=" + novo_cst_piscofinscredito + ",\n novo_id_pis_credito="
				+ novo_id_pis_credito + ",\n old_cst_pis_debito=" + old_cst_pis_debito + ",\n old_id_pis_debito="
				+ old_id_pis_debito + ",\n old_cst_pis_credito=" + old_cst_pis_credito + ",\n old_id_pis_credito="
				+ old_id_pis_credito + ",\n old_id_natureza_receita=" + old_id_natureza_receita
				+ ",\n old_desc_natureza_receita=" + old_desc_natureza_receita + ",\n novo_id_natureza_reeita="
				+ novo_id_natureza_receita + ",\n novo_desc_natureza_natureza=" + novo_desc_natureza_natureza + "]";
	}
	
	
}
