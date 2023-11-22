package exerciciosFacct;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double pesoNota1 = nota1*2;
        double pesoNota2 = nota2*3;
        double pesoNota3 = nota3*5;

        double media = (pesoNota1 + pesoNota2 + pesoNota3);
        double mediaFinal = (media/10);

        System.out.println("A média final do aluno é: " + mediaFinal);

        sc.close();
		

	}

}
