package br.estacio.facade;

public class Funcionario {
	private String nome;
	private int matricula;
	
	public Funcionario() {
		this.nome = "Luiz Leão";
		this.matricula = 123456;
	}
	
	public void getFuncionario() {
		System.out.println("Nome: "+nome);
		System.out.println("Matricula: "+matricula);
	}
}
