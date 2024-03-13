package com.luizleao.templateMethod;

import java.util.ArrayList;

public class Playlist {
	protected ArrayList<Musica> musicas;
	protected OrdenarTemplate ordenador;

	public Playlist(EnumModoReproducao modo) {
		musicas = new ArrayList<Musica>();
		switch (modo) {
			case ANO: ordenador = new OrdenarAno(); break;
			case AUTOR: ordenador = new OrdenarAutor(); break;
			case ESTRELA: ordenador = new OrdenarEstrela(); break;
			case NOME: ordenador = new OrdenarNome(); break;
			default: break;
		}
	}

	public void setModoDeReproducao(EnumModoReproducao modo) {
		ordenador = null;
		switch (modo) {
			case ANO: ordenador = new OrdenarAno(); break;
			case AUTOR: ordenador = new OrdenarAutor(); break;
			case ESTRELA: ordenador = new OrdenarEstrela(); break;
			case NOME: ordenador = new OrdenarNome(); break;
			default: break;
		}
	}

	public void addMusica(String nome, String autor, String ano, int estrela) {
		musicas.add(new Musica(nome, autor, ano, estrela));
	}

	public void showLista() {
		ArrayList<Musica> aMusica = new ArrayList<Musica>();
		aMusica = ordenador.ordenarMusica(musicas);

		for (Musica musica : aMusica) {
			System.out.println(musica.nome + " - " + musica.autor);
			System.out.println("Ano: "+ musica.ano);
			System.out.println("Estrelas: " + musica.estrelas);
			System.out.println("-----------------------------");
		}
	}
}
