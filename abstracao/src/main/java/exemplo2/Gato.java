package exemplo2;

//SubClasse ou Classe Concreta
public class Gato extends Animal {

	public Gato(String nome) {
		super(nome);
	}

	@Override
	public void emitirSom() {
		System.out.println("Miau!");
	}
}