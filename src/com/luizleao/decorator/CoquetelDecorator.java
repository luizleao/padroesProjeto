package com.luizleao.decorator;

public abstract class CoquetelDecorator extends Coquetel {
	Coquetel coquetel;

	public CoquetelDecorator(Coquetel oCoquetel) {
		coquetel = oCoquetel;
	}

	@Override
	public String getNome() {
		return coquetel.getNome() + " + " + nome;
	}

	public double getPreco() {
		return coquetel.getPreco() + preco;
	}
}
