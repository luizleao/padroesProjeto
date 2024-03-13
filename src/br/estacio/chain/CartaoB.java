package br.estacio.chain;

public class CartaoB extends PagamentoChain {

	public CartaoB() {
		super(EnumPagamentos.CARTAOB);
	}

	@Override
	protected void efetuarPagamento() {
		System.out.println("Pagamento efetuado: Cartão B");
	}

}
