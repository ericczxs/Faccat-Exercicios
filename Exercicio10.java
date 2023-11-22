package exerciciosFacct;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do custo de fabricação do autóvel: R$");
		float valorAutomovel = sc.nextFloat();
		float distribuidor= valorAutomovel*28/100;
		float imposto=valorAutomovel*45/100;
		float valorFinal=valorAutomovel+distribuidor+imposto;
		System.out.print("O Valor final do automóvel corresponde a: R$"+valorFinal);
		
		sc.close();
				
		
		
	}

}