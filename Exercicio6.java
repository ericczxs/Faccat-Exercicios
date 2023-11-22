package exerciciosFacct;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite o valor da base do seu retângulo:");
		double valor1=sc.nextDouble();
		
		System.out.println("Digite o valor da altura do seu retângulo:");
		double valor2=sc.nextDouble();
		
		double area=valor1*valor2;
		
		System.out.println("A área do seu retângulo é: "+area);
		sc.close();
		

	}

}
