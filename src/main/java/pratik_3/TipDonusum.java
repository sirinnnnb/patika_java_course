package pratik_3;

import java.util.Scanner;

public class TipDonusum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Pozitif tam sayı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.println("Ondalıklı sayı giriniz: ");
        double sayi2 = input.nextDouble();
        double donusum1 = sayi1 ;
        int donusum2 = (int) sayi2;
        System.out.println("(Girdiğiniz pozitif tam sayı: " +sayi1 + ") Dönüştürülen ondalıklı sayı: " +donusum1);
        System.out.println("(Girdiğiniz ondalıklı sayı: " +sayi2 + ") Dönüştürülen tam sayı: " +donusum2);


    }
}
