package br.com.estudos.interfaces.equipamentos.digitalizadora;

public class Scanner implements Digitalizadora{

	@Override
	public void digitalizar() {
		System.out.println("digitalizando...");		
	}

}
