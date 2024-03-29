package com.luizleao.interpreter;

public class CentenaRomano extends NumRomanoInterpreter {

	@Override
	public String um() {
		return "C";
	}

	@Override
	public String quatro() {
		return "CD";
	}

	@Override
	public String cinco() {
		return "D";
	}

	@Override
	public String nove() {
		return "CM";
	}

	@Override
	public int multiplicador() {
		return 100;
	}

}
