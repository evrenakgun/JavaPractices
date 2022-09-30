package arkadasSayilar;

import java.util.Scanner;

public class ArkadasSayilar {
	public static boolean arkdsSayilar(int sayi1, int sayi2) {
		int toplam1 = 0;
		int toplam2 = 0;
		
		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				toplam1 += i;
			}
		}
		
		for (int j = 1; j < sayi2; j++) {
			if (sayi2 % j == 0) {
				toplam2 += j;
			}
		}

		if (toplam1 == sayi2 && toplam2 == sayi1) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		// Arkadaş Sayılar: İki sayı birbirinin kendisi hariç bölenleri toplamına eşitse bu sayılara arkadaş sayılar denir.
		// 220 ve 284, 1184 ve 1210, 17296 ve 18416.
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Ilk tam sayiyi girin: ");
		int sayi1 = scanner.nextInt();
		
		System.out.print("Ikinci tam sayiyi girin: ");
		int sayi2 = scanner.nextInt();

		if (arkdsSayilar(sayi1, sayi2)) {
			System.out.println("Arkadas sayilardir.");
		} else {
			System.out.println("Arkadas sayi degillerdir.");
		}
		
		scanner.close();

	}

}
