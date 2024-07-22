package br.com.estudos.poo.polimorfismo.apps;

public class Whatssap extends ServicoMensagemInstantanea {

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Whatssap");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Whatssap");
	}

	
}
