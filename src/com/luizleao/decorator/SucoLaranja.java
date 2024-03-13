package com.luizleao.decorator;

public class SucoLaranja extends CoquetelDecorator {
	public SucoLaranja(Coquetel oCoquetel) {
		super(oCoquetel);
		nome = "Suco de Laranja";
		preco = 7.5;
	}
}