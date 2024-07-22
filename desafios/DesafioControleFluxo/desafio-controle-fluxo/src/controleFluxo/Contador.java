package controleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		

		try {
			// chamando o método contendo a lógica de contagem
			int contar = parametroDois - parametroUm;
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException e) {
			System.out.println("o segundo parametro deve ser maior que o primeiro");
			e.printStackTrace();
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}

		
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção

		int contagem = parametroDois - parametroUm;

		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}

		for (contagem = parametroUm; contagem < parametroDois; contagem++) {
			System.out.println(contagem);
		}

		// realizar o for para imprimir os números com base na variável contagem

	}
}
