package pratik_1.yeni;

import java.util.Scanner;


public class AritmetikIslemlerveIslemOnceligi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Birinci sayıyı giriniz:");
        int sayi1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        int sayi2 = scanner.nextInt();
        System.out.println("Üçüncü sayıyı giriniz:");
        int sayi3 = scanner.nextInt();
        int sonuc  = sayi1 + sayi2 * sayi3 - sayi2 ;
        System.out.println("sayı1 + sayi2 * sayi3 - sayi2 = " + sonuc);
    }}
