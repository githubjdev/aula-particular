package exemplo;

public class Exemplo1BreakBasico {
	
	public static void main(String[] args) {
		
		int[] numeros = { 10, 20, 30, 40, 55, 60, 70 };
		
		for (int n : numeros) {
			if (n > 50) {
				System.out.println("Primeiro maior que 50: " + n);
				break;
			}
		}
	}
}
