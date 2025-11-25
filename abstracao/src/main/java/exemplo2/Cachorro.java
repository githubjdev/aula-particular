package exemplo2;

//SubClasse ou Classe Concreta
public class Cachorro extends Animal {

	public Cachorro(String nome) {
		super(nome);
	}

	@Override
	public void emitirSom() {
		System.out.println("Au au!");
	}

}
