package br.com.estudos.controleDeFluxo;

import java.text.NumberFormat;
import java.text.ParseException;

public class exceptionExemplo {

	public static void main(String[] args) {

		Number valor;
		
		try {
			valor = NumberFormat.getInstance().parse("a1.75");
			System.out.println(valor);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
