package br.estacio.abstractFactory;

public class Palio implements CarroPopular {

	@Override
	public void exibirInfoPopular() {
		System.out.println("Modelo: Palio\nFabrica: Fiat\nCategoria:Popular");
	}

}
