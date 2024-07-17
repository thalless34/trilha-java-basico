package br.com.estudos.exemploEnum;

public class SistemIbge {

	public static void main(String[] args) {
		
		for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
			System.out.println(e.getSigla() + " - " + e.getNome() + " " + e.getIbge());
		}
		
		EstadoBrasileiro eb = EstadoBrasileiro.Ceara;
		System.out.println(eb);
	}
}
