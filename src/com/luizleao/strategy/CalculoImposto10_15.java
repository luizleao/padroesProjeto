package com.luizleao.strategy;

public class CalculoImposto10_15 implements StrategyCalculoImposto {
	@Override
	public double calcularSalarioImposto(Funcionario oFuncionario) {
		if (oFuncionario.getSalarioBase() > 2000) {
			return oFuncionario.getSalarioBase() * 0.85;
		}
		return oFuncionario.getSalarioBase() * 0.9;
	}
}
