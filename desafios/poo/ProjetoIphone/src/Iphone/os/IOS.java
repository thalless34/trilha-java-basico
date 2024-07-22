package Iphone.os;

import Iphone.os.apps.Musica;
import Iphone.os.apps.Safari;
import Iphone.os.apps.Telefone;

public class IOS implements Musica, Telefone, Safari {

	@Override
	public void exibirPagina(String url) {
		System.out.println("pagina inicial");
	}

	@Override
	public void novaAba() {
		System.out.println("nova aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("recarregando pagina");
	}

	@Override
	public void telefonar(String numero) {
		System.out.println("digite numero:");
	}
	@Override
	public void atender() {
		System.out.println("recebendo ligação");
	}

	@Override
	public void correioVoz() {
		System.out.println("chmando corrreio de voz");
	}

	@Override
	public void play() {
		System.out.println("tocando agora...");
	}

	@Override
	public void pausar() {
		System.out.println("musica pausada");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("o quer ouvir agora? ");
	}

}
