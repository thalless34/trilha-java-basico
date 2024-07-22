package br.com.estudos.interfaces.equipamentos.multifuncional;

import br.com.estudos.interfaces.equipamentos.copiadora.Copiadora;
import br.com.estudos.interfaces.equipamentos.digitalizadora.Digitalizadora;
import br.com.estudos.interfaces.equipamentos.impressora.Impressora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora{

	@Override
	public void copiadora() {
		System.out.println("copiando via multifuncional...");
	}

	@Override
	public void impressora() {
		System.out.println("imprimindo via multifuncional...");
	}

	@Override
	public void digitalizar() {
		System.out.println("digitalizando via multifuncional...");
	}

}
