package br.estacio.strategy;

public class CalculoImposto15_20 implements StrategyCalculoImposto {
	@Override
	public double calcularSalarioImposto(Funcionario oFuncionario) {
		if (oFuncionario.getSalarioBase() > 3500) {
			return oFuncionario.getSalarioBase() * 0.8;
		}
		return oFuncionario.getSalarioBase() * 0.85;
	}
}
