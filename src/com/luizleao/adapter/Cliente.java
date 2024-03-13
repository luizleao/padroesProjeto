package com.luizleao.adapter;

public class Cliente {
	public static void main(String[] args) {
		IImagem imagem = new JpgImagemAdapter();
		imagem.carregarImagem("imagem.png");
		imagem.desenharImagem(1, -5, 10, 10);
		System.out.println("==================================");
		imagem = new PngImagemAdapter();
		imagem.carregarImagem("imagem.png");
		imagem.desenharImagem(3, 8, 10, 100);
	}
}