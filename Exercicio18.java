package exerciciosFacct;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        int idade = anoAtual - anoNascimento;

        if (idade >= 16) {
            System.out.println("Pode votar este ano!");
        } else {
            System.out.println("Não pode votar este ano!");
        }

        sc.close();

	}

}
