package com.luizleao.iterator;

import java.util.ArrayList;

public abstract class CanaisAgregado {
	protected ArrayList<Canal> canais;

	public CanaisAgregado() {
		canais = new ArrayList<Canal>();
	}

	public int count() {
		return canais.size();
	}

	public IteradorCanais criarIterator() {
		return new IteradorCanais(canais);
	}
}
