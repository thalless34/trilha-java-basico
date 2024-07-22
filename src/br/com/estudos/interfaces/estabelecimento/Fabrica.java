package br.com.estudos.interfaces.estabelecimento;

import br.com.estudos.interfaces.equipamentos.copiadora.Copiadora;
import br.com.estudos.interfaces.equipamentos.digitalizadora.Digitalizadora;
import br.com.estudos.interfaces.equipamentos.impressora.Impressora;
import br.com.estudos.interfaces.equipamentos.multifuncional.Multifuncional;

public class Fabrica {
 
	public static void main(String[] args) {
		
		Multifuncional multifuncional = new Multifuncional();
		Impressora impressora = multifuncional;
		Digitalizadora digitalizadora = multifuncional;
		Copiadora copiadora = multifuncional;
		
		impressora.impressora();
		digitalizadora.digitalizar();
		copiadora.copiadora();
	}
}
