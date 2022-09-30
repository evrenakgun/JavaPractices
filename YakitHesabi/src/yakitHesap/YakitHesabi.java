package yakitHesap;

import java.util.Scanner;

public class YakitHesabi {
	public static void main(String[] args) {
		double kacLitre; //Araç 100 km'de kaç litre yakıyor?
		int kacKm; //Gidilecek yol kaç km?
		double toplamLitre; //Gidilecek yol boyunca yakacağı yakıt miktarı.
		double yakitParasi; //Güncel yakıt tutarı.
		double sonFiyat; //Aracın yol boyunca yakıt masrafı.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Araciniz 100 km'de kac litre yakiyor: ");
		kacLitre = scanner.nextDouble();
		System.out.print("Gideceginiz mesafe (km): ");
		kacKm = scanner.nextInt();
		
		toplamLitre = (kacLitre * 0.01) * kacKm;
		
		System.out.print("Guncel benzin/mazot fiyatini girin (TL): ");
		yakitParasi = scanner.nextDouble();
		
		sonFiyat = toplamLitre * yakitParasi;
		
		System.out.println("Araciniz " + (toplamLitre) + " L yakacaktir ve yakit masrafi " + sonFiyat + " TL'dir.");
		scanner.close();
		
	}

}
