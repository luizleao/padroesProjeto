package com.luizleao.command;

public class PagamentoCartaoDebito implements PagamentoCommand {

	@Override
	public void processarCompra(Compra compra) {
		System.out.println(compra.getInfoNota() + "| Forma de Pagamento: ........ Cartao de Debito");
	}
}
