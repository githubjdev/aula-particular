
package exemplo;

public class Exemplo8BreakContinuePedidos {
	public static void main(String[] args) {
		
		int[] pedidos = { 100, 200, -50, 300, 15000, 400 };
		for (int p : pedidos) {
			
			if (p < 0) {
				System.out.println("Pedido inválido ignorado: " + p);
				continue;
			}
			
			if (p > 10000) {
				System.out.println("Pedido alto demais! Encerrando processamento.");
				break;
			}
			System.out.println("Processando pedido: " + p);
		}
	}
}
