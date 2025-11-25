package exemplo5;

import exemplo2.Animal;
import exemplo2.Cachorro;
import exemplo2.Gato;

public class TesteZoologico {

	public static void main(String[] args) {

		Animal cachorro = new Cachorro("Zeus");
		Animal gato = new Gato("Mimi");

		Zoologico zoo = new Zoologico();
		zoo.interagirComAnimal(cachorro);
		zoo.interagirComAnimal(gato);

	}

}
