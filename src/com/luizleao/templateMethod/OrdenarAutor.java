package com.luizleao.templateMethod;

public class OrdenarAutor extends OrdenarTemplate {

	@Override
	public boolean isPrimeiro(Musica musica1, Musica musica2) {
		if (musica1.autor.compareToIgnoreCase(musica2.autor) <= 0) {
			return true;
		}
		return false;
	}
}