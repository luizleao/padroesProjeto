package br.estacio.facade;

public class Cliente {
	public static void main(String[] args) {
		Facade oFacade = new Facade();
		
		System.out.println("====================");
		oFacade.getFuncionario();		
		System.out.println("====================");
		oFacade.getCargo();
		System.out.println("====================");
		oFacade.getSetor();
	}
}