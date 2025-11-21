public class Exemplo06ConversaoCodigos {
	public static void main(String[] args) {
		
		int statusCode = 404;
		String mensagem;
		
		switch (statusCode) {
		case 200:
			mensagem = "OK";
			break;
		case 201:
			mensagem = "CREATED";
			break;
		case 400:
			mensagem = "BAD REQUEST";
			break;
		case 401:
			mensagem = "UNAUTHORIZED";
			break;
		case 404:
			mensagem = "NOT FOUND";
			break;
		case 500:
			mensagem = "INTERNAL SERVER ERROR";
			break;
		default:
			mensagem = "Código desconhecido: " + statusCode;
		}
		System.out.println(mensagem);
	}
}