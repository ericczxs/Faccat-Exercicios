package exerciciosFacct;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a hora de início do jogo: ");
        int horaInicio = sc.nextInt();

        System.out.print("Digite a hora de fim do jogo: ");
        int horaFim = sc.nextInt();

        int duracao;

        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = (24 - horaInicio) + horaFim;
        }

        System.out.println("A duração do jogo é de " + duracao + " horas.");

        sc.close();

	}

}
