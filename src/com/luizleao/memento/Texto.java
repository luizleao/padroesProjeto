package br.estacio.memento;

public class Texto {
	protected String texto;
	TextoCaretaker caretaker;

	public Texto() {
		caretaker = new TextoCaretaker();
		texto = new String();
	}

	public void addTexto(String novoTexto) {
		caretaker.addMemento(new TextoMemento(texto));
		texto += novoTexto+"\n";
	}

	public void undoTexto() {
		texto = caretaker.getUltimoEstadoSalvo().getTextoSalvo();
	}

	public void showTexto() {
		System.out.println(texto);
	}

}
