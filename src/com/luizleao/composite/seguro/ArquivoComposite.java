package br.estacio.composite.seguro;

import java.util.ArrayList;

public class ArquivoComposite extends ArquivoComponent {
	protected ArrayList<ArquivoComponent> listaArquivos;

	public ArquivoComposite(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		listaArquivos = new ArrayList<ArquivoComponent>();
	}

	@Override
	public void printNomeArquivo() {
		System.out.println(this.nomeArquivo);
		for (ArquivoComponent arquivoTmp : listaArquivos) {
			arquivoTmp.printNomeArquivo();
		}
	}

	public void adicionar(ArquivoComponent novoArquivo) {
		this.listaArquivos.add(novoArquivo);
	}

	public void remover(String nomeArquivo) throws Exception {
		for (ArquivoComponent arquivoTmp : listaArquivos) {
			if (arquivoTmp.getNomeArquivo() == nomeArquivo) {
				this.listaArquivos.remove(arquivoTmp);
				return;
			}
		}
		throw new Exception("Este arquivo não existe");
	}

	public ArquivoComponent getArquivo(String nomeArquivo) throws Exception {
		for (ArquivoComponent arquivoTmp : listaArquivos) {
			if (arquivoTmp.getNomeArquivo() == nomeArquivo) {
				return arquivoTmp;
			}
		}
		throw new Exception("Este arquivo não existe");
	}
}
