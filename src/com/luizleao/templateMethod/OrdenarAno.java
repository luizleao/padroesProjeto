package com.luizleao.templateMethod;

public class OrdenarAno extends OrdenarTemplate {

	@Override
	public boolean isPrimeiro(Musica musica1, Musica musica2) {
		if (musica1.ano.compareToIgnoreCase(musica2.ano) <= 0) {
			return true;
		}
		return false;
	}
}