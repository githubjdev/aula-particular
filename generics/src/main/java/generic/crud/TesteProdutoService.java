package generic.crud;

public class TesteProdutoService {
	public static void main(String[] args) {
		ProdutoService service = new ProdutoService();
		service.cadastrarProduto(1L, "Monitor", 899.00);
		service.cadastrarProduto(2L, "Notebook", 3999.00);
		System.out.println("Lista: " + service.listar());
	}
}
