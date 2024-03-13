package br.estacio.state;

public interface MarioState {
	MarioState pegarCogumelo();
	MarioState pegarFlor();
	MarioState pegarPena();
	MarioState sofrerDano();
}
