package exerciciosFacct;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Digite o seu salário mensal atual: R$");
		float salario=sc.nextFloat();
		System.out.println("Digite a porcentagem de reajuste: "+"%");
		float porcentagem=sc.nextFloat();	
		float aumentoReal=salario*porcentagem/100;
		float salarioFinal=aumentoReal+salario;
		System.out.println("O valor do novo salário é: R$"+salarioFinal);
		sc.close();
	}

}
