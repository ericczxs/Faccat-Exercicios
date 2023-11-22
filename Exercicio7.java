package exerciciosFacct;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite a idade de uma pessoa em anos:");
		int valor1=sc.nextInt();
		System.out.println("Digite a idade de uma pessoa em meses:");
		int valor2=sc.nextInt();
		System.out.println("Digite a idade de uma pessoa em dias:");
		int valor3=sc.nextInt();
		
		int anos=valor1*365;
		int meses=valor2*30;
		int d=anos+meses+valor3;
		
		
		System.out.println("O valor dessa pessoa expressa em dias é: "+d);
		sc.close();
		

	}

}
