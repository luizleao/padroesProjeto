package br.estacio.mediator;

public class Cliente {
	public static void main(String[] args) {
		MensagemMediator mediador = new MensagemMediator();
	
		AndroidColleague android = new AndroidColleague(mediador);
		IOSColleague ios = new IOSColleague(mediador);
		WindowsPhoneColleague symbian = new WindowsPhoneColleague(mediador);
	
		mediador.addColleague(android);
		mediador.addColleague(ios);
		mediador.addColleague(symbian);
		
		symbian.enviarMensagem("Oi, eu sou um Symbian!");
		System.out.println("================================");
		android.enviarMensagem("Oi Windows Phone! Eu sou um Android!");
		System.out.println("================================");
		ios.enviarMensagem("Olá todos, sou um iOs!");
	}
}
