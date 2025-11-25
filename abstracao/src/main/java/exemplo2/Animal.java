package exemplo2;

/*Representa o esqueleto de uma arquitetura que representa o contexto de Animal*/
public abstract class Animal {

	/* Acessivel para subclasses */
	protected String nome;

	/* Deverá ser implementado e sobreescrito pela classe concreta */
	public abstract void emitirSom();

	/* Obriga informar um nome para o animado no momento da criação do objeto */
	public Animal(String nome) {
		this.nome = nome;
	}

	/* Comportamento padrão */
	public void dormir() {
		System.out.println(nome + " está dormindo...");
	}
	
	
	public String getNome() {
		return nome;
	}
	
}