package Hafta2;

import java.util.Scanner;

public class SifreKontrolu {
    public static void main(String[] args) {
        System.out.println("Şifre Kontrolü");
        System.out.println("Bir şifre giriniz: ");
        Scanner input = new Scanner(System.in) ;
        String sifre = input.nextLine() ;
        boolean uzunlukKontrol = sifre.length() >= 8;
        boolean boslukKontrol = !sifre.contains(" ");
        boolean ilkHarfKontrol = Character.isUpperCase(sifre.charAt(0));
        boolean sonKarakterKontrol = sifre.charAt(sifre.length() - 1) == '?';
        if (uzunlukKontrol && boslukKontrol && ilkHarfKontrol && sonKarakterKontrol ) {
            System.out.println("Geçerli şifre");
        }
        else {
            System.out.println("Geçersiz şifre");
        }


    }
}
