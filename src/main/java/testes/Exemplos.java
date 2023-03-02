package testes;
public class Exemplos {
 // exemplos de json
    public static String jsonProd1 = "{\n" +
"    \"produto\": {\n" +
"        \"Codigo\": 54303,\n" +
"        \"EAN\": \"7891000100103\",\n" +
"        \"produtoDescricao\": \"LEITE CONDENSADO MOCA - NESTLE 395G LT\",\n" +
"        \"produtoDescricaoNota\": \"LEITE CONDENSADO MOCA - NESTLE 395G LT\",\n" +
"        \"produtoDescricaoFornecedor\": \"MOCA LeiCondTradlLataAbreFacil 48x395gBR\",\n" +
"        \"produtoDiasValidade\": \"\",\n" +
"        \"embalagemUnitariaPesoBruto\": \"438\",\n" +
"        \"embalagemUnitariaPesoLiquido\": \"0\",\n" +
"        \"embalagemUnitariaAltura\": \"0\",\n" +
"        \"embalagemUnitariaLargura\": \"0\",\n" +
"        \"embalagemUnitariaProfundidade\": \"0\",\n" +
"        \"embalagemUnitariaId\": 351,\n" +
"        \"embalagemUnitariaDescricao\": \"EMB 395 GR\",\n" +
"        \"embalagemUnitariaCapacidade\": \"395\",\n" +
"        \"embalagemUnitariaUnidadeMedida\": \"GRAMAS\",\n" +
"        \"embalagemUnitariaUnidadeSigla\": \"G\",\n" +
"        \"fabricanteId\": 689,\n" +
"        \"fabricanteNome\": \"MOCA - NESTLE\",\n" +
"        \"fabricanteMarcaid\": 687,\n" +
"        \"fabricanteMarcaDescricao\": \"MOCA  NESTLE\",\n" +
"        \"mercadologicaDepartamentoId\": 4,\n" +
"        \"mercadologicaDepartamentoNome\": \"MERCEARIA SECA\",\n" +
"        \"mercadologicaSecaoId\": 89,\n" +
"        \"mercadologicaSecaoNome\": \"LEITE CONDENSADO\",\n" +
"        \"mercadologicaGrupoId\": 506,\n" +
"        \"mercadologicaGrupoNome\": \"LEITE CONDENSADO\",\n" +
"        \"mercadologicaSubgrupoId\": 369,\n" +
"        \"mercadologicaSubgrupoNome\": \"LEITE CONDENSADO <= 1 Kg\\t\",\n" +
"        \"Ativo\": 1\n" +
"    },\n" +
"    \"dadosLogisticos\": [\n" +
"        {\n" +
"            \"logEmbalagem\": \"Caixa\",\n" +
"            \"logDum14\": \"\",\n" +
"            \"logAlturaCm\": \"0.00\",\n" +
"            \"logLarguraCm\": \"0.00\",\n" +
"            \"logProfundidadeCm\": \"0.00\",\n" +
"            \"logPesoKg\": \"0.00\",\n" +
"            \"QtdEmbal\": \"27\",\n" +
"            \"LogQtdLastro\": \"00000000.00\",\n" +
"            \"LogQtdCamadas\": \"00000000.00\"\n" +
"        }\n" +
"    ],\n" +
"    \"dadosTributarios\": [\n" +
"        {\n" +
"            \"tributarioNcm\": \"04029900\",\n" +
"            \"tributarioCest\": \"1702000\",\n" +
"            \"tributarioFiguraFiscal\": \"OPERACAO TRIBUTADA POR ST MVA 35,08-34,26-26,64-26,64 ALQ.17,50-17,00-12,00 DIFAL 5,50 01-50\",\n" +
"            \"CodigoBeneficioFiscalIcms\": \" N/A-NAO APLICAVEL\",\n" +
"            \"CodigoBeneficioFiscalPisCofins\": \"0-NAO APLICAVEL\"\n" +
"        }\n" +
"    ],\n" +
"    \"regrasTributarias\": [\n" +
"        {\n" +
"            \"tribRegraDescricao\": \"RS INTRA 1102 D051 ALQ.17,50 P50 C50\",\n" +
"            \"tribRegraUfOrigem\": \"RS\",\n" +
"            \"TribRegraPerfilOrigem\": \"INDUSTRIA\",\n" +
"            \"TribRegraCodPerfilOrigem\": \"1\",\n" +
"            \"tribRegraUfDestino\": \"RS\",\n" +
"            \"TribRegraPerfilDestino\": \"VAREJO LUCRO REAL\",\n" +
"            \"TribRegraCodPerfilDestino\": \"80\",\n" +
"            \"tribRegraCfop\": \"1102\",\n" +
"            \"tribIcmsCst\": \"51\",\n" +
"            \"tribIcmsAliq\": \"17\",\n" +
"            \"tribIcmsReducao\": \"29.41\",\n" +
"            \"tribIcmsStAliq\": \"0\",\n" +
"            \"tribIcmsStPauta\": \"\",\n" +
"            \"tribIcmsStMva\": \"0\",\n" +
"            \"tribFcpAliq\": \"0\",\n" +
"            \"tribDifalAliq\": \"0\",\n" +
"            \"tribRegraPisCst\": \"50\",\n" +
"            \"tribPisReducao\": \"\",\n" +
"            \"tribPisAliq\": \"\",\n" +
"            \"fisRegraCofinsCst\": \"50\",\n" +
"            \"tribCofinsReducao\": \"\",\n" +
"            \"tribCofinAliq\": \"\",\n" +
"            \"fisRegraValidadeInicio\": \"2022-01-01T00:00:00\",\n" +
"            \"fisRegraValidadeFinal\": \"1899-12-30T00:00:00\"\n" +
"        },\n" +
"        {\n" +
"            \"tribRegraDescricao\": \"RS INTER SC 2102 T000 ALQ.12,00 DFL 5,50 P50 C50\",\n" +
"            \"tribRegraUfOrigem\": \"SC\",\n" +
"            \"TribRegraPerfilOrigem\": \"INDUSTRIA\",\n" +
"            \"TribRegraCodPerfilOrigem\": \"1\",\n" +
"            \"tribRegraUfDestino\": \"RS\",\n" +
"            \"TribRegraPerfilDestino\": \"VAREJO LUCRO REAL\",\n" +
"            \"TribRegraCodPerfilDestino\": \"80\",\n" +
"            \"tribRegraCfop\": \"2102\",\n" +
"            \"tribIcmsCst\": \"00\",\n" +
"            \"tribIcmsAliq\": \"12\",\n" +
"            \"tribIcmsReducao\": \"0\",\n" +
"            \"tribIcmsStAliq\": \"0\",\n" +
"            \"tribIcmsStPauta\": \"\",\n" +
"            \"tribIcmsStMva\": \"0\",\n" +
"            \"tribFcpAliq\": \"0\",\n" +
"            \"tribDifalAliq\": \"0\",\n" +
"            \"tribRegraPisCst\": \"50\",\n" +
"            \"tribPisReducao\": \"\",\n" +
"            \"tribPisAliq\": \"\",\n" +
"            \"fisRegraCofinsCst\": \"50\",\n" +
"            \"tribCofinsReducao\": \"\",\n" +
"            \"tribCofinAliq\": \"\",\n" +
"            \"fisRegraValidadeInicio\": \"2021-04-01T00:00:00\",\n" +
"            \"fisRegraValidadeFinal\": \"1899-12-30T00:00:00\"\n" +
"        },\n" +
"        {\n" +
"            \"tribRegraDescricao\": \"RS INTRA 5102 T000 ALQ.17,50 P01 C01\",\n" +
"            \"tribRegraUfOrigem\": \"RS\",\n" +
"            \"TribRegraPerfilOrigem\": \"VAREJO LUCRO REAL\",\n" +
"            \"TribRegraCodPerfilOrigem\": \"80\",\n" +
"            \"tribRegraUfDestino\": \"RS\",\n" +
"            \"TribRegraPerfilDestino\": \"CONSUMIDOR NAO CONTRIBUINTE\",\n" +
"            \"TribRegraCodPerfilDestino\": \"53\",\n" +
"            \"tribRegraCfop\": \"5102\",\n" +
"            \"tribIcmsCst\": \"00\",\n" +
"            \"tribIcmsAliq\": \"17\",\n" +
"            \"tribIcmsReducao\": \"0\",\n" +
"            \"tribIcmsStAliq\": \"0\",\n" +
"            \"tribIcmsStPauta\": \"\",\n" +
"            \"tribIcmsStMva\": \"0\",\n" +
"            \"tribFcpAliq\": \"0\",\n" +
"            \"tribDifalAliq\": \"0\",\n" +
"            \"tribRegraPisCst\": \"01\",\n" +
"            \"tribPisReducao\": \"\",\n" +
"            \"tribPisAliq\": \"\",\n" +
"            \"fisRegraCofinsCst\": \"01\",\n" +
"            \"tribCofinsReducao\": \"\",\n" +
"            \"tribCofinAliq\": \"\",\n" +
"            \"fisRegraValidadeInicio\": \"2022-01-01T00:00:00\",\n" +
"            \"fisRegraValidadeFinal\": \"1899-12-30T00:00:00\"\n" +
"        }\n" +
"    ],\n" +
"    \"resultadoConsulta\": \"000-Consulta Efetuada com Sucesso\"\n" +
"}";

    public static String jsonProd2 = "{\n" +
"    \"produto\": {\n" +
"        \"Codigo\": 84249,\n" +
"        \"EAN\": \"7898187830021\",\n" +
"        \"produtoDescricao\": \"ACUCAR CRISTAL SANTA ISABEL 2KG\",\n" +
"        \"produtoDescricaoNota\": \"ACUCAR CRISTAL SANTA ISABEL 2KG\",\n" +
"        \"produtoDescricaoFornecedor\": \"ACUCAR CRISTAL SANTA ISABEL 2KG\",\n" +
"        \"produtoDiasValidade\": \"730\",\n" +
"        \"embalagemUnitariaPesoBruto\": \"0\",\n" +
"        \"embalagemUnitariaPesoLiquido\": \"0\",\n" +
"        \"embalagemUnitariaAltura\": \"\",\n" +
"        \"embalagemUnitariaLargura\": \"\",\n" +
"        \"embalagemUnitariaProfundidade\": \"\",\n" +
"        \"embalagemUnitariaId\": 715,\n" +
"        \"embalagemUnitariaDescricao\": \"EMB 2 KG\",\n" +
"        \"embalagemUnitariaCapacidade\": \"2\",\n" +
"        \"embalagemUnitariaUnidadeMedida\": \"Kilo\",\n" +
"        \"embalagemUnitariaUnidadeSigla\": \"KG\",\n" +
"        \"fabricanteId\": 0,\n" +
"        \"fabricanteNome\": \"\",\n" +
"        \"fabricanteMarcaid\": 2655,\n" +
"        \"fabricanteMarcaDescricao\": \"SANTA ISABEL\",\n" +
"        \"mercadologicaDepartamentoId\": 4,\n" +
"        \"mercadologicaDepartamentoNome\": \"MERCEARIA SECA\",\n" +
"        \"mercadologicaSecaoId\": 11,\n" +
"        \"mercadologicaSecaoNome\": \"ACUCAR\",\n" +
"        \"mercadologicaGrupoId\": 40,\n" +
"        \"mercadologicaGrupoNome\": \"ACUCAR\",\n" +
"        \"mercadologicaSubgrupoId\": 689,\n" +
"        \"mercadologicaSubgrupoNome\": \"ACUCAR CRISTAL < = 2KG\",\n" +
"        \"Ativo\": 1\n" +
"    },\n" +
"    \"dadosLogisticos\": [\n" +
"        {\n" +
"            \"logEmbalagem\": \"Caixa\",\n" +
"            \"logDum14\": \"\",\n" +
"            \"logAlturaCm\": \"16.00\",\n" +
"            \"logLarguraCm\": \"26.00\",\n" +
"            \"logProfundidadeCm\": \"64.00\",\n" +
"            \"logPesoKg\": \"0.00\",\n" +
"            \"QtdEmbal\": \"10\",\n" +
"            \"LogQtdLastro\": \"00000000.00\",\n" +
"            \"LogQtdCamadas\": \"00000000.00\"\n" +
"        },\n" +
"        {\n" +
"            \"logEmbalagem\": \"Lastro\",\n" +
"            \"logDum14\": \"\",\n" +
"            \"logAlturaCm\": \"0.00\",\n" +
"            \"logLarguraCm\": \"0.00\",\n" +
"            \"logProfundidadeCm\": \"0.00\",\n" +
"            \"logPesoKg\": \"0.00\",\n" +
"            \"QtdEmbal\": \"60\",\n" +
"            \"LogQtdLastro\": \"6\",\n" +
"            \"LogQtdCamadas\": \"00000000.00\"\n" +
"        },\n" +
"        {\n" +
"            \"logEmbalagem\": \"Pallet\",\n" +
"            \"logDum14\": \"\",\n" +
"            \"logAlturaCm\": \"0.00\",\n" +
"            \"logLarguraCm\": \"0.00\",\n" +
"            \"logProfundidadeCm\": \"0.00\",\n" +
"            \"logPesoKg\": \"0.00\",\n" +
"            \"QtdEmbal\": \"600\",\n" +
"            \"LogQtdLastro\": \"6\",\n" +
"            \"LogQtdCamadas\": \"10\"\n" +
"        }\n" +
"    ],\n" +
"    \"dadosTributarios\": [\n" +
"        {\n" +
"            \"tributarioNcm\": \"17019900\",\n" +
"            \"tributarioCest\": \"1710100\",\n" +
"            \"tributarioFiguraFiscal\": \"OPERACAO TRIBUTADA POR ST MVA 26,25-26,25-26,25-26,25 ALQ.17,50-17,00-12,00 06-73\",\n" +
"            \"CodigoBeneficioFiscalIcms\": \"RS051601-LIVRO I,23,II -CESTA BASICA DE ALIMETOS\",\n" +
"            \"CodigoBeneficioFiscalPisCofins\": \"124-ACUCAR CLASSIFICADO NOS CODIGOS 1701.14.00 E 1701.99.00 DA TIPI\"\n" +
"        }\n" +
"    ],\n" +
"    \"regrasTributarias\": [\n" +
"        {\n" +
"            \"tribRegraDescricao\": \"RS INTRA 1102  ALQ.17,50 RED.60,00 P73 C73\",\n" +
"            \"tribRegraUfOrigem\": \"RS\",\n" +
"            \"TribRegraPerfilOrigem\": \"INDUSTRIA\",\n" +
"            \"TribRegraCodPerfilOrigem\": \"1\",\n" +
"            \"tribRegraUfDestino\": \"RS\",\n" +
"            \"TribRegraPerfilDestino\": \"VAREJO LUCRO REAL\",\n" +
"            \"TribRegraCodPerfilDestino\": \"80\",\n" +
"            \"tribRegraCfop\": \"1102\",\n" +
"            \"tribIcmsCst\": \"20\",\n" +
"            \"tribIcmsAliq\": \"17\",\n" +
"            \"tribIcmsReducao\": \"58.83\",\n" +
"            \"tribIcmsStAliq\": \"0\",\n" +
"            \"tribIcmsStPauta\": \"\",\n" +
"            \"tribIcmsStMva\": \"0\",\n" +
"            \"tribFcpAliq\": \"0\",\n" +
"            \"tribDifalAliq\": \"0\",\n" +
"            \"tribRegraPisCst\": \"73\",\n" +
"            \"tribPisReducao\": \"\",\n" +
"            \"tribPisAliq\": \"\",\n" +
"            \"fisRegraCofinsCst\": \"73\",\n" +
"            \"tribCofinsReducao\": \"\",\n" +
"            \"tribCofinAliq\": \"\",\n" +
"            \"fisRegraValidadeInicio\": \"2022-01-01T00:00:00\",\n" +
"            \"fisRegraValidadeFinal\": \"1899-12-30T00:00:00\"\n" +
"        },\n" +
"        {\n" +
"            \"tribRegraDescricao\": \"RS INTER SC 2102  ALQ.12,00 RED.41,67 P73 C73\",\n" +
"            \"tribRegraUfOrigem\": \"SC\",\n" +
"            \"TribRegraPerfilOrigem\": \"INDUSTRIA\",\n" +
"            \"TribRegraCodPerfilOrigem\": \"1\",\n" +
"            \"tribRegraUfDestino\": \"RS\",\n" +
"            \"TribRegraPerfilDestino\": \"VAREJO LUCRO REAL\",\n" +
"            \"TribRegraCodPerfilDestino\": \"80\",\n" +
"            \"tribRegraCfop\": \"2102\",\n" +
"            \"tribIcmsCst\": \"20\",\n" +
"            \"tribIcmsAliq\": \"12\",\n" +
"            \"tribIcmsReducao\": \"41.67\",\n" +
"            \"tribIcmsStAliq\": \"0\",\n" +
"            \"tribIcmsStPauta\": \"\",\n" +
"            \"tribIcmsStMva\": \"0\",\n" +
"            \"tribFcpAliq\": \"0\",\n" +
"            \"tribDifalAliq\": \"0\",\n" +
"            \"tribRegraPisCst\": \"73\",\n" +
"            \"tribPisReducao\": \"0\",\n" +
"            \"tribPisAliq\": \"0\",\n" +
"            \"fisRegraCofinsCst\": \"73\",\n" +
"            \"tribCofinsReducao\": \"0\",\n" +
"            \"tribCofinAliq\": \"0\",\n" +
"            \"fisRegraValidadeInicio\": \"2018-01-01T00:00:00\",\n" +
"            \"fisRegraValidadeFinal\": \"1899-12-30T00:00:00\"\n" +
"        },\n" +
"        {\n" +
"            \"tribRegraDescricao\": \"RS INTRA 5102  ALQ.17,50 RED.60,00 P06 C06\",\n" +
"            \"tribRegraUfOrigem\": \"RS\",\n" +
"            \"TribRegraPerfilOrigem\": \"VAREJO LUCRO REAL\",\n" +
"            \"TribRegraCodPerfilOrigem\": \"80\",\n" +
"            \"tribRegraUfDestino\": \"RS\",\n" +
"            \"TribRegraPerfilDestino\": \"CONSUMIDOR NAO CONTRIBUINTE\",\n" +
"            \"TribRegraCodPerfilDestino\": \"53\",\n" +
"            \"tribRegraCfop\": \"5102\",\n" +
"            \"tribIcmsCst\": \"20\",\n" +
"            \"tribIcmsAliq\": \"18\",\n" +
"            \"tribIcmsReducao\": \"33.33\",\n" +
"            \"tribIcmsStAliq\": \"0\",\n" +
"            \"tribIcmsStPauta\": \"\",\n" +
"            \"tribIcmsStMva\": \"0\",\n" +
"            \"tribFcpAliq\": \"0\",\n" +
"            \"tribDifalAliq\": \"0\",\n" +
"            \"tribRegraPisCst\": \"06\",\n" +
"            \"tribPisReducao\": \"\",\n" +
"            \"tribPisAliq\": \"\",\n" +
"            \"fisRegraCofinsCst\": \"06\",\n" +
"            \"tribCofinsReducao\": \"\",\n" +
"            \"tribCofinAliq\": \"\",\n" +
"            \"fisRegraValidadeInicio\": \"2022-01-01T00:00:00\",\n" +
"            \"fisRegraValidadeFinal\": \"1899-12-30T00:00:00\"\n" +
"        }\n" +
"    ],\n" +
"    \"resultadoConsulta\": \"000-Consulta Efetuada com Sucesso\"\n" +
"}";
    
    
    public static String jsonProd3 = "{\r\n"
    		+ "    \"produto\": {\r\n"
    		+ "        \"Codigo\": 133477,\r\n"
    		+ "        \"EAN\": \"7890291410632\",\r\n"
    		+ "        \"produtoDescricao\": \"FLOR FELTRIN 1UN JIBOIA\",\r\n"
    		+ "        \"produtoDescricaoNota\": \"FLOR FELTRIN 1UN JIBOIA\",\r\n"
    		+ "        \"produtoDescricaoFornecedor\": \"FLOR JIBOIA P21\",\r\n"
    		+ "        \"produtoDiasValidade\": \"\",\r\n"
    		+ "        \"embalagemUnitariaPesoBruto\": \"0\",\r\n"
    		+ "        \"embalagemUnitariaPesoLiquido\": \"0\",\r\n"
    		+ "        \"embalagemUnitariaAltura\": \"0\",\r\n"
    		+ "        \"embalagemUnitariaLargura\": \"0\",\r\n"
    		+ "        \"embalagemUnitariaProfundidade\": \"0\",\r\n"
    		+ "        \"embalagemUnitariaId\": 581,\r\n"
    		+ "        \"embalagemUnitariaDescricao\": \"EMB 1 Un\",\r\n"
    		+ "        \"embalagemUnitariaCapacidade\": \"1\",\r\n"
    		+ "        \"embalagemUnitariaUnidadeMedida\": \"Unidade\",\r\n"
    		+ "        \"embalagemUnitariaUnidadeSigla\": \"Un\",\r\n"
    		+ "        \"fabricanteId\": 694,\r\n"
    		+ "        \"fabricanteNome\": \"Nao Identificado\",\r\n"
    		+ "        \"fabricanteMarcaid\": 3777,\r\n"
    		+ "        \"fabricanteMarcaDescricao\": \"FELTRIN \",\r\n"
    		+ "        \"mercadologicaDepartamentoId\": 6,\r\n"
    		+ "        \"mercadologicaDepartamentoNome\": \"BAZAR\",\r\n"
    		+ "        \"mercadologicaSecaoId\": 127,\r\n"
    		+ "        \"mercadologicaSecaoNome\": \"HORTA E JARDIM\",\r\n"
    		+ "        \"mercadologicaGrupoId\": 716,\r\n"
    		+ "        \"mercadologicaGrupoNome\": \"FOLHAGENS E FLORES\",\r\n"
    		+ "        \"mercadologicaSubgrupoId\": 1722,\r\n"
    		+ "        \"mercadologicaSubgrupoNome\": \"FLOR BULBO MUDA ORNAMENTAL\",\r\n"
    		+ "        \"Ativo\": 1\r\n"
    		+ "    },\r\n"
    		+ "    \"dadosLogisticos\": [],\r\n"
    		+ "    \"dadosTributarios\": [\r\n"
    		+ "        {\r\n"
    		+ "            \"tributarioNcm\": \"06012000\",\r\n"
    		+ "            \"tributarioCest\": \"0\",\r\n"
    		+ "            \"tributarioFiguraFiscal\": \"Operação Isenta PC 01-50 \",\r\n"
    		+ "            \"CodigoBeneficioFiscalIcms\": \"RS051017-LIVRO I,9,XVIII -FLORES NATURAIS\",\r\n"
    		+ "            \"CodigoBeneficioFiscalPisCofins\": \"0-NAO APLICAVEL\"\r\n"
    		+ "        }\r\n"
    		+ "    ],\r\n"
    		+ "    \"regrasTributarias\": [\r\n"
    		+ "        {\r\n"
    		+ "            \"tribRegraDescricao\": \"RS INTRA 5102 I040 P01 C01\",\r\n"
    		+ "            \"tribRegraUfOrigem\": \"RS\",\r\n"
    		+ "            \"TribRegraPerfilOrigem\": \"VAREJO LUCRO REAL\",\r\n"
    		+ "            \"TribRegraCodPerfilOrigem\": \"80\",\r\n"
    		+ "            \"tribRegraUfDestino\": \"RS\",\r\n"
    		+ "            \"TribRegraPerfilDestino\": \"CONSUMIDOR NAO CONTRIBUINTE\",\r\n"
    		+ "            \"TribRegraCodPerfilDestino\": \"53\",\r\n"
    		+ "            \"tribRegraCfop\": \"5102\",\r\n"
    		+ "            \"tribIcmsCst\": \"40\",\r\n"
    		+ "            \"tribIcmsAliq\": \"0\",\r\n"
    		+ "            \"tribIcmsReducao\": \"0\",\r\n"
    		+ "            \"tribIcmsStAliq\": \"0\",\r\n"
    		+ "            \"tribIcmsStPauta\": \"\",\r\n"
    		+ "            \"tribIcmsStMva\": \"0\",\r\n"
    		+ "            \"tribFcpAliq\": \"0\",\r\n"
    		+ "            \"tribDifalAliq\": \"0\",\r\n"
    		+ "            \"tribRegraPisCst\": \"01\",\r\n"
    		+ "            \"tribPisReducao\": \"0\",\r\n"
    		+ "            \"tribPisAliq\": \"0\",\r\n"
    		+ "            \"fisRegraCofinsCst\": \"01\",\r\n"
    		+ "            \"tribCofinsReducao\": \"0\",\r\n"
    		+ "            \"tribCofinAliq\": \"0\",\r\n"
    		+ "            \"fisRegraValidadeInicio\": \"2018-01-01T00:00:00\",\r\n"
    		+ "            \"fisRegraValidadeFinal\": \"1899-12-30T00:00:00\"\r\n"
    		+ "        },\r\n"
    		+ "        {\r\n"
    		+ "            \"tribRegraDescricao\": \"RS INTRA 1102 I040 P50 C50\",\r\n"
    		+ "            \"tribRegraUfOrigem\": \"RS\",\r\n"
    		+ "            \"TribRegraPerfilOrigem\": \"INDUSTRIA\",\r\n"
    		+ "            \"TribRegraCodPerfilOrigem\": \"1\",\r\n"
    		+ "            \"tribRegraUfDestino\": \"RS\",\r\n"
    		+ "            \"TribRegraPerfilDestino\": \"VAREJO LUCRO REAL\",\r\n"
    		+ "            \"TribRegraCodPerfilDestino\": \"80\",\r\n"
    		+ "            \"tribRegraCfop\": \"1102\",\r\n"
    		+ "            \"tribIcmsCst\": \"40\",\r\n"
    		+ "            \"tribIcmsAliq\": \"0\",\r\n"
    		+ "            \"tribIcmsReducao\": \"0\",\r\n"
    		+ "            \"tribIcmsStAliq\": \"0\",\r\n"
    		+ "            \"tribIcmsStPauta\": \"\",\r\n"
    		+ "            \"tribIcmsStMva\": \"0\",\r\n"
    		+ "            \"tribFcpAliq\": \"0\",\r\n"
    		+ "            \"tribDifalAliq\": \"0\",\r\n"
    		+ "            \"tribRegraPisCst\": \"50\",\r\n"
    		+ "            \"tribPisReducao\": \"0\",\r\n"
    		+ "            \"tribPisAliq\": \"0\",\r\n"
    		+ "            \"fisRegraCofinsCst\": \"50\",\r\n"
    		+ "            \"tribCofinsReducao\": \"0\",\r\n"
    		+ "            \"tribCofinAliq\": \"0\",\r\n"
    		+ "            \"fisRegraValidadeInicio\": \"1899-12-30T00:00:00\",\r\n"
    		+ "            \"fisRegraValidadeFinal\": \"1899-12-30T00:00:00\"\r\n"
    		+ "        },\r\n"
    		+ "        {\r\n"
    		+ "            \"tribRegraDescricao\": \"RS INTER 2102 I040 P50 C50 \",\r\n"
    		+ "            \"tribRegraUfOrigem\": \"SC\",\r\n"
    		+ "            \"TribRegraPerfilOrigem\": \"INDUSTRIA\",\r\n"
    		+ "            \"TribRegraCodPerfilOrigem\": \"1\",\r\n"
    		+ "            \"tribRegraUfDestino\": \"RS\",\r\n"
    		+ "            \"TribRegraPerfilDestino\": \"VAREJO LUCRO REAL\",\r\n"
    		+ "            \"TribRegraCodPerfilDestino\": \"80\",\r\n"
    		+ "            \"tribRegraCfop\": \"2102\",\r\n"
    		+ "            \"tribIcmsCst\": \"40\",\r\n"
    		+ "            \"tribIcmsAliq\": \"0\",\r\n"
    		+ "            \"tribIcmsReducao\": \"0\",\r\n"
    		+ "            \"tribIcmsStAliq\": \"0\",\r\n"
    		+ "            \"tribIcmsStPauta\": \"\",\r\n"
    		+ "            \"tribIcmsStMva\": \"0\",\r\n"
    		+ "            \"tribFcpAliq\": \"0\",\r\n"
    		+ "            \"tribDifalAliq\": \"0\",\r\n"
    		+ "            \"tribRegraPisCst\": \"50\",\r\n"
    		+ "            \"tribPisReducao\": \"0\",\r\n"
    		+ "            \"tribPisAliq\": \"0\",\r\n"
    		+ "            \"fisRegraCofinsCst\": \"50\",\r\n"
    		+ "            \"tribCofinsReducao\": \"0\",\r\n"
    		+ "            \"tribCofinAliq\": \"0\",\r\n"
    		+ "            \"fisRegraValidadeInicio\": \"1899-12-30T00:00:00\",\r\n"
    		+ "            \"fisRegraValidadeFinal\": \"1899-12-30T00:00:00\"\r\n"
    		+ "        }\r\n"
    		+ "    ],\r\n"
    		+ "    \"resultadoConsulta\": \"000-Consulta Efetuada com Sucesso\"\r\n"
    		+ "}";
    
    public static String jsonProd4 = "{\r\n"
    		+ "    \"produto\": {\r\n"
    		+ "        \"Codigo\": 63941,\r\n"
    		+ "        \"EAN\": \"7896621710083\",\r\n"
    		+ "        \"produtoDescricao\": \"ERVA MATE SABADIN 500G MOIDA GROSSA LAMIN\",\r\n"
    		+ "        \"produtoDescricaoNota\": \"ERVA MATE SABADIN 500G MOIDA GROSSA LAMIN\",\r\n"
    		+ "        \"produtoDescricaoFornecedor\": \"ERVA MATE SABADIN MOIDA GROSSA LAMINADA\",\r\n"
    		+ "        \"produtoDiasValidade\": \"\",\r\n"
    		+ "        \"embalagemUnitariaPesoBruto\": \"0\",\r\n"
    		+ "        \"embalagemUnitariaPesoLiquido\": \"0\",\r\n"
    		+ "        \"embalagemUnitariaAltura\": \"0\",\r\n"
    		+ "        \"embalagemUnitariaLargura\": \"0\",\r\n"
    		+ "        \"embalagemUnitariaProfundidade\": \"0\",\r\n"
    		+ "        \"embalagemUnitariaId\": 143,\r\n"
    		+ "        \"embalagemUnitariaDescricao\": \"EMB 500 GR\",\r\n"
    		+ "        \"embalagemUnitariaCapacidade\": \"500\",\r\n"
    		+ "        \"embalagemUnitariaUnidadeMedida\": \"GRAMAS\",\r\n"
    		+ "        \"embalagemUnitariaUnidadeSigla\": \"G\",\r\n"
    		+ "        \"fabricanteId\": 1055,\r\n"
    		+ "        \"fabricanteNome\": \"SABADIN\",\r\n"
    		+ "        \"fabricanteMarcaid\": 1737,\r\n"
    		+ "        \"fabricanteMarcaDescricao\": \"SABADIN\",\r\n"
    		+ "        \"mercadologicaDepartamentoId\": 4,\r\n"
    		+ "        \"mercadologicaDepartamentoNome\": \"MERCEARIA SECA\",\r\n"
    		+ "        \"mercadologicaSecaoId\": 81,\r\n"
    		+ "        \"mercadologicaSecaoNome\": \"ERVA CHIMARRAO\",\r\n"
    		+ "        \"mercadologicaGrupoId\": 465,\r\n"
    		+ "        \"mercadologicaGrupoNome\": \"ERVA MATE\",\r\n"
    		+ "        \"mercadologicaSubgrupoId\": 329,\r\n"
    		+ "        \"mercadologicaSubgrupoNome\": \"ERVA MATE\",\r\n"
    		+ "        \"Ativo\": 1\r\n"
    		+ "    },\r\n"
    		+ "    \"dadosLogisticos\": [],\r\n"
    		+ "    \"dadosTributarios\": [\r\n"
    		+ "        {\r\n"
    		+ "            \"tributarioNcm\": \"09030090\",\r\n"
    		+ "            \"tributarioCest\": \"1709800\",\r\n"
    		+ "            \"tributarioFiguraFiscal\": \"OPERACAO TRIBUTADA POR ST MVA ALQ.12,00 01-50\",\r\n"
    		+ "            \"CodigoBeneficioFiscalIcms\": \"RS051656-LIVRO I,23,LX.ERVA MATE\",\r\n"
    		+ "            \"CodigoBeneficioFiscalPisCofins\": \"0-NAO APLICAVEL\"\r\n"
    		+ "        }\r\n"
    		+ "    ],\r\n"
    		+ "    \"regrasTributarias\": [\r\n"
    		+ "        {\r\n"
    		+ "            \"tribRegraDescricao\": \"RS INTRA 1102  ALQ.12,00 RED.41,67 P50 C50\",\r\n"
    		+ "            \"tribRegraUfOrigem\": \"RS\",\r\n"
    		+ "            \"TribRegraPerfilOrigem\": \"INDUSTRIA\",\r\n"
    		+ "            \"TribRegraCodPerfilOrigem\": \"1\",\r\n"
    		+ "            \"tribRegraUfDestino\": \"RS\",\r\n"
    		+ "            \"TribRegraPerfilDestino\": \"VAREJO LUCRO REAL\",\r\n"
    		+ "            \"TribRegraCodPerfilDestino\": \"80\",\r\n"
    		+ "            \"tribRegraCfop\": \"1102\",\r\n"
    		+ "            \"tribIcmsCst\": \"20\",\r\n"
    		+ "            \"tribIcmsAliq\": \"12\",\r\n"
    		+ "            \"tribIcmsReducao\": \"41.67\",\r\n"
    		+ "            \"tribIcmsStAliq\": \"0\",\r\n"
    		+ "            \"tribIcmsStPauta\": \"\",\r\n"
    		+ "            \"tribIcmsStMva\": \"0\",\r\n"
    		+ "            \"tribFcpAliq\": \"0\",\r\n"
    		+ "            \"tribDifalAliq\": \"0\",\r\n"
    		+ "            \"tribRegraPisCst\": \"50\",\r\n"
    		+ "            \"tribPisReducao\": \"0\",\r\n"
    		+ "            \"tribPisAliq\": \"0\",\r\n"
    		+ "            \"fisRegraCofinsCst\": \"50\",\r\n"
    		+ "            \"tribCofinsReducao\": \"0\",\r\n"
    		+ "            \"tribCofinAliq\": \"0\",\r\n"
    		+ "            \"fisRegraValidadeInicio\": \"2020-01-01T00:00:00\",\r\n"
    		+ "            \"fisRegraValidadeFinal\": \"1899-12-30T00:00:00\"\r\n"
    		+ "        },\r\n"
    		+ "        {\r\n"
    		+ "            \"tribRegraDescricao\": \"RS INTER SC 2102  ALQ.12,00 RED.41,67 P50 C50\",\r\n"
    		+ "            \"tribRegraUfOrigem\": \"SC\",\r\n"
    		+ "            \"TribRegraPerfilOrigem\": \"INDUSTRIA\",\r\n"
    		+ "            \"TribRegraCodPerfilOrigem\": \"1\",\r\n"
    		+ "            \"tribRegraUfDestino\": \"RS\",\r\n"
    		+ "            \"TribRegraPerfilDestino\": \"VAREJO LUCRO REAL\",\r\n"
    		+ "            \"TribRegraCodPerfilDestino\": \"80\",\r\n"
    		+ "            \"tribRegraCfop\": \"2102\",\r\n"
    		+ "            \"tribIcmsCst\": \"20\",\r\n"
    		+ "            \"tribIcmsAliq\": \"12\",\r\n"
    		+ "            \"tribIcmsReducao\": \"41.67\",\r\n"
    		+ "            \"tribIcmsStAliq\": \"0\",\r\n"
    		+ "            \"tribIcmsStPauta\": \"\",\r\n"
    		+ "            \"tribIcmsStMva\": \"0\",\r\n"
    		+ "            \"tribFcpAliq\": \"0\",\r\n"
    		+ "            \"tribDifalAliq\": \"0\",\r\n"
    		+ "            \"tribRegraPisCst\": \"50\",\r\n"
    		+ "            \"tribPisReducao\": \"0\",\r\n"
    		+ "            \"tribPisAliq\": \"0\",\r\n"
    		+ "            \"fisRegraCofinsCst\": \"50\",\r\n"
    		+ "            \"tribCofinsReducao\": \"0\",\r\n"
    		+ "            \"tribCofinAliq\": \"0\",\r\n"
    		+ "            \"fisRegraValidadeInicio\": \"2020-01-01T00:00:00\",\r\n"
    		+ "            \"fisRegraValidadeFinal\": \"1899-12-30T00:00:00\"\r\n"
    		+ "        },\r\n"
    		+ "        {\r\n"
    		+ "            \"tribRegraDescricao\": \"RS INTRA 5102  ALQ.12,00 RED.41,67 P01 C01\",\r\n"
    		+ "            \"tribRegraUfOrigem\": \"RS\",\r\n"
    		+ "            \"TribRegraPerfilOrigem\": \"VAREJO LUCRO REAL\",\r\n"
    		+ "            \"TribRegraCodPerfilOrigem\": \"80\",\r\n"
    		+ "            \"tribRegraUfDestino\": \"RS\",\r\n"
    		+ "            \"TribRegraPerfilDestino\": \"CONSUMIDOR NAO CONTRIBUINTE\",\r\n"
    		+ "            \"TribRegraCodPerfilDestino\": \"53\",\r\n"
    		+ "            \"tribRegraCfop\": \"5102\",\r\n"
    		+ "            \"tribIcmsCst\": \"20\",\r\n"
    		+ "            \"tribIcmsAliq\": \"12\",\r\n"
    		+ "            \"tribIcmsReducao\": \"41.67\",\r\n"
    		+ "            \"tribIcmsStAliq\": \"0\",\r\n"
    		+ "            \"tribIcmsStPauta\": \"\",\r\n"
    		+ "            \"tribIcmsStMva\": \"0\",\r\n"
    		+ "            \"tribFcpAliq\": \"0\",\r\n"
    		+ "            \"tribDifalAliq\": \"0\",\r\n"
    		+ "            \"tribRegraPisCst\": \"01\",\r\n"
    		+ "            \"tribPisReducao\": \"\",\r\n"
    		+ "            \"tribPisAliq\": \"\",\r\n"
    		+ "            \"fisRegraCofinsCst\": \"01\",\r\n"
    		+ "            \"tribCofinsReducao\": \"\",\r\n"
    		+ "            \"tribCofinAliq\": \"\",\r\n"
    		+ "            \"fisRegraValidadeInicio\": \"2022-01-01T00:00:00\",\r\n"
    		+ "            \"fisRegraValidadeFinal\": \"1899-12-30T00:00:00\"\r\n"
    		+ "        }\r\n"
    		+ "    ],\r\n"
    		+ "    \"resultadoConsulta\": \"000-Consulta Efetuada com Sucesso\"\r\n"
    		+ "}";
    
