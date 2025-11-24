
package exemplo;

public class Exemplo5ContinueFiltrarEmails {
	public static void main(String[] args) {
		
		String[] emails = { "alex@", "teste@gmail.com", "invalido", "user@hotmail.com" };
		
		for (String email : emails) {
			if (!email.contains("@"))
				continue;
			
			System.out.println("Enviando e-mail para: " + email);
		}
	}
}
