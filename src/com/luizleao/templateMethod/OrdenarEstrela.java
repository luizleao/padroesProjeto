package com.luizleao.templateMethod;

public class OrdenarEstrela extends OrdenarTemplate {

	@Override
	public boolean isPrimeiro(Musica musica1, Musica musica2) {
		if (musica1.estrelas > musica2.estrelas) {
			return true;
		}
		return false;
	}
}
