package br.estacio.iteratorInterno;

import br.estacio.iteratorExterno.Canal;
import br.estacio.iteratorExterno.IteradorInterface;

public class IteradorPrint extends IteradorInterno {

	public IteradorPrint(IteradorInterface it) {
		this.it = it;
	}

	@Override
	protected void operacao(Canal canal) {
		System.out.println(canal.nome);
	}

}
