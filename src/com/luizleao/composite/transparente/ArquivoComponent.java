package com.luizleao.composite.transparente;

// Classe componente
public abstract class ArquivoComponent {

	String nomeDoArquivo;

	public void printNomeDoArquivo() {
		System.out.println(this.nomeDoArquivo);
	}

	public String getNomeDoArquivo() {
		return this.nomeDoArquivo;
	}

	public void adicionar(ArquivoComponent novoArquivo) throws Exception {
		throw new Exception("Não pode inserir listaArquivos em: " + this.nomeDoArquivo + " - Não é uma pasta");
	}

	public void remover(String nomeDoArquivo) throws Exception {
		throw new Exception("Não pode remover listaArquivos em: " + this.nomeDoArquivo + " -Não é uma pasta");
	}

	public ArquivoComponent getArquivo(String nomeDoArquivo) throws Exception {
		throw new Exception("Não pode pesquisar listaArquivos em: " + this.nomeDoArquivo + " - Não é uma pasta");
	}
}