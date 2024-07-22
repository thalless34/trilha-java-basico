package br.com.estudos.poo;

public class Autodromo {

	public static void main(String[] args) {
		
		Carro golf = new Carro();
		golf.setChassi("343434");
		golf.ligar();
		
		Moto r1000 = new Moto();
		r1000.setChassi("434343");
		r1000.ligar();
	}
}
