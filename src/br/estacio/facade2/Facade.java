package br.estacio.facade2;

public class Facade {
	protected Audio audio;
	protected Input input;
	protected Video video;

	public Facade() {
		video = new Video();
		video.configurarCores();
		video.configurarResolucao();

		input = new Input();
		input.configurarJoystick();
		input.configurarTeclado();

		audio = new Audio();
		audio.configurarCanais();
		audio.configurarFrequencia();
		audio.configurarVolume();
	}

	public void reproduzirAudio(String arquivo) {
		audio.reproduzirAudio(arquivo);
	}

	public void renderizarImagem(String imagem) {
		video.renderizarImagem(imagem);
	}

	public void lerInput() {
		input.lerInput();
	}
}
