package exerciciosFacct;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = sc.nextDouble();

        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println("O maior valor é: " + valor1);
        } else if (valor2 > valor1 && valor2 > valor3) {
            System.out.println("O maior valor é: " + valor2);
        } else {
            System.out.println("O maior valor é: " + valor3);
        }

        sc.close();

	}

}
