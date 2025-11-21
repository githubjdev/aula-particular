
public class Exemplo03SwitchEnum {
	public static void main(String[] args) {
		StatusPedido status = StatusPedido.ENVIADO;
		String mensagem;

		switch (status) {
		case NOVO:
			mensagem = "Seu pedido foi recebido e está em análise.";
			break;
		case PAGO:
			mensagem = "Pagamento confirmado!";
			break;
		case ENVIADO:
			mensagem = "Seu pedido foi enviado.";
			break;
		case ENTREGUE:
			mensagem = "Pedido entregue!";
			break;
		case CANCELADO:
			mensagem = "Pedido cancelado.";
			break;
		default:
			mensagem = "Status desconhecido.";
		}
		System.out.println(mensagem);
	}
}