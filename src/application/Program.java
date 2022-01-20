package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PrintService<Integer>ps = new PrintService<>();
		
		System.out.print("How namy values? ");
		int n = sc.nextInt();
		for(int i = 0; i < n ; i++) {
			Integer values = sc.nextInt();
			ps.addValues(values);
		}
		ps.print();
		Integer x = ps.first();
		System.out.println("first: " + x);
				
		sc.close();
	}
}