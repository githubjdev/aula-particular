
public class Exemplo07SwitchExpression {
	public static void main(String[] args) {

		Plano plano = Plano.PRO;
		int numeroUsuarios = 15;

		double desconto = switch (plano) {
		case BASICO -> 0.0;
		case PRO -> {
			double base = 0.05;
			if (numeroUsuarios > 10)
				base += 0.02;
			yield base;
		}
		case EMPRESARIAL -> 0.10;
		};

		System.out.println("Desconto: " + desconto);
	}
}