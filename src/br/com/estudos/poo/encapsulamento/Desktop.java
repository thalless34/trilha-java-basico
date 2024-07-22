package br.com.estudos.poo.encapsulamento;

public class Desktop {

	public static void main(String[] args) {
		// abrindo MSN Messenger
		MSNMessenger msn = new MSNMessenger();

		msn.enviarMensagem();

		msn.receberMensagem();
	}

}
