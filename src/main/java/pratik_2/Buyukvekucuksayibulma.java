package pratik_2;

import java.util.Scanner;


public class Buyukvekucuksayibulma {
    public static void main(String[] args) {
        System.out.println("Kaç tane sayı gireceksiniz? : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int buyuksayi = Integer.MIN_VALUE;
        int kucuksayi = Integer.MAX_VALUE;

        for (int i=1 ; i<=n ; i++ ) {
            System.out.println(i + ". sayıyı giriniz: ");
            int sayi= input.nextInt();
            if (sayi < kucuksayi ) {
                kucuksayi = sayi ;
            }  if (sayi > buyuksayi){
                buyuksayi = sayi ;
        }


            }
        System.out.println("En büyük sayı: " + buyuksayi);
        System.out.println("En küçük sayı: " + kucuksayi);







    }
}
