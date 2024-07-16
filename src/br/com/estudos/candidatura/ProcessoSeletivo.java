package br.com.estudos.candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {

		String[] candidatosSelecionados = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };
		
		for (String candidato : candidatosSelecionados) {
			entrandoEmContato(candidato);
		}
	}

	static void analisarCandidato(double salarioPretendido) {

		double salarioBase = 3400.0;

		if (salarioBase > salarioPretendido) {
			System.out.println("ligar para candidato com contraproposta");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("ligar para candidato");
		} else
			System.out.println("aguardar resposta");

	}

	static void selecaoCandidatos() {

		String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
				"DANIELA", "JORGE" };
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 3400.0;

		while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();

			System.out.println("o candidato" + candidato + " solicitou este valor de salario " + salarioPretendido);

			if (salarioBase >= salarioPretendido) {
				System.out.println("candidato " + candidato + " foi selecionado para vaga.\n");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	}

	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	static void imprimirSelecionados() {

		String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };

		System.out.println("imprimindo lista de candidatos informando o indice do elemento");
		for (int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("candidato nº" + (indice + 1) + " é " + candidatos[indice]);
		}

		// usando o for each
		for (String candidato : candidatos) {
			System.out.println("\ncandidato selecionado " + candidato);
		}
	}

	static void entrandoEmContato(String candidato) {

		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;

		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if (continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");

		} while (continuarTentando && tentativasRealizadas < 3);

		if (atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO TENTATIVAS "
					+ tentativasRealizadas + " REALIZADA");
	}

	static boolean atender() {
		return new Random().nextInt(3) == 1;
	}
}
