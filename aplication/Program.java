package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor do raio: ");
		double radius = sc.nextDouble();
		
		double circunferencia = Calculator.circunference(radius);
		
		System.out.printf("Circunferência é  %.2f%n", circunferencia);
		System.out.printf("O valor de PI é %.2f%n", Calculator.PI);
		
		sc.close();
	}

}
