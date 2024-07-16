package br.com.estudos.controleDeFluxo;

public class planoTelefonico {

	public static void main(String[] args) {

		String plano = "B"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}

	}

}
