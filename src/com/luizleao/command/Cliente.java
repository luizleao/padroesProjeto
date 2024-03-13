package br.estacio.command;

public class Cliente {
	public static void main(String[] args) {
		Loja baratao = new Loja("Baratão");
		baratao.executarCompra(999.00, new PagamentoCartaoCredito(2));
		System.out.println("===============================");
		baratao.executarCompra(49.00, new PagamentoBoleto());
		System.out.println("===============================");
		baratao.executarCompra(99.00, new PagamentoCartaoDebito());
		System.out.println("===============================");
		
		Loja joaoEletro = new Loja("João Eletro");
		joaoEletro.executarCompra(19.00, new PagamentoCartaoCredito(3));
	}
}