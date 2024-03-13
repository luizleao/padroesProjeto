package br.estacio.interpreter;

import java.util.ArrayList;

public class Cliente {
	public static void main(String[] args) {
		ArrayList<NumRomanoInterpreter> aInterpreter = new ArrayList<NumRomanoInterpreter>();
		aInterpreter.add(new MilharRomano());
		aInterpreter.add(new CentenaRomano());
		aInterpreter.add(new DezenaRomano());
		aInterpreter.add(new UnidadeRomano());

		String valorRomano = "MMMDLVIII";
		Contexto contexto = new Contexto(valorRomano);
		for (NumRomanoInterpreter numeroRomanoInterpreter : aInterpreter) {
			numeroRomanoInterpreter.interpretar(contexto);
		}

		System.out.println(valorRomano + " = " + Integer.toString(contexto.getOutput()));
	}
}
