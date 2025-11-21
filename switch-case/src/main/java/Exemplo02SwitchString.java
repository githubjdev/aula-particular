public class Exemplo02SwitchString {
	
	public static void main(String[] args) {
		
		String comando = "CRIAR";
		
		switch (comando) {
		case "CRIAR":
			System.out.println("Executando lógica de criação...");
			break;
		case "ATUALIZAR":
			System.out.println("Executando lógica de atualização...");
			break;
		case "DELETAR":
			System.out.println("Executando lógica de exclusão...");
			break;
		default:
			System.out.println("Comando inválido: " + comando);
		}
	}
}