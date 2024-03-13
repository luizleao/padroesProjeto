package com.luizleao.state;

public interface MarioState {
	MarioState pegarCogumelo();
	MarioState pegarFlor();
	MarioState pegarPena();
	MarioState sofrerDano();
}
