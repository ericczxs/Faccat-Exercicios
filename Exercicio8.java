package exerciciosFacct;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite a quantidade total de eleitores do municipio: ");
		int quantidadeTotalEleitores=sc.nextInt();
		System.out.println("Digite a quantidade de votos Brancos: ");
		int quantidadeVotosBrancos=sc.nextInt();
		System.out.println("Digite a quantidade de votos Nulos: ");
		int quantidadeVotosNulos=sc.nextInt();
		System.out.println("Digite a quantidade total de votos válidos: ");
		int quantidadeVotosValidos=sc.nextInt();
		
		float porcentagemVotos= quantidadeTotalEleitores/quantidadeVotosValidos*100;
		System.out.println("A porcentagem de total de eleitores é: "+porcentagemVotos+"%");
		float porcentagemVotosBrancos= quantidadeVotosBrancos/quantidadeVotosValidos*100;
		System.out.println("A porcentagem de votos brancos é: "+porcentagemVotosBrancos+"%");
		float porcentagemVotosNulos= quantidadeVotosNulos/quantidadeVotosValidos*100;
		System.out.println("A porcentagem de votos Nulos é: "+porcentagemVotosNulos+"%");
		sc.close();
	}

}
