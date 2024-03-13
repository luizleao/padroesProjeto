package com.luizleao.chain;

public class Boleto extends PagamentoChain {

	public Boleto() {
		super(EnumPagamentos.BOLETO);
	}

	@Override
	protected void efetuarPagamento() {
		System.out.println("Pagamento efetuado: Boleto");
	}

}
