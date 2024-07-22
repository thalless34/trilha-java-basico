package br.com.estudos.poo.abstracao;

public class Desktop {

	public static void main(String[] args) {

		System.out.println("MSN");
		MSNMessenger msn = new MSNMessenger();

		msn.enviarMensagem();

		msn.receberMensagem();

		System.out.println("\nFB");
		Messenger fb = new Messenger();

		fb.enviarMensagem();

		fb.receberMensagem();

		System.out.println("\nWPP");
		Whatssap wpp = new Whatssap();

		wpp.enviarMensagem();

		wpp.receberMensagem();
	}

}
