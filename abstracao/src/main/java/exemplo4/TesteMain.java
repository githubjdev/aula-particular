package exemplo4;

public class TesteMain {

	public static void main(String[] args) {

		Veiculo v1 = new Carro();
		v1.mover();
		v1.parar();
		
		System.out.println("-------------------------------------------");

		Veiculo v2 = new Bicicleta();
		v2.mover();
		v2.parar();
	}

}
