package servicos;

import javax.swing.JOptionPane;

import org.json.JSONObject;

import dominio.Config;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;



public class Servico {
	static String webService = "http://metaassessoria2.ddns.net:23145";

	public String consultarProduto() {

	String jsonEmString= "";
		OkHttpClient client = new OkHttpClient().newBuilder().build();
		// MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");

		RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
				.addFormDataPart("cnpj", Config.metaCNPJ)
				.addFormDataPart("usuario", Config.metaUsuario)
				.addFormDataPart("ean", view.Principal.ean).build();
		Request request = new Request.Builder().url(webService)
				.method("POST", body).addHeader("token", Config.metaToken)
				.addHeader("ambiente", Config.metaAmbiente)
				.addHeader("Content-Type", "application/x-www-form-urlencoded")
				.build();

		try {
			Response response = client.newCall(request).execute();
			
			 JSONObject jsonObject = new JSONObject(response.body().source().readUtf8());
			  jsonEmString = jsonObject.toString(4);

			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Impossível acessar o serviço da CTS! \nFavor verificar sua conexao com a internet.","Erro na Rede!", JOptionPane.ERROR_MESSAGE);
			System.out.println(e);
		}
		return jsonEmString;
	
	}

}
