package exemplo;

import java.util.Scanner;

public class Exemplo3BreakMenu {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1 - Comprar");
			System.out.println("2 - Vender");
			System.out.println("0 - Sair");
			System.out.print("Escolha: ");
			
			int opcao = sc.nextInt();
				if (opcao == 0) {
					System.out.println("Encerrando o sistema...");
					break;
				}
			System.out.println("Processando opção " + opcao);
		 }
		sc.close();
	}
}
