package exerciciosFacct;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite a temperatura em graus Fahrenheit: ");
	        double temperaturaFahrenheit = sc.nextDouble();

	        double temperaturaCelsius = (temperaturaFahrenheit - 32) / 9 * 5;

	        System.out.println("A temperatura em graus Celsius é: " + temperaturaCelsius);

	        sc.close();
		
	}

}
