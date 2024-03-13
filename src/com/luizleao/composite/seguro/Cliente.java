package com.luizleao.composite.seguro;

public class Cliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// O cliente precisa conhecer a implementacao das classes concretas,
		// pois a interface de um ArquivoVideo eh diferente de um
		// ArquivoComposite
		ArquivoComponent video01 = new ArquivoVideo("meu setor.rmvb");
		ArquivoComponent video02 = new ArquivoVideo("novo setor.rmvb");
		// No entanto previne que o usuario possa fazer esse tipo de chamada:
		// meuVideo.adicionar(meuOutroVideo);

		ArquivoComponent pastaVideos = new ArquivoComposite("Meus Videos/");

		// Para utilizar os metodos especificos de um composite eh necessario
		// realizar um cast. Mas eh preciso ter certeza que o objeto pode ser
		// convertido, caso contrario uma excecao sera disparada
		((ArquivoComposite) pastaVideos).adicionar(video01);
		((ArquivoComposite) pastaVideos).adicionar(video02);
		pastaVideos.printNomeArquivo();
	}
}