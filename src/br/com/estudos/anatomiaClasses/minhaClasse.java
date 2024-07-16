package br.com.estudos.anatomiaClasses;

public class minhaClasse {

	public static void main(String[] args) {
		
		String primeiroNome = "tas";
		String segundoNome = "34";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		
		System.out.println(nomeCompleto);
	
	}
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}
}
