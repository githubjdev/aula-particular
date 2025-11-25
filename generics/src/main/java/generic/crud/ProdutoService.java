package generic.crud;

import java.util.List;

public class ProdutoService {

	private ProdutoRepository repository = new ProdutoRepository();

	public void cadastrarProduto(Long id, String nome, double preco) {
		Produto p = new Produto(id, nome, preco);
		repository.salvar(p);
	}

	public Produto buscar(Long id) {
		return repository.buscarPorId(id);
	}

	public void excluir(Long id) {
		repository.excluir(id);
	}

	public List<Produto> listar() {
		return repository.listarTodos();
	}
}
