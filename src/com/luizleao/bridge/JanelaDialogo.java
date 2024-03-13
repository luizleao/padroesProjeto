package com.luizleao.bridge;

public class JanelaDialogo extends JanelaAbstrata {

	public JanelaDialogo(IJanela j) {
		super(j);
	}

	@Override
	public void desenhar() {
		desenharJanela("Janela de Diálogo");
		desenharBotao("Botão Sim");
		desenharBotao("Botão Não");
		desenharBotao("Botão Cancelar");
	}

}
