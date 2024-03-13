package br.estacio.memento;

public class Cliente {
	public static void main(String[] args) {
		Texto texto = new Texto();
		texto.addTexto("Texto da linha 1");
		texto.addTexto("Texto da linha 2");
		texto.addTexto("Texto da linha 1");
		texto.showTexto();
		texto.undoTexto();
		texto.showTexto();
		texto.undoTexto();
		texto.showTexto();
		texto.undoTexto();
		texto.showTexto();
		texto.undoTexto();
		texto.showTexto();
	}
}
