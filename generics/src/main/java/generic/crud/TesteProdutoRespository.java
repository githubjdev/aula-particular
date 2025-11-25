package generic.crud;

public class TesteProdutoRespository {

	public static void main(String[] args) {
		ProdutoRepository repo = new ProdutoRepository();
		repo.salvar(new Produto(1L, "Mouse", 99.90));
		repo.salvar(new Produto(2L, "Teclado", 199.90));
		
		System.out.println("\nTodos os objetos: " + repo.listarTodos());
		
		Produto p = repo.buscarPorId(1L);
		System.out.println("\nExcluido: " + p);
		
		
		repo.excluir(2L);
		System.out.println("\nTodos os obejtos apos excluir 1: " + repo.listarTodos());
	}

}
