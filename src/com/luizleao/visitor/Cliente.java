package com.luizleao.visitor;

public class Cliente {
	public static void main(String[] args) {
		ArvoreBinaria arvore = new ArvoreBinaria(7);

		arvore.addNo(15);
		arvore.addNo(10);
		arvore.addNo(5);
		arvore.addNo(2);
		arvore.addNo(1);
		arvore.addNo(20);

		System.out.println("======== Arvore In Order ========== ");
		arvore.aceitarVisitante(new ExibirInOrderVisitor());
		System.out.println("======== Arvore Pre Order ========= ");
		arvore.aceitarVisitante(new ExibirPreOrderVisitor());
		System.out.println("======== Arvore Pos Order ========= ");
		arvore.aceitarVisitante(new ExibirPostOrderVisitor());
		System.out.println("======== Arvore Identada ========= ");
		arvore.aceitarVisitante(new ExibirIndentadoVisitor());
	}
}
