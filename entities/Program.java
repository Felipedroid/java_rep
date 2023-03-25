package entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println("Digite a quantidade de produtos para ser adcionada ao stock");
		int quantidade = sc.nextInt();
		product.addProducts(quantidade);
		
		System.out.println(product);
		
		System.out.println("Digite a quantidade de produtos para ser removida do stock");
		int remov_quantidade = sc.nextInt();
		product.removeProducts(remov_quantidade);
		System.out.println(product);
		
		sc.close();
	}

}
