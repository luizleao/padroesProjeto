package br.estacio.strategy;

public class Cliente {
	public static void main(String[] args) {
		try{
			
			Funcionario oFuncionario1 = new Funcionario(Funcionario.DESENVOLVEDOR, 2100);
			System.out.println("Cargo: " + oFuncionario1.getDescricaoCargo());
			System.out.println("Salario Bruto: " + oFuncionario1.getSalarioBase());
			System.out.println("Salario Liquido: " + oFuncionario1.calcularSalarioImposto());
			
			System.out.println("============================================");
			
			Funcionario oFuncionario2 = new Funcionario(Funcionario.DBA, 1700);
			System.out.println("Cargo: " + oFuncionario2.getDescricaoCargo());
			System.out.println("Salario Bruto: " + oFuncionario2.getSalarioBase());
			System.out.println("Salario Liquido: " + oFuncionario2.calcularSalarioImposto());

			System.out.println("============================================");
			Funcionario oFuncionario3 = new Funcionario(Funcionario.GERENTE, 10000);
			System.out.println("Cargo: " + oFuncionario3.getDescricaoCargo());
			System.out.println("Salario Bruto: " + oFuncionario3.getSalarioBase());
			System.out.println("Salario Liquido: " + oFuncionario3.calcularSalarioImposto());
			
			System.out.println("============================================");
		} catch(RuntimeException e) {
			System.out.println("Erro: "+e.getMessage());
		}
	}
}
