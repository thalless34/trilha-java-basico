package br.com.estudos.poo;

public class Carro extends Veiculo {

	

	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("carro ligou");
	}

	private void confereCombustivel() {
		System.out.println("tanque chei");
	}

	private void confereCambio() {
		System.out.println("conferindo cambio em P");
	}

}
