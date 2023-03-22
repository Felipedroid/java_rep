import java.util.Locale;

import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();		
		
		System.out.println("Digite os lados do triangulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite os lados do triangulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Area triangulo x: %.4f%n", areaX);
		System.out.printf("Area triangulo y: %.4f%n", areaY);
		sc.close();
	}
}
