package exerciciosFacct;

import java.util.Scanner;

class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite um valor inteiro:");
		int valor=sc.nextInt();
		int antecessor=valor-1;
		System.out.println("O antecessor do valor digitado é: "+antecessor);
		
		sc.close();
		
	}

}
