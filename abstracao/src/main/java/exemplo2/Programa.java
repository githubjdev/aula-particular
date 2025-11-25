package exemplo2;

public class Programa {

	public static void main(String[] args) {

		Animal cachorro = new Cachorro("Cachorro -> Zeus");
		cachorro.emitirSom();
		cachorro.dormir();
		
		System.out.println("-------------------------------------------");

		Animal gato = new Gato("Gato -> Mingau");
		gato.emitirSom();
		gato.dormir();
		
		System.out.println("-------------------------------------------");
		
		Animal passaro = new Passaro("Passáro -> Canário");
		passaro.emitirSom();
		passaro.dormir();

	}

}
