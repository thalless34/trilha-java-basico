package br.com.estudos.controleDeFluxo;

public class notas {

	public static void main(String[] args) {

		/*
		 * int nota = 6;
		 * 
		 * if (nota >= 7) System.out.println("Aprovado"); else if (nota >= 5 && nota <
		 * 7) System.out.println("Recuperação"); else System.out.println("Reprovado");
		 */

		/*
		 * int nota = 5;
		 * 
		 * String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
		 * 
		 * System.out.println(resultado);
		 */
		
		int nota = 9;
		
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		
		System.out.println(resultado);

	}

}
