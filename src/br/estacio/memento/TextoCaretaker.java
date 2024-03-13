package br.estacio.memento;

import java.util.ArrayList;

public class TextoCaretaker {
	protected ArrayList<TextoMemento> estados;

	public TextoCaretaker() {
		estados = new ArrayList<TextoMemento>();
	}

	public void addMemento(TextoMemento memento) {
		estados.add(memento);
	}

	public TextoMemento getUltimoEstadoSalvo() {
		if (estados.size() <= 0) {
			return new TextoMemento("");
		}
		TextoMemento estadoSalvo = estados.get(estados.size() - 1);
		estados.remove(estados.size() - 1);
		return estadoSalvo;
	}
}
