package udemy;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de itens que deseja adcionar:");
		int n = sc.nextInt();
		Produtos[] vect = new Produtos[n];
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Digite o nome do produto: ");
			String name = sc.nextLine();
			System.out.println("Digite o preço do produto: ");
			double price = sc.nextDouble();
			vect[i] = new Produtos(name, price);
		}
		double sum = 0.0;
		for  (int i=0; i<n; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum/vect.length;
		
		System.out.printf("Average price = %.2f%n", avg);
		
		sc.close();
	}

}
