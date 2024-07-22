package br.com.estudos.poo.polimorfismo;

import br.com.estudos.poo.polimorfismo.apps.MSNMessenger;
import br.com.estudos.poo.polimorfismo.apps.Messenger;
import br.com.estudos.poo.polimorfismo.apps.ServicoMensagemInstantanea;
import br.com.estudos.poo.polimorfismo.apps.Whatssap;

public class Desktop {

	public static void main(String[] args) {

		ServicoMensagemInstantanea smi = null;

		/*
		 * NÃO SE SABE QUAL APP MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido = "wpp";

		if (appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if (appEscolhido.equals("fb"))
			smi = new Messenger();
		else if (appEscolhido.equals("wpp"))
			smi = new Whatssap();

		smi.enviarMensagem();
		smi.receberMensagem();

	}

}
