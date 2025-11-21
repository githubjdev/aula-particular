import java.util.Scanner;

public class Exemplo04MenuOpcoes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("==== MENU BANCO ====");
		System.out.println("1 - Saldo");
		System.out.println("2 - Depositar");
		System.out.println("3 - Sacar");
		System.out.println("0 - Sair");
		
		int opcao = scanner.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Consultando saldo...");
			break;
		case 2:
			System.out.println("Realizando depósito...");
			break;
		case 3:
			System.out.println("Realizando saque...");
			break;
		case 0:
			System.out.println("Saindo...");
			break;
		default:
			System.out.println("Opção inválida!");
		}
		scanner.close();
	}
}