package br.com.estudos.tipoVariaveis;

import java.util.Locale;
import java.util.Scanner;

public class aboutMe {

	public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome: \n");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome: \n");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: \n");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura: \n");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
        
    }
}
