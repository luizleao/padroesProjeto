package com.luizleao.visitor;

public class ArvoreBinaria {
	No raiz;
	int qtdElementos;

	public ArvoreBinaria(int chaveRaiz) {
		raiz = new No(chaveRaiz);
		qtdElementos = 0;
	}

	public void addNo(int chave) {
		addNo(chave, raiz);
	}
	
	public void remover(int chave){
	}
	
	public void buscar(int chave){
		
	}

	private void addNo(int chave, No no) {
		if (no.getChave() == chave)
			return;
		if (chave > no.getChave()) {
			if (no.getDireito() == null) {
				no.setDireito(new No(chave));
				qtdElementos++;
				return;
			}
			addNo(chave, no.getDireito());
		} else {
			if (no.getEsquerdo() == null) {
				no.setEsquerdo(new No(chave));
				qtdElementos++;
				return;
			}
			addNo(chave, no.getEsquerdo());
		}
	}

	public void aceitarVisitante(ArvoreVisitor visitor) {
		visitor.visitar(raiz);
	}
}
