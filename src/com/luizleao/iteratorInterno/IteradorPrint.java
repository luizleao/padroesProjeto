package com.luizleao.iteratorInterno;

import com.luizleao.iteratorExterno.Canal;
import com.luizleao.iteratorExterno.IteradorInterface;

public class IteradorPrint extends IteradorInterno {

	public IteradorPrint(IteradorInterface it) {
		this.it = it;
	}

	@Override
	protected void operacao(Canal canal) {
		System.out.println(canal.nome);
	}

}
