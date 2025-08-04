package pratik_2;

import java.util.Scanner;


public class MukemmelSayi {
    public static void main(String[] args) {
        System.out.println("Bir sayının mükemmel sayı olup olmadığını bulan program: ");
        System.out.println("(Mükemmel Sayı Nedir?\n" +

                "Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.) \n");
        System.out.println("Bir sayı giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int sayi= scanner.nextInt();
        int n = 0;
        for (int i = 1 ; i< sayi ; i++) {
            if (sayi%i == 0  ) {

                n = i+n;
            } }
            if (n == sayi) {
                System.out.println(sayi + " Mükemmel sayıdır.");

            }
            else  {
                System.out.println(sayi + " Mükemmel sayı değildir.");

            }


    }
}
