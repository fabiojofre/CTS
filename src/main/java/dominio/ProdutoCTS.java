package dominio;

public class ProdutoCTS {
	private Integer Codigo;
	private String EAN;
	private String produtoDescricao;
	private String produtoDescricaoNota;
	private String produtoDescricaoFornecedor;
	private String produtoDiasValidade;
	private String embalagemUnitariaPesoBruto;
	private String embalagemUnitariaPesoLiquido;
	private String embalagemUnitariaAltura;
	private String embalagemUnitariaLargura;
	private String embalagemUnitariaProfundidade;
	private Integer embalagemUnitariaId;
	private String embalagemUnitariaDescricao;
	private String embalagemUnitariaCapacidade;
	private String embalagemUnitariaUnidadeMedida;
	private String embalagemUnitariaUnidadeSigla;
	private Integer fabricanteId;
	private String fabricanteNome;
	private Integer fabricanteMarcaid;
	private String fabricanteMarcaDescricao;
	private Integer mercadologicaDepartamentoId;
	private String mercadologicaDepartamentoNome;
	private Integer mercadologicaSecaoId;
	private String mercadologicaSecaoNome;
	private Integer mercadologicaGrupoId;
	private String mercadologicaGrupoNome;
	private Integer mercadologicaSubgrupoId;
	private String mercadologicaSubgrupoNome;
	private Integer Ativo;
	// dados Logisticos
	private String logEmbalagem;
	private String logDum14;
	private Double logAlturaCm;
	private Double logLarguraCm;
	private Double logProfundidadeCm;
	private Double logPesoKg;
	private Double QtdEmbal;
	private Double LogQtdLastro;
	private Double LogQtdCamadas;
	// dados tributarios
	private String tributarioNcm;
	private String tributarioCest;
	private String tributarioFiguraFiscal;
	private String CodigoBeneficioFiscalIcms;
	private String CodigoBeneficioFiscalPisCofins;
	// regras tributarias
	private String tribRegraDescricao;
	private String tribRegraUfOrigem;
	private String TribRegraPerfilOrigem;
	private String TribRegraCodPerfilOrigem;
	private String tribRegraUfDestino;
	private String TribRegraPerfilDestino;
	private String TribRegraCodPerfilDestino;
	private String tribRegraCfop;
	private String tribIcmsCst;
	private Double tribIcmsAliq;
	private Double tribIcmsReducao;
	private Double tribIcmsStAliq;
	private String tribIcmsStPauta;
	private Double tribIcmsStMva;
	private Double tribFcpAliq;
	private Double tribDifalAliq;
	private String tribRegraPisCst;
	private String tribRegraPisCstE;
	private String tribPisReducao;
	private String tribPisAliq;
	private String fisRegraCofinsCst;
	private String tribCofinsReducao;
	private String tribCofinAliq;
	private String fisRegraValidadeInicio;
	private String fisRegraValidadeFinal;
	private String resultadoConsulta;
	
	
	public Integer getCodigo() {
		return Codigo;
	}
	public void setCodigo(Integer codigo) {
		Codigo = codigo;
	}
	public String getEAN() {
		return EAN;
	}
	public void setEAN(String eAN) {
		EAN = eAN;
	}
	public String getProdutoDescricao() {
		return produtoDescricao;
	}
	public void setProdutoDescricao(String produtoDescricao) {
		this.produtoDescricao = produtoDescricao;
	}
	public String getProdutoDescricaoNota() {
		return produtoDescricaoNota;
	}
	public void setProdutoDescricaoNota(String produtoDescricaoNota) {
		this.produtoDescricaoNota = produtoDescricaoNota;
	}
	public String getProdutoDescricaoFornecedor() {
		return produtoDescricaoFornecedor;
	}
	public void setProdutoDescricaoFornecedor(String produtoDescricaoFornecedor) {
		this.produtoDescricaoFornecedor = produtoDescricaoFornecedor;
	}
	public String getProdutoDiasValidade() {
		return produtoDiasValidade;
	}
	public void setProdutoDiasValidade(String produtoDiasValidade) {
		this.produtoDiasValidade = produtoDiasValidade;
	}
	public String getEmbalagemUnitariaPesoBruto() {
		return embalagemUnitariaPesoBruto;
	}
	public void setEmbalagemUnitariaPesoBruto(String embalagemUnitariaPesoBruto) {
		this.embalagemUnitariaPesoBruto = embalagemUnitariaPesoBruto;
	}
	public String getEmbalagemUnitariaPesoLiquido() {
		return embalagemUnitariaPesoLiquido;
	}
	public void setEmbalagemUnitariaPesoLiquido(String embalagemUnitariaPesoLiquido) {
		this.embalagemUnitariaPesoLiquido = embalagemUnitariaPesoLiquido;
	}
	public String getEmbalagemUnitariaAltura() {
		return embalagemUnitariaAltura;
	}
	public void setEmbalagemUnitariaAltura(String embalagemUnitariaAltura) {
		this.embalagemUnitariaAltura = embalagemUnitariaAltura;
	}
	public String getEmbalagemUnitariaLargura() {
		return embalagemUnitariaLargura;
	}
	public void setEmbalagemUnitariaLargura(String embalagemUnitariaLargura) {
		this.embalagemUnitariaLargura = embalagemUnitariaLargura;
	}
	public String getEmbalagemUnitariaProfundidade() {
		return embalagemUnitariaProfundidade;
	}
	public void setEmbalagemUnitariaProfundidade(String embalagemUnitariaProfundidade) {
		this.embalagemUnitariaProfundidade = embalagemUnitariaProfundidade;
	}
	public Integer getEmbalagemUnitariaId() {
		return embalagemUnitariaId;
	}
	public void setEmbalagemUnitariaId(Integer embalagemUnitariaId) {
		this.embalagemUnitariaId = embalagemUnitariaId;
	}
	public String getEmbalagemUnitariaDescricao() {
		return embalagemUnitariaDescricao;
	}
	public void setEmbalagemUnitariaDescricao(String embalagemUnitariaDescricao) {
		this.embalagemUnitariaDescricao = embalagemUnitariaDescricao;
	}
	public String getEmbalagemUnitariaCapacidade() {
		return embalagemUnitariaCapacidade;
	}
	public void setEmbalagemUnitariaCapacidade(String embalagemUnitariaCapacidade) {
		this.embalagemUnitariaCapacidade = embalagemUnitariaCapacidade;
	}
	public String getEmbalagemUnitariaUnidadeMedida() {
		return embalagemUnitariaUnidadeMedida;
	}
	public void setEmbalagemUnitariaUnidadeMedida(String embalagemUnitariaUnidadeMedida) {
		this.embalagemUnitariaUnidadeMedida = embalagemUnitariaUnidadeMedida;
	}
	public String getEmbalagemUnitariaUnidadeSigla() {
		return embalagemUnitariaUnidadeSigla;
	}
	public void setEmbalagemUnitariaUnidadeSigla(String embalagemUnitariaUnidadeSigla) {
		this.embalagemUnitariaUnidadeSigla = embalagemUnitariaUnidadeSigla;
	}
	public Integer getFabricanteId() {
		return fabricanteId;
	}
	public void setFabricanteId(Integer fabricanteId) {
		this.fabricanteId = fabricanteId;
	}
	public String getFabricanteNome() {
		return fabricanteNome;
	}
	public void setFabricanteNome(String fabricanteNome) {
		this.fabricanteNome = fabricanteNome;
	}
	public Integer getFabricanteMarcaid() {
		return fabricanteMarcaid;
	}
	public void setFabricanteMarcaid(Integer fabricanteMarcaid) {
		this.fabricanteMarcaid = fabricanteMarcaid;
	}
	public String getFabricanteMarcaDescricao() {
		return fabricanteMarcaDescricao;
	}
	public void setFabricanteMarcaDescricao(String fabricanteMarcaDescricao) {
		this.fabricanteMarcaDescricao = fabricanteMarcaDescricao;
	}
	public Integer getMercadologicaDepartamentoId() {
		return mercadologicaDepartamentoId;
	}
	public void setMercadologicaDepartamentoId(Integer mercadologicaDepartamentoId) {
		this.mercadologicaDepartamentoId = mercadologicaDepartamentoId;
	}
	public String getMercadologicaDepartamentoNome() {
		return mercadologicaDepartamentoNome;
	}
	public void setMercadologicaDepartamentoNome(String mercadologicaDepartamentoNome) {
		this.mercadologicaDepartamentoNome = mercadologicaDepartamentoNome;
	}
	public Integer getMercadologicaSecaoId() {
		return mercadologicaSecaoId;
	}
	public void setMercadologicaSecaoId(Integer mercadologicaSecaoId) {
		this.mercadologicaSecaoId = mercadologicaSecaoId;
	}
	public String getMercadologicaSecaoNome() {
		return mercadologicaSecaoNome;
	}
	public void setMercadologicaSecaoNome(String mercadologicaSecaoNome) {
		this.mercadologicaSecaoNome = mercadologicaSecaoNome;
	}
	public Integer getMercadologicaGrupoId() {
		return mercadologicaGrupoId;
	}
	public void setMercadologicaGrupoId(Integer mercadologicaGrupoId) {
		this.mercadologicaGrupoId = mercadologicaGrupoId;
	}
	public String getMercadologicaGrupoNome() {
		return mercadologicaGrupoNome;
	}
	public void setMercadologicaGrupoNome(String mercadologicaGrupoNome) {
		this.mercadologicaGrupoNome = mercadologicaGrupoNome;
	}
	public Integer getMercadologicaSubgrupoId() {
		return mercadologicaSubgrupoId;
	}
	public void setMercadologicaSubgrupoId(Integer mercadologicaSubgrupoId) {
		this.mercadologicaSubgrupoId = mercadologicaSubgrupoId;
	}
	public String getMercadologicaSubgrupoNome() {
		return mercadologicaSubgrupoNome;
	}
	public void setMercadologicaSubgrupoNome(String mercadologicaSubgrupoNome) {
		this.mercadologicaSubgrupoNome = mercadologicaSubgrupoNome;
	}
	public Integer getAtivo() {
		return Ativo;
	}
	public void setAtivo(Integer ativo) {
		Ativo = ativo;
	}
	public String getLogEmbalagem() {
		return logEmbalagem;
	}
	public void setLogEmbalagem(String logEmbalagem) {
		this.logEmbalagem = logEmbalagem;
	}
	public String getLogDum14() {
		return logDum14;
	}
	public void setLogDum14(String logDum14) {
		this.logDum14 = logDum14;
	}
	public Double getLogAlturaCm() {
		return logAlturaCm;
	}
	public void setLogAlturaCm(Double logAlturaCm) {
		this.logAlturaCm = logAlturaCm;
	}
	public Double getLogLarguraCm() {
		return logLarguraCm;
	}
	public void setLogLarguraCm(Double logLarguraCm) {
		this.logLarguraCm = logLarguraCm;
	}
	public Double getLogProfundidadeCm() {
		return logProfundidadeCm;
	}
	public void setLogProfundidadeCm(Double logProfundidadeCm) {
		this.logProfundidadeCm = logProfundidadeCm;
	}
	public Double getLogPesoKg() {
		return logPesoKg;
	}
	public void setLogPesoKg(Double logPesoKg) {
		this.logPesoKg = logPesoKg;
	}
	public Double getQtdEmbal() {
		return QtdEmbal;
	}
	public void setQtdEmbal(Double qtdEmbal) {
		QtdEmbal = qtdEmbal;
	}
	public Double getLogQtdLastro() {
		return LogQtdLastro;
	}
	public void setLogQtdLastro(Double logQtdLastro) {
		LogQtdLastro = logQtdLastro;
	}
	public Double getLogQtdCamadas() {
		return LogQtdCamadas;
	}
	public void setLogQtdCamadas(Double logQtdCamadas) {
		LogQtdCamadas = logQtdCamadas;
	}
	public String getTributarioNcm() {
		return tributarioNcm;
	}
	public void setTributarioNcm(String tributarioNcm) {
		this.tributarioNcm = tributarioNcm;
	}
	public String getTributarioCest() {
		return tributarioCest;
	}
	public void setTributarioCest(String tributarioCest) {
		this.tributarioCest = tributarioCest;
	}
	public String getTributarioFiguraFiscal() {
		return tributarioFiguraFiscal;
	}
	public void setTributarioFiguraFiscal(String tributarioFiguraFiscal) {
		this.tributarioFiguraFiscal = tributarioFiguraFiscal;
	}
	public String getCodigoBeneficioFiscalIcms() {
		return CodigoBeneficioFiscalIcms;
	}
	public void setCodigoBeneficioFiscalIcms(String codigoBeneficioFiscalIcms) {
		CodigoBeneficioFiscalIcms = codigoBeneficioFiscalIcms;
	}
	public String getCodigoBeneficioFiscalPisCofins() {
		return CodigoBeneficioFiscalPisCofins;
	}
	public void setCodigoBeneficioFiscalPisCofins(String codigoBeneficioFiscalPisCofins) {
		CodigoBeneficioFiscalPisCofins = codigoBeneficioFiscalPisCofins;
	}
	public String getTribRegraDescricao() {
		return tribRegraDescricao;
	}
	public void setTribRegraDescricao(String tribRegraDescricao) {
		this.tribRegraDescricao = tribRegraDescricao;
	}
	public String getTribRegraUfOrigem() {
		return tribRegraUfOrigem;
	}
	public void setTribRegraUfOrigem(String tribRegraUfOrigem) {
		this.tribRegraUfOrigem = tribRegraUfOrigem;
	}
	public String getTribRegraPerfilOrigem() {
		return TribRegraPerfilOrigem;
	}
	public void setTribRegraPerfilOrigem(String tribRegraPerfilOrigem) {
		TribRegraPerfilOrigem = tribRegraPerfilOrigem;
	}
	public String getTribRegraCodPerfilOrigem() {
		return TribRegraCodPerfilOrigem;
	}
	public void setTribRegraCodPerfilOrigem(String tribRegraCodPerfilOrigem) {
		TribRegraCodPerfilOrigem = tribRegraCodPerfilOrigem;
	}
	public String getTribRegraUfDestino() {
		return tribRegraUfDestino;
	}
	public void setTribRegraUfDestino(String tribRegraUfDestino) {
		this.tribRegraUfDestino = tribRegraUfDestino;
	}
	public String getTribRegraPerfilDestino() {
		return TribRegraPerfilDestino;
	}
	public void setTribRegraPerfilDestino(String tribRegraPerfilDestino) {
		TribRegraPerfilDestino = tribRegraPerfilDestino;
	}
	public String getTribRegraCodPerfilDestino() {
		return TribRegraCodPerfilDestino;
	}
	public void setTribRegraCodPerfilDestino(String tribRegraCodPerfilDestino) {
		TribRegraCodPerfilDestino = tribRegraCodPerfilDestino;
	}
	public String getTribRegraCfop() {
		return tribRegraCfop;
	}
	public void setTribRegraCfop(String tribRegraCfop) {
		this.tribRegraCfop = tribRegraCfop;
	}
	public String getTribIcmsCst() {
		return tribIcmsCst;
	}
	public void setTribIcmsCst(String tribIcmsCst) {
		this.tribIcmsCst = tribIcmsCst;
	}
	public Double getTribIcmsAliq() {
		return tribIcmsAliq;
	}
	public void setTribIcmsAliq(Double tribIcmsAliq) {
		this.tribIcmsAliq = tribIcmsAliq;
	}
	public Double getTribIcmsReducao() {
		return tribIcmsReducao;
	}
	public void setTribIcmsReducao(Double tribIcmsReducao) {
		this.tribIcmsReducao = tribIcmsReducao;
	}
	public Double getTribIcmsStAliq() {
		return tribIcmsStAliq;
	}
	public void setTribIcmsStAliq(Double tribIcmsStAliq) {
		this.tribIcmsStAliq = tribIcmsStAliq;
	}
	public String getTribIcmsStPauta() {
		return tribIcmsStPauta;
	}
	public void setTribIcmsStPauta(String tribIcmsStPauta) {
		this.tribIcmsStPauta = tribIcmsStPauta;
	}
	public Double getTribIcmsStMva() {
		return tribIcmsStMva;
	}
	public void setTribIcmsStMva(Double tribIcmsStMva) {
		this.tribIcmsStMva = tribIcmsStMva;
	}
	public Double getTribFcpAliq() {
		return tribFcpAliq;
	}
	public void setTribFcpAliq(Double tribFcpAliq) {
		this.tribFcpAliq = tribFcpAliq;
	}
	public Double getTribDifalAliq() {
		return tribDifalAliq;
	}
	public void setTribDifalAliq(Double tribDifalAliq) {
		this.tribDifalAliq = tribDifalAliq;
	}
	public String getTribRegraPisCst() {
		return tribRegraPisCst;
	}
	public void setTribRegraPisCst(String tribRegraPisCst) {
		this.tribRegraPisCst = tribRegraPisCst;
	}
	public String getTribRegraPisCstE() {
		return tribRegraPisCstE;
	}
	public void setTribRegraPisCstE(String tribRegraPisCstE) {
		this.tribRegraPisCstE = tribRegraPisCstE;
	}
	public String getTribPisReducao() {
		return tribPisReducao;
	}
	public void setTribPisReducao(String tribPisReducao) {
		this.tribPisReducao = tribPisReducao;
	}
	public String getTribPisAliq() {
		return tribPisAliq;
	}
	public void setTribPisAliq(String tribPisAliq) {
		this.tribPisAliq = tribPisAliq;
	}
	public String getFisRegraCofinsCst() {
		return fisRegraCofinsCst;
	}
	public void setFisRegraCofinsCst(String fisRegraCofinsCst) {
		this.fisRegraCofinsCst = fisRegraCofinsCst;
	}
	public String getTribCofinsReducao() {
		return tribCofinsReducao;
	}
	public void setTribCofinsReducao(String tribCofinsReducao) {
		this.tribCofinsReducao = tribCofinsReducao;
	}
	public String getTribCofinAliq() {
		return tribCofinAliq;
	}
	public void setTribCofinAliq(String tribCofinAliq) {
		this.tribCofinAliq = tribCofinAliq;
	}
	public String getFisRegraValidadeInicio() {
		return fisRegraValidadeInicio;
	}
	public void setFisRegraValidadeInicio(String fisRegraValidadeInicio) {
		this.fisRegraValidadeInicio = fisRegraValidadeInicio;
	}
	public String getFisRegraValidadeFinal() {
		return fisRegraValidadeFinal;
	}
	public void setFisRegraValidadeFinal(String fisRegraValidadeFinal) {
		this.fisRegraValidadeFinal = fisRegraValidadeFinal;
	}
	public String getResultadoConsulta() {
		return resultadoConsulta;
	}
	public void setResultadoConsulta(String resultadoConsulta) {
		this.resultadoConsulta = resultadoConsulta;
	}
	@Override
	public String toString() {
		return "ProdutoCTS [Codigo=" + Codigo + ", EAN=" + EAN + ", produtoDescricao=" + produtoDescricao
				+ ", produtoDescricaoNota=" + produtoDescricaoNota + ", produtoDescricaoFornecedor="
				+ produtoDescricaoFornecedor + ", produtoDiasValidade=" + produtoDiasValidade
				+ ", embalagemUnitariaPesoBruto=" + embalagemUnitariaPesoBruto + ", embalagemUnitariaPesoLiquido="
				+ embalagemUnitariaPesoLiquido + ", embalagemUnitariaAltura=" + embalagemUnitariaAltura
				+ ", embalagemUnitariaLargura=" + embalagemUnitariaLargura + ", embalagemUnitariaProfundidade="
				+ embalagemUnitariaProfundidade + ", embalagemUnitariaId=" + embalagemUnitariaId
				+ ", embalagemUnitariaDescricao=" + embalagemUnitariaDescricao + ", embalagemUnitariaCapacidade="
				+ embalagemUnitariaCapacidade + ", embalagemUnitariaUnidadeMedida=" + embalagemUnitariaUnidadeMedida
				+ ", embalagemUnitariaUnidadeSigla=" + embalagemUnitariaUnidadeSigla + ", fabricanteId=" + fabricanteId
				+ ", fabricanteNome=" + fabricanteNome + ", fabricanteMarcaid=" + fabricanteMarcaid
				+ ", fabricanteMarcaDescricao=" + fabricanteMarcaDescricao + ", mercadologicaDepartamentoId="
				+ mercadologicaDepartamentoId + ", mercadologicaDepartamentoNome=" + mercadologicaDepartamentoNome
				+ ", mercadologicaSecaoId=" + mercadologicaSecaoId + ", mercadologicaSecaoNome="
				+ mercadologicaSecaoNome + ", mercadologicaGrupoId=" + mercadologicaGrupoId
				+ ", mercadologicaGrupoNome=" + mercadologicaGrupoNome + ", mercadologicaSubgrupoId="
				+ mercadologicaSubgrupoId + ", mercadologicaSubgrupoNome=" + mercadologicaSubgrupoNome + ", Ativo="
				+ Ativo + ", logEmbalagem=" + logEmbalagem + ", logDum14=" + logDum14 + ", logAlturaCm=" + logAlturaCm
				+ ", logLarguraCm=" + logLarguraCm + ", logProfundidadeCm=" + logProfundidadeCm + ", logPesoKg="
				+ logPesoKg + ", QtdEmbal=" + QtdEmbal + ", LogQtdLastro=" + LogQtdLastro + ", LogQtdCamadas="
				+ LogQtdCamadas + ", tributarioNcm=" + tributarioNcm + ", tributarioCest=" + tributarioCest
				+ ", tributarioFiguraFiscal=" + tributarioFiguraFiscal + ", CodigoBeneficioFiscalIcms="
				+ CodigoBeneficioFiscalIcms + ", CodigoBeneficioFiscalPisCofins=" + CodigoBeneficioFiscalPisCofins
				+ ", tribRegraDescricao=" + tribRegraDescricao + ", tribRegraUfOrigem=" + tribRegraUfOrigem
				+ ", TribRegraPerfilOrigem=" + TribRegraPerfilOrigem + ", TribRegraCodPerfilOrigem="
				+ TribRegraCodPerfilOrigem + ", tribRegraUfDestino=" + tribRegraUfDestino + ", TribRegraPerfilDestino="
				+ TribRegraPerfilDestino + ", TribRegraCodPerfilDestino=" + TribRegraCodPerfilDestino
				+ ", tribRegraCfop=" + tribRegraCfop + ", tribIcmsCst=" + tribIcmsCst + ", tribIcmsAliq=" + tribIcmsAliq
				+ ", tribIcmsReducao=" + tribIcmsReducao + ", tribIcmsStAliq=" + tribIcmsStAliq + ", tribIcmsStPauta="
				+ tribIcmsStPauta + ", tribIcmsStMva=" + tribIcmsStMva + ", tribFcpAliq=" + tribFcpAliq
				+ ", tribDifalAliq=" + tribDifalAliq + ", tribRegraPisCst=" + tribRegraPisCst + ", tribRegraPisCstE="
				+ tribRegraPisCstE + ", tribPisReducao=" + tribPisReducao + ", tribPisAliq=" + tribPisAliq
				+ ", fisRegraCofinsCst=" + fisRegraCofinsCst + ", tribCofinsReducao=" + tribCofinsReducao
				+ ", tribCofinAliq=" + tribCofinAliq + ", fisRegraValidadeInicio=" + fisRegraValidadeInicio
				+ ", fisRegraValidadeFinal=" + fisRegraValidadeFinal + ", resultadoConsulta=" + resultadoConsulta + "]";
	}
	
}
