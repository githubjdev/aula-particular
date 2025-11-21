public class Exemplo08SwitchAPIPagamento {

	public static void main(String[] args) {
		String meioPagamento = "PIX";
		double valor = 100.0;
		double taxa = calcularTaxa(meioPagamento, valor);
		System.out.println("Taxa: R$ " + taxa);
		System.out.println("Valor final: R$ " + (valor + taxa));
	}

	private static double calcularTaxa(String meioPagamento, double valor) {
		return switch (meioPagamento) {
		case "CARTAO" -> valor * 0.03;
		case "PIX" -> valor * 0.005;
		case "BOLETO" -> 2.50;
		default -> {
			System.out.println("Meio desconhecido");
			yield 0.0;
		 }
		};
	}
}