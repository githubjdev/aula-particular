package exemplo2;

/*Exemplo 3*/
public class Passaro extends Animal {

	public Passaro(String nome) {
		super(nome);
	}

	@Override
	public void emitirSom() {
		System.out.println("Piu Piu");
	}

}
