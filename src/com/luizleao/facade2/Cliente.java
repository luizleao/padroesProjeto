package com.luizleao.facade2;

public class Cliente {
	public static void main(String[] args) {
		System.out.println("Configuração");
		Facade oFacade = new Facade();
		
		System.out.println("====================");
		System.out.println("Utilização");
		oFacade.renderizarImagem("imagem.png");
		oFacade.reproduzirAudio("teste.mp3");
		oFacade.lerInput();
	}
}