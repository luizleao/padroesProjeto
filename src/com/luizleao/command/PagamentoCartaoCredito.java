package com.luizleao.command;

public class PagamentoCartaoCredito implements PagamentoCommand {
	int qtdParcelas;
	
	PagamentoCartaoCredito(int qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}
	
	@Override
	public void processarCompra(Compra compra) {
		System.out.println(compra.getInfoNota() + "| Forma de Pagamento: ........ Cartao de Credito");
		System.out.println("| Quantidade de Parcelas: .... "+qtdParcelas);
	}
}