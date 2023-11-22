package exerciciosFacct;

import java.util.Scanner;

public class Exercico34 {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();

        System.out.print("Digite o valor de y: ");
        int y = sc.nextInt();

        int z = x * y + 5;

        char resposta;

        if (z > 100) {
            resposta = 'A';
        } else {
            resposta = 'B';
        }

        System.out.println("Resposta: " + resposta);

        sc.close();

        System.out.println("\nTeste de Mesa:\n");

        int[] valoresX = {3, 150, 7, -2, 50};
        int[] valoresY = {2, 3, -1, 5, 3};

        for (int i = 0; i < valoresX.length; i++) {
            x = valoresX[i];
            y = valoresY[i];
            z = x * y + 5;
            resposta = (z > 100) ? 'A' : 'B';
            System.out.println("Para x = " + x + " e y = " + y + ":");
            System.out.println("  z = " + z);
            System.out.println("  Resposta = " + resposta);
            System.out.println(); 
        }
    }

}
