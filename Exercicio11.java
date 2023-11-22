package exerciciosFacct;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do seu salário fixo por mês: R$");
		float salarioFixo = sc.nextFloat();
		System.out.println("Digite o valor da sua comissão que recebe por cada carro vendido: RS");
		float comissaoFixa= sc.nextFloat();
		System.out.println("Digite a quantiade de carros vendidos no mês: R$");
		float CarrosVendidos= sc.nextFloat();
		System.out.println("Digite o valor total vendido no mês: R$");
		float valorTotal=sc.nextFloat();
		
		float comissao=CarrosVendidos*comissaoFixa;
		float porcentagemValor=valorTotal*5/100;
		float valorFinal=salarioFixo+comissao+porcentagemValor;
		
		System.out.println("O valor final do salário corresponde a: R$"+valorFinal);
		
		sc.close();

	}

}
