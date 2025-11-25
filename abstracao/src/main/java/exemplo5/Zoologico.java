package exemplo5;

import exemplo2.Animal;

public class Zoologico {
	
	public void interagirComAnimal(Animal animal) {
		System.out.println("Interagindo com o animal: " + animal.getNome());
		
		animal.emitirSom();
		animal.dormir();
		
		System.out.println("------------------------------------------------");
	}

}
