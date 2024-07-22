package br.com.estudos.poo.abstracao;

public class Messenger extends ServicoMensagemInstantanea {

	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}


}
