package br.com.estudos.controleDeFluxo;

public class cep {

	public static void main(String[] args) {

		try {
			String cepFormatado = formatarCep("23765-064");
			System.out.println(cepFormatado);
		} catch (cepException e) {
			System.out.println("ta indo nao " + e.getMessage());
			e.printStackTrace();
		}

	}

	static String formatarCep(String cep) throws cepException {
		if (cep.length() != 8)
			throw new cepException();

		// simulando um cep formatado
		return "23.765-064";
	}
}
