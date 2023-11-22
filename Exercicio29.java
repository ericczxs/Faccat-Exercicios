package exerciciosFacct;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		double valor1 = sc.nextDouble();
		System.out.print("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();
		System.out.println("Digite o terceiro valor:");
		double valor3 = sc.nextDouble();
		
		double somaMaiores;
		if(valor1>valor2) {
			somaMaiores= valor1+valor3;
		}else if(valor1<valor2) {
			somaMaiores= valor2+valor3;
		}
		else {
			somaMaiores= valor1=valor2;
		}
		
		System.out.println("A soma dos dois maiores valores é: "+somaMaiores);
		
		sc.close();
	}

}
