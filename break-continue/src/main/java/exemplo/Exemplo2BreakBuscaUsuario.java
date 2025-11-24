package exemplo;

public class Exemplo2BreakBuscaUsuario {
	public static void main(String[] args) {
		
		String[] nomes = { "Ana", "Lucas", "Marcos", "João" };
		
		for (String nome : nomes) {
			if (nome.equals("Marcos")) {
				
				System.out.println(nome + ": Usuário encontrado!");
				break;
			}
		}
	}
}
