package view;

import java.util.Scanner;

import controller.FatController;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num;
		FatController f = new FatController();
		
		do {
			System.out.println("Informe um N inteiro de 0 - 10");
			num = scan.nextInt();
			if (num < 0 || num > 10) {
				System.out.println("Valor invalido, tente novamente!");
			}
		} while (num < 0 || num > 10);
		long fat = f.FuncFat(num);
		System.out.println("Fatorial: "+fat);
	}
}
