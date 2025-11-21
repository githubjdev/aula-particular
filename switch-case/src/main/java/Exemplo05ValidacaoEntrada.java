import java.util.Scanner;

public class Exemplo05ValidacaoEntrada {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o conceito (A-E): ");
		String input = scanner.nextLine().trim().toUpperCase();
		
		if (input.length() != 1) {
			System.out.println("Entrada inválida.");
			scanner.close();
			return;
		}
		
		char conceito = input.charAt(0);
		
		switch (conceito) {
		case 'A':
			System.out.println("Excelente!");
			break;
		case 'B':
			System.out.println("Muito bom!");
			break;
		case 'C':
			System.out.println("Bom.");
			break;
		case 'D':
			System.out.println("Precisa melhorar.");
			break;
		case 'E':
			System.out.println("Reprovado.");
			break;
		default:
			System.out.println("Conceito inválido!");
		}
		scanner.close();
	}
}