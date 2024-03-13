package com.luizleao.templateMethod;

public class Cliente {
	public static void main(String[] args) {
		Playlist playList = new Playlist(EnumModoReproducao.NOME);
		playList.addMusica("Qualquer Coisa", "Caetano Veloso", "1975", 5);
		playList.addMusica("Realce", "Gilberto Gil", "1979", 4);
		playList.addMusica("Sob Medida", "Chico Buarque", "1995", 3);
		playList.addMusica("Faceira", "Gal Costa", "1980", 2);
		playList.addMusica("Tenha Calma", "Maria Bethânia", "1989", 1);

		System.out.println("| ------------------------ |");
		System.out.println("| Lista por Nome de Musica |");
		System.out.println("| ------------------------ |");
		playList.showLista();

		System.out.println("| ------------------------ |");
		System.out.println("|      Lista por Autor     |");
		System.out.println("| ------------------------ |");
		playList.setModoDeReproducao(EnumModoReproducao.AUTOR);
		playList.showLista();

		System.out.println("| ------------------------ |");
		System.out.println("|      Lista por Ano       |");
		System.out.println("| ------------------------ |");
		playList.setModoDeReproducao(EnumModoReproducao.ANO);
		playList.showLista();

		System.out.println("| ------------------------ |");
		System.out.println("|    Lista por Estrela     |");
		System.out.println("| ------------------------ |");
		playList.setModoDeReproducao(EnumModoReproducao.ESTRELA);
		playList.showLista();
	}
}
