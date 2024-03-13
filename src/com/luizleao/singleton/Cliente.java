package com.luizleao.singleton;

public class Cliente {

	public static void main(String[] args) {
		Singleton singleton = null;
		singleton = Singleton.getInstance();
		
		System.out.println("Classe Singleton instanciada, inicializada com o valor inteiro:");
		System.out.println(singleton.valor);
	}
}