    public static String jsonProd5 = "{\r\n"
    		+ "    \"produto\": {\r\n"
    		+ "        \"Codigo\": 118052,\r\n"
    		+ "        \"EAN\": \"7891000031926\",\r\n"
    		+ "        \"produtoDescricao\": \"MACAR INST MAGGI 85G LAMEM PICANHA\",\r\n"
    		+ "        \"produtoDescricaoNota\": \"MACAR INST MAGGI 85G LAMEM PICANHA\",\r\n"
    		+ "        \"produtoDescricaoFornecedor\": \"MACARRAO MAGGI LAMEM PICANHA 48X85G R:416332\",\r\n"
    		+ "        \"produtoDiasValidade\": \"\",\r\n"
    		+ "        \"embalagemUnitariaPesoBruto\": \"0\",\r\n"
    		+ "        \"embalagemUnitariaPesoLiquido\": \"0\",\r\n"
    		+ "        \"embalagemUnitariaAltura\": \"\",\r\n"
    		+ "        \"embalagemUnitariaLargura\": \"\",\r\n"
    		+ "        \"embalagemUnitariaProfundidade\": \"\",\r\n"
    		+ "        \"embalagemUnitariaId\": 156,\r\n"
    		+ "        \"embalagemUnitariaDescricao\": \"EMB 85GR\",\r\n"
    		+ "        \"embalagemUnitariaCapacidade\": \"85\",\r\n"
    		+ "        \"embalagemUnitariaUnidadeMedida\": \"GRAMAS\",\r\n"
    		+ "        \"embalagemUnitariaUnidadeSigla\": \"G\",\r\n"
    		+ "        \"fabricanteId\": 0,\r\n"
    		+ "        \"fabricanteNome\": \"\",\r\n"
    		+ "        \"fabricanteMarcaid\": 835,\r\n"
    		+ "        \"fabricanteMarcaDescricao\": \"MAGGI\",\r\n"
    		+ "        \"mercadologicaDepartamentoId\": 4,\r\n"
    		+ "        \"mercadologicaDepartamentoNome\": \"MERCEARIA SECA\",\r\n"
    		+ "        \"mercadologicaSecaoId\": 92,\r\n"
    		+ "        \"mercadologicaSecaoNome\": \"MASSAS\",\r\n"
    		+ "        \"mercadologicaGrupoId\": 511,\r\n"
    		+ "        \"mercadologicaGrupoNome\": \"MACARRAO INSTANTANEO\",\r\n"
    		+ "        \"mercadologicaSubgrupoId\": 374,\r\n"
    		+ "        \"mercadologicaSubgrupoNome\": \"MACARRAO INSTANTANEO\",\r\n"
    		+ "        \"Ativo\": 1\r\n"
    		+ "    },\r\n"
    		+ "    \"dadosLogisticos\": [],\r\n"
    		+ "    \"dadosTributarios\": [\r\n"
    		+ "        {\r\n"
    		+ "            \"tributarioNcm\": \"19023000\",\r\n"
    		+ "            \"tributarioCest\": \"1704700\",\r\n"
    		+ "            \"tributarioFiguraFiscal\": \"OPERAÇÃO TRIBUTADA INTEGRAL ALQ.12 PC 73-06\",\r\n"
    		+ "            \"CodigoBeneficioFiscalIcms\": \" N/A-NAO APLICAVEL\",\r\n"
    		+ "            \"CodigoBeneficioFiscalPisCofins\": \"119-MASSAS ALIMENTICIAS CLASSIFICADAS NA POSICAO 19.02 DA TIPI.\"\r\n"
    		+ "        }\r\n"
    		+ "    ],\r\n"
    		+ "    \"regrasTributarias\": [\r\n"
    		+ "        {\r\n"
    		+ "            \"tribRegraDescricao\": \"RS INTRA 1102 T000 ALQ.12,00 P73 C73\",\r\n"
    		+ "            \"tribRegraUfOrigem\": \"RS\",\r\n"
    		+ "            \"TribRegraPerfilOrigem\": \"INDUSTRIA\",\r\n"
    		+ "            \"TribRegraCodPerfilOrigem\": \"1\",\r\n"
    		+ "            \"tribRegraUfDestino\": \"RS\",\r\n"
    		+ "            \"TribRegraPerfilDestino\": \"VAREJO LUCRO REAL\",\r\n"
    		+ "            \"TribRegraCodPerfilDestino\": \"80\",\r\n"
    		+ "            \"tribRegraCfop\": \"1102\",\r\n"
    		+ "            \"tribIcmsCst\": \"00\",\r\n"
    		+ "            \"tribIcmsAliq\": \"12\",\r\n"
    		+ "            \"tribIcmsReducao\": \"0\",\r\n"
    		+ "            \"tribIcmsStAliq\": \"0\",\r\n"
    		+ "            \"tribIcmsStPauta\": \"\",\r\n"
    		+ "            \"tribIcmsStMva\": \"0\",\r\n"
    		+ "            \"tribFcpAliq\": \"0\",\r\n"
    		+ "            \"tribDifalAliq\": \"0\",\r\n"
    		+ "            \"tribRegraPisCst\": \"73\",\r\n"
    		+ "            \"tribPisReducao\": \"\",\r\n"
    		+ "            \"tribPisAliq\": \"\",\r\n"
    		+ "            \"fisRegraCofinsCst\": \"73\",\r\n"
    		+ "            \"tribCofinsReducao\": \"\",\r\n"
    		+ "            \"tribCofinAliq\": \"\",\r\n"
    		+ "            \"fisRegraValidadeInicio\": \"2021-01-01T00:00:00\",\r\n"
    		+ "            \"fisRegraValidadeFinal\": \"1899-12-30T00:00:00\"\r\n"
    		+ "        },\r\n"
    		+ "        {\r\n"
    		+ "            \"tribRegraDescricao\": \"RS INTER SC 2102 T000 ALQ.12,00 P73 C73\",\r\n"
    		+ "            \"tribRegraUfOrigem\": \"SC\",\r\n"
    		+ "            \"TribRegraPerfilOrigem\": \"INDUSTRIA\",\r\n"
    		+ "            \"TribRegraCodPerfilOrigem\": \"1\",\r\n"
    		+ "            \"tribRegraUfDestino\": \"RS\",\r\n"
    		+ "            \"TribRegraPerfilDestino\": \"VAREJO LUCRO REAL\",\r\n"
    		+ "            \"TribRegraCodPerfilDestino\": \"80\",\r\n"
    		+ "            \"tribRegraCfop\": \"2102\",\r\n"
    		+ "            \"tribIcmsCst\": \"00\",\r\n"
    		+ "            \"tribIcmsAliq\": \"12\",\r\n"
    		+ "            \"tribIcmsReducao\": \"0\",\r\n"
    		+ "            \"tribIcmsStAliq\": \"0\",\r\n"
    		+ "            \"tribIcmsStPauta\": \"\",\r\n"
    		+ "            \"tribIcmsStMva\": \"0\",\r\n"
    		+ "            \"tribFcpAliq\": \"0\",\r\n"
    		+ "            \"tribDifalAliq\": \"0\",\r\n"
    		+ "            \"tribRegraPisCst\": \"73\",\r\n"
    		+ "            \"tribPisReducao\": \"\",\r\n"
    		+ "            \"tribPisAliq\": \"\",\r\n"
    		+ "            \"fisRegraCofinsCst\": \"73\",\r\n"
    		+ "            \"tribCofinsReducao\": \"\",\r\n"
    		+ "            \"tribCofinAliq\": \"\",\r\n"
    		+ "            \"fisRegraValidadeInicio\": \"2021-01-01T00:00:00\",\r\n"
    		+ "            \"fisRegraValidadeFinal\": \"1899-12-30T00:00:00\"\r\n"
    		+ "        },\r\n"
    		+ "        {\r\n"
    		+ "            \"tribRegraDescricao\": \"RS INTRA 5102 T000 ALQ.12,00 P06 C06\",\r\n"
    		+ "            \"tribRegraUfOrigem\": \"RS\",\r\n"
    		+ "            \"TribRegraPerfilOrigem\": \"VAREJO LUCRO REAL\",\r\n"
    		+ "            \"TribRegraCodPerfilOrigem\": \"80\",\r\n"
    		+ "            \"tribRegraUfDestino\": \"RS\",\r\n"
    		+ "            \"TribRegraPerfilDestino\": \"CONSUMIDOR NAO CONTRIBUINTE\",\r\n"
    		+ "            \"TribRegraCodPerfilDestino\": \"53\",\r\n"
    		+ "            \"tribRegraCfop\": \"5102\",\r\n"
    		+ "            \"tribIcmsCst\": \"00\",\r\n"
    		+ "            \"tribIcmsAliq\": \"18\",\r\n"
    		+ "            \"tribIcmsReducao\": \"0\",\r\n"
    		+ "            \"tribIcmsStAliq\": \"0\",\r\n"
    		+ "            \"tribIcmsStPauta\": \"\",\r\n"
    		+ "            \"tribIcmsStMva\": \"0\",\r\n"
    		+ "            \"tribFcpAliq\": \"0\",\r\n"
    		+ "            \"tribDifalAliq\": \"0\",\r\n"
    		+ "            \"tribRegraPisCst\": \"06\",\r\n"
    		+ "            \"tribPisReducao\": \"\",\r\n"
    		+ "            \"tribPisAliq\": \"\",\r\n"
    		+ "            \"fisRegraCofinsCst\": \"06\",\r\n"
    		+ "            \"tribCofinsReducao\": \"\",\r\n"
    		+ "            \"tribCofinAliq\": \"\",\r\n"
    		+ "            \"fisRegraValidadeInicio\": \"2021-01-01T00:00:00\",\r\n"
    		+ "            \"fisRegraValidadeFinal\": \"1899-12-30T00:00:00\"\r\n"
    		+ "        }\r\n"
    		+ "    ],\r\n"
    		+ "    \"resultadoConsulta\": \"000-Consulta Efetuada com Sucesso\"\r\n"
    		+ "}";
    
    public static String jsonProd6 = "{\r\n"
    		+ "    \"produto\": {\r\n"
    		+ "        \"Codigo\": 63793,\r\n"
    		+ "        \"EAN\": \"7896412800740\",\r\n"
    		+ "        \"produtoDescricao\": \"MASSA S/OVOS ORQUIDEA 500G CONCHINHA\",\r\n"
    		+ "        \"produtoDescricaoNota\": \"MASSA S/OVOS ORQUIDEA 500G CONCHINHA\",\r\n"
    		+ "        \"produtoDescricaoFornecedor\": \"MASSA ORQUIDEA CONCHINHA S  OVOS 500G\",\r\n"
    		+ "        \"produtoDiasValidade\": \"720\",\r\n"
    		+ "        \"embalagemUnitariaPesoBruto\": \"511\",\r\n"
    		+ "        \"embalagemUnitariaPesoLiquido\": \"500\",\r\n"
    		+ "        \"embalagemUnitariaAltura\": \"19\",\r\n"
    		+ "        \"embalagemUnitariaLargura\": \"15\",\r\n"
    		+ "        \"embalagemUnitariaProfundidade\": \"5\",\r\n"
    		+ "        \"embalagemUnitariaId\": 143,\r\n"
    		+ "        \"embalagemUnitariaDescricao\": \"EMB 500 GR\",\r\n"
    		+ "        \"embalagemUnitariaCapacidade\": \"500\",\r\n"
    		+ "        \"embalagemUnitariaUnidadeMedida\": \"GRAMAS\",\r\n"
    		+ "        \"embalagemUnitariaUnidadeSigla\": \"G\",\r\n"
    		+ "        \"fabricanteId\": 0,\r\n"
    		+ "        \"fabricanteNome\": \"\",\r\n"
    		+ "        \"fabricanteMarcaid\": 176,\r\n"
    		+ "        \"fabricanteMarcaDescricao\": \"ORQUIDEA\",\r\n"
    		+ "        \"mercadologicaDepartamentoId\": 4,\r\n"
    		+ "        \"mercadologicaDepartamentoNome\": \"MERCEARIA SECA\",\r\n"
    		+ "        \"mercadologicaSecaoId\": 92,\r\n"
    		+ "        \"mercadologicaSecaoNome\": \"MASSAS\",\r\n"
    		+ "        \"mercadologicaGrupoId\": 515,\r\n"
    		+ "        \"mercadologicaGrupoNome\": \"MACARRAO SEM OVOS\",\r\n"
    		+ "        \"mercadologicaSubgrupoId\": 378,\r\n"
    		+ "        \"mercadologicaSubgrupoNome\": \"MASSA S/OVOS\",\r\n"
    		+ "        \"Ativo\": 1\r\n"
    		+ "    },\r\n"
    		+ "    \"dadosLogisticos\": [\r\n"
    		+ "        {\r\n"
    		+ "            \"logEmbalagem\": \"Caixa\",\r\n"
    		+ "            \"logDum14\": \"17896412800747\",\r\n"
    		+ "            \"logAlturaCm\": \"16.50\",\r\n"
    		+ "            \"logLarguraCm\": \"34.00\",\r\n"
    		+ "            \"logProfundidadeCm\": \"48.00\",\r\n"
    		+ "            \"logPesoKg\": \"10.22\",\r\n"
    		+ "            \"QtdEmbal\": \"20\",\r\n"
    		+ "            \"LogQtdLastro\": \"00000000.00\",\r\n"
    		+ "            \"LogQtdCamadas\": \"00000000.00\"\r\n"
    		+ "        },\r\n"
    		+ "        {\r\n"
    		+ "            \"logEmbalagem\": \"Lastro\",\r\n"
    		+ "            \"logDum14\": \"\",\r\n"
    		+ "            \"logAlturaCm\": \"16.50\",\r\n"
    		+ "            \"logLarguraCm\": \"0.00\",\r\n"
    		+ "            \"logProfundidadeCm\": \"0.00\",\r\n"
    		+ "            \"logPesoKg\": \"61.32\",\r\n"
    		+ "            \"QtdEmbal\": \"120\",\r\n"
    		+ "            \"LogQtdLastro\": \"6\",\r\n"
    		+ "            \"LogQtdCamadas\": \"00000000.00\"\r\n"
    		+ "        },\r\n"
    		+ "        {\r\n"
    		+ "            \"logEmbalagem\": \"Pallet\",\r\n"
    		+ "            \"logDum14\": \"\",\r\n"
    		+ "            \"logAlturaCm\": \"115.50\",\r\n"
    		+ "            \"logLarguraCm\": \"0.00\",\r\n"
    		+ "            \"logProfundidadeCm\": \"0.00\",\r\n"
    		+ "            \"logPesoKg\": \"429.24\",\r\n"
    		+ "            \"QtdEmbal\": \"840\",\r\n"
    		+ "            \"LogQtdLastro\": \"6\",\r\n"
    		+ "            \"LogQtdCamadas\": \"7\"\r\n"
    		+ "        }\r\n"
    		+ "    ],\r\n"
    		+ "    \"dadosTributarios\": [\r\n"
    		+ "        {\r\n"
    		+ "            \"tributarioNcm\": \"19021900\",\r\n"
    		+ "            \"tributarioCest\": \"1704901\",\r\n"
    		+ "            \"tributarioFiguraFiscal\": \"OPERACAO TRIBUTADA POR ST MVA 37,51-37,51 ALQ.12,00 06-73\",\r\n"
    		+ "            \"CodigoBeneficioFiscalIcms\": \"RS051601-LIVRO I,23,II -CESTA BASICA DE ALIMETOS\",\r\n"
    		+ "            \"CodigoBeneficioFiscalPisCofins\": \"119-MASSAS ALIMENTICIAS CLASSIFICADAS NA POSICAO 19.02 DA TIPI.\"\r\n"
    		+ "        }\r\n"
    		+ "    ],\r\n"
    		+ "    \"regrasTributarias\": [\r\n"
    		+ "        {\r\n"
    		+ "            \"tribRegraDescricao\": \"RS INTRA 1102  ALQ.12,00 RED.41,67 P73 C73\",\r\n"
    		+ "            \"tribRegraUfOrigem\": \"RS\",\r\n"
    		+ "            \"TribRegraPerfilOrigem\": \"INDUSTRIA\",\r\n"
    		+ "            \"TribRegraCodPerfilOrigem\": \"1\",\r\n"
    		+ "            \"tribRegraUfDestino\": \"RS\",\r\n"
    		+ "            \"TribRegraPerfilDestino\": \"VAREJO LUCRO REAL\",\r\n"
    		+ "            \"TribRegraCodPerfilDestino\": \"80\",\r\n"
    		+ "            \"tribRegraCfop\": \"1102\",\r\n"
    		+ "            \"tribIcmsCst\": \"20\",\r\n"
    		+ "            \"tribIcmsAliq\": \"12\",\r\n"
    		+ "            \"tribIcmsReducao\": \"41.67\",\r\n"
    		+ "            \"tribIcmsStAliq\": \"0\",\r\n"
    		+ "            \"tribIcmsStPauta\": \"\",\r\n"
    		+ "            \"tribIcmsStMva\": \"0\",\r\n"
    		+ "            \"tribFcpAliq\": \"0\",\r\n"
    		+ "            \"tribDifalAliq\": \"0\",\r\n"
    		+ "            \"tribRegraPisCst\": \"73\",\r\n"
    		+ "            \"tribPisReducao\": \"0\",\r\n"
    		+ "            \"tribPisAliq\": \"0\",\r\n"
    		+ "            \"fisRegraCofinsCst\": \"73\",\r\n"
    		+ "            \"tribCofinsReducao\": \"0\",\r\n"
    		+ "            \"tribCofinAliq\": \"0\",\r\n"
    		+ "            \"fisRegraValidadeInicio\": \"2018-01-01T00:00:00\",\r\n"
    		+ "            \"fisRegraValidadeFinal\": \"1899-12-30T00:00:00\"\r\n"
    		+ "        },\r\n"
    		+ "        {\r\n"
    		+ "            \"tribRegraDescricao\": \"RS INTER SC 2102  ALQ.12,00 RED.41,67 P73 C73\",\r\n"
    		+ "            \"tribRegraUfOrigem\": \"SC\",\r\n"
    		+ "            \"TribRegraPerfilOrigem\": \"INDUSTRIA\",\r\n"
    		+ "            \"TribRegraCodPerfilOrigem\": \"1\",\r\n"
    		+ "            \"tribRegraUfDestino\": \"RS\",\r\n"
    		+ "            \"TribRegraPerfilDestino\": \"VAREJO LUCRO REAL\",\r\n"
    		+ "            \"TribRegraCodPerfilDestino\": \"80\",\r\n"
    		+ "            \"tribRegraCfop\": \"2102\",\r\n"
    		+ "            \"tribIcmsCst\": \"20\",\r\n"
    		+ "            \"tribIcmsAliq\": \"12\",\r\n"
    		+ "            \"tribIcmsReducao\": \"41.67\",\r\n"
    		+ "            \"tribIcmsStAliq\": \"0\",\r\n"
    		+ "            \"tribIcmsStPauta\": \"\",\r\n"
    		+ "            \"tribIcmsStMva\": \"0\",\r\n"
    		+ "            \"tribFcpAliq\": \"0\",\r\n"
    		+ "            \"tribDifalAliq\": \"0\",\r\n"
    		+ "            \"tribRegraPisCst\": \"73\",\r\n"
    		+ "            \"tribPisReducao\": \"0\",\r\n"
    		+ "            \"tribPisAliq\": \"0\",\r\n"
    		+ "            \"fisRegraCofinsCst\": \"73\",\r\n"
    		+ "            \"tribCofinsReducao\": \"0\",\r\n"
    		+ "            \"tribCofinAliq\": \"0\",\r\n"
    		+ "            \"fisRegraValidadeInicio\": \"2018-01-01T00:00:00\",\r\n"
    		+ "            \"fisRegraValidadeFinal\": \"1899-12-30T00:00:00\"\r\n"
    		+ "        },\r\n"
    		+ "        {\r\n"
    		+ "            \"tribRegraDescricao\": \"RS INTRA 5102  ALQ.12,00 RED.41,67 P06 C06\",\r\n"
    		+ "            \"tribRegraUfOrigem\": \"RS\",\r\n"
    		+ "            \"TribRegraPerfilOrigem\": \"VAREJO LUCRO REAL\",\r\n"
    		+ "            \"TribRegraCodPerfilOrigem\": \"80\",\r\n"
    		+ "            \"tribRegraUfDestino\": \"RS\",\r\n"
    		+ "            \"TribRegraPerfilDestino\": \"CONSUMIDOR NAO CONTRIBUINTE\",\r\n"
    		+ "            \"TribRegraCodPerfilDestino\": \"53\",\r\n"
    		+ "            \"tribRegraCfop\": \"5102\",\r\n"
    		+ "            \"tribIcmsCst\": \"20\",\r\n"
    		+ "            \"tribIcmsAliq\": \"12\",\r\n"
    		+ "            \"tribIcmsReducao\": \"41.67\",\r\n"
    		+ "            \"tribIcmsStAliq\": \"0\",\r\n"
    		+ "            \"tribIcmsStPauta\": \"\",\r\n"
    		+ "            \"tribIcmsStMva\": \"0\",\r\n"
    		+ "            \"tribFcpAliq\": \"0\",\r\n"
    		+ "            \"tribDifalAliq\": \"0\",\r\n"
    		+ "            \"tribRegraPisCst\": \"06\",\r\n"
    		+ "            \"tribPisReducao\": \"0\",\r\n"
    		+ "            \"tribPisAliq\": \"0\",\r\n"
    		+ "            \"fisRegraCofinsCst\": \"06\",\r\n"
    		+ "            \"tribCofinsReducao\": \"0\",\r\n"
    		+ "            \"tribCofinAliq\": \"0\",\r\n"
    		+ "            \"fisRegraValidadeInicio\": \"2018-01-01T00:00:00\",\r\n"
    		+ "            \"fisRegraValidadeFinal\": \"1899-12-30T00:00:00\"\r\n"
    		+ "        }\r\n"
    		+ "    ],\r\n"
    		+ "    \"resultadoConsulta\": \"000-Consulta Efetuada com Sucesso\"\r\n"
    		+ "}";
    
    public static String resultado = "{\r\n"
    		+ "    \"resultadoConsulta\": \"015 - Campo EAN inválido.\"\r\n"
    		+ "}";
}

