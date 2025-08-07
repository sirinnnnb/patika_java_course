package Hafta2;

import java.util.Scanner;
public class AsalSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        if (asalMi(sayi, 2)) {
            System.out.println(sayi + " asal sayıdır.");
        } else {
            System.out.println(sayi + " asal değildir.");
        }
    }

    public static boolean asalMi(int sayi, int bolen) {
        if (sayi < 2) {
            return false;
        }
        if (bolen == sayi) {
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        return asalMi(sayi, bolen + 1);
    }
}