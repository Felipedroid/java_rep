package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a altura do retângulo: ");
		double altura = sc.nextDouble();
		System.out.println("Dgite a largura do retângulo: ");
		double largura = sc.nextDouble();
		
		Retangulo retangulo1 = new Retangulo();
		retangulo1.altura = altura;
		retangulo1.largura = largura;
		
		System.out.println(retangulo1.calcularArea());
		System.out.println(retangulo1.calculaPerimetro());
		System.out.println(retangulo1.calculaDiagonal());
		
	}

}
