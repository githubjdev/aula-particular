
package exemplo;

public class Exemplo6BreakRotulado {
	
	public static void main(String[] args) {
		
	  int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
       procura: for (int[] linha : matriz) {
				    for (int num : linha) {
						if (num == 5) {
							System.out.println(num + " : Número encontrado!");
							break procura;
					}
				}
		}
	}
}
