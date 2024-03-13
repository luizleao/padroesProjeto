package com.luizleao.decorator;

public class Cliente {
	public static void main(String[] args) {
		Coquetel coquetel = new Vodka();
		System.out.println(coquetel.getNome() + ": "+ coquetel.getPreco());

		coquetel = new SucoLaranja(coquetel);
		System.out.println(coquetel.getNome() + ": "+ coquetel.getPreco());
	}
}