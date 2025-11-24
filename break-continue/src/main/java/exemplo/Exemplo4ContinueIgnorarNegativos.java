package exemplo;

public class Exemplo4ContinueIgnorarNegativos {

	public static void main(String[] args) {

		int[] valores = { 10, -5, 20, -3, 7 };
		int soma = 0;

		for (int v : valores) {
			if (v < 0)
				continue;

			soma += v;
		}
		System.out.println("Soma dos positivos: " + soma);
	}
}
