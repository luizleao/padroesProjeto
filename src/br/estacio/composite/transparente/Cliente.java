package br.estacio.composite.transparente;

public class Cliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// O usuario do codigo nao precisa saber detalhes das implementacoes dos
		// objetos. Consegue manipular os objetos a partir da interface comum:
		// ArquivoComponent.
		ArquivoComponent minhaPasta = new ArquivoComposite("Minha Pasta/");
		ArquivoComponent meuVideo = new ArquivoVideo("meu setor.avi");
		ArquivoComponent meuOutroVideo = new ArquivoVideo("serieS01E01.mkv");

		try {
			// Como a interface define operacoes comuns a todos os arquivo eh
			// possivel tentar inserir um arquivo em um arquivo
			meuVideo.adicionar(meuOutroVideo);
		} catch (Exception e) {
			// No entanto voce deve tratar este tipo de comportamento com
			// excecoes ou outros metodos
			System.out.println(e.getMessage());
		}

		try {
			minhaPasta.adicionar(meuVideo);
			minhaPasta.adicionar(meuOutroVideo);
			minhaPasta.printNomeDoArquivo();
		} catch (Exception e) {
			// Nao sera executado pois minha pasta eh um ArquivoComposite e
			// possui todas as operacoes de gerenciamento dos listaArquivos
			// implementadas.
			System.out.println(e.getMessage());
		}

		try {
			// O problema dessa implementacao eh que o usuario do codigo precisa
			// sempre verificar se pode realizar as operacoes, pois nao se tem
			// certeza sobre o tipo do objeto utilizado
			System.out.println("\nPesquisando listaArquivos:");
			minhaPasta.getArquivo(meuVideo.getNomeDoArquivo()).printNomeDoArquivo();
			System.out.println("\nRemover listaArquivos");
			minhaPasta.remover(meuVideo.getNomeDoArquivo());
			minhaPasta.printNomeDoArquivo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
