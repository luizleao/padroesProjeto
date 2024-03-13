package com.luizleao.proxy;

public class Cliente {
	public static void main(String[] args) {
		System.out.println("Acesso do Hacker");
		Banco banco = new BancoProxy("Hacker", "1234");
		System.out.println(banco.getTotalClientes());
		System.out.println(banco.getSaldoClientes());
		System.out.println("================================");
		System.out.println("Acesso do Gerente");
		banco = new BancoProxy("gerente", "gerente");
		System.out.println(banco.getTotalClientes());
		System.out.println(banco.getSaldoClientes());
	}
}
