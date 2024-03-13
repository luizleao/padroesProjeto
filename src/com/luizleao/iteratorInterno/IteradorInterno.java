package br.estacio.iteratorInterno;

import br.estacio.iteratorExterno.Canal;
import br.estacio.iteratorExterno.IteradorInterface;

public abstract class IteradorInterno {

	IteradorInterface it;

	public void percorrerLista() {
		for (it.first(); !it.isDone(); it.next()) {
			operacao(it.currentItem());
		}
	}

	protected abstract void operacao(Canal canal);
}
