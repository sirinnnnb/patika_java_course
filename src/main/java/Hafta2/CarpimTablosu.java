package Hafta2;

import java.util.Scanner;
public class CarpimTablosu {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Çarpım tablosunu görmek istediğiniz 1-10 arasında bir sayıyı giriniz: ");
        int sayi = input.nextInt();
       int  carpim = 1 ;
        if (sayi < 1 && sayi > 10)
        {
            System.out.println("Geçersiz sayı aralığı");
        }
        else {
                for (int i = 1; i <= sayi; i++) {
                    for (int j = 1; j <= sayi; j++) {
                        System.out.printf("%-4d", i * j);
                    }
                    System.out.println(); //

            }

        }
    }
}
