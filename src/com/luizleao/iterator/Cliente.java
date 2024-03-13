package com.luizleao.iterator;

public class Cliente {
	public static void main(String[] args) {
		CanaisNoticia canais = new CanaisNoticia();
		System.out.println("==========================");
		System.out.println("Iterando com for:");
		System.out.println("==========================");
		for (IteradorCanais it = canais.criarIterator(); !it.isDone(); it.proximo()) {
			System.out.println(it.getNumeroCanal() + " - " + it.getNomeCanal());
		}

		System.out.println("==========================");
		System.out.println("Usando Iterator:");
		System.out.println("==========================");
		IteradorCanais it = canais.criarIterator();
		
		System.out.println(it.getNumeroCanal() + " - " + it.getNomeCanal());
		it.proximo();
		System.out.println(it.getNumeroCanal() + " - " + it.getNomeCanal());
		it.proximo();
		System.out.println(it.getNumeroCanal() + " - " + it.getNomeCanal());
		it.proximo();
		System.out.println(it.getNumeroCanal() + " - " + it.getNomeCanal());


		System.out.println("\nIterando fora dos limites:");
		it.proximo();
		System.out.println(it.getNumeroCanal() + " - " + it.getNomeCanal());
		it.primeiro();
		it.anterior();
		System.out.println(it.getNumeroCanal() + " - " + it.getNomeCanal());
	}
}
