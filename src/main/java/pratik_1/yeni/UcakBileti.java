package pratik_1.yeni;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Km cinsinden mesafe giriniz: ");
        double mesafe = input.nextDouble();
        System.out.println("Yaşınızı giriniz: ");
        double yas = input.nextDouble();
        System.out.println("Yolculuk tipi giriniz (tek yön = 1 gidiş-dönüş = 2):  ");
        int tipi = input.nextInt();


        if (mesafe > 0 && yas > 0 && (tipi == 1 || tipi == 2)) {
            double biletfiyat = (0.10 * mesafe);

            if (yas < 12) {
                biletfiyat = biletfiyat * 0.5;
            }
            if (yas > 12 && yas < 24) {
                biletfiyat = biletfiyat * 0.9;
            }
            if (yas > 65) {
                biletfiyat = biletfiyat * 0.7;
            }
            if (tipi == 2) {
                biletfiyat = biletfiyat * 0.8;
            }
            System.out.println("Bilet fiyatı: " + biletfiyat + "türk lirası ");
        } else {
            System.out.println("Hatalı veri girdiniz.");
        }
    }
}