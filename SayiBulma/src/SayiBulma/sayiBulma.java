package SayiBulma;

import java.util.Scanner;

public class sayiBulma {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int[] sayilar = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int a1;
		boolean varMi = false;

		System.out.print("Pozitif bir tam sayi giriniz: ");
		a1 = scanner.nextInt();
		
		for (int sayi : sayilar ) {
			if (sayi == a1) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Sayi mevcuttur.");
		}
		else {
			System.out.println("Sayi mevcut degildir.");
		}

	}
}
