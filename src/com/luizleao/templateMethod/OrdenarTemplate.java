package br.estacio.templateMethod;

import java.util.ArrayList;

public abstract class OrdenarTemplate {
	public abstract boolean isPrimeiro(Musica musica1, Musica musica2);

	protected ArrayList<Musica> ordenarMusica(ArrayList<Musica> lista) {
		ArrayList<Musica> aListaMusica = new ArrayList<Musica>();
		for (Musica musicaMP3 : lista) {
			aListaMusica.add(musicaMP3);
		}

		for (int i = 0; i < aListaMusica.size(); i++) {
			for (int j = i; j < aListaMusica.size(); j++) {
				if (!isPrimeiro(aListaMusica.get(i), aListaMusica.get(j))) {
					Musica temp = aListaMusica.get(j);
					aListaMusica.set(j, aListaMusica.get(i));
					aListaMusica.set(i, temp);
				}
			}
		}

		return aListaMusica;
	}
}
