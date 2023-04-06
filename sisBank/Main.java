package udemy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Count account1;
		
		System.out.print("Enter account number: ");
		int count = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		if (answer == 'y') {
			System.out.print("Enter initial deposit: ");
			double deposit = sc.nextDouble();
			account1 = new Count(count, name, deposit);
		}else {
			account1 = new Count(count, name);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account1);
		
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account1.deposit(depositValue);
		System.out.println("Updated account data");
		System.out.println(account1);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account1.saque(withdrawValue);
		System.out.println("Updated account data");
		System.out.println(account1);
		
		sc.close();
	}
}
