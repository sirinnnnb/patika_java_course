package pratik_1.yeni;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VücutKitleİndeksiHesapla {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz: ");
        double kilo= scanner.nextDouble();
        System.out.println("Boyunuzu giriniz: ");
       double boy = scanner.nextDouble();
        Double vucutkitleindeksi = (kilo / boy * boy) ;
        System.out.println("Vücut kitle indeksiniz: " + vucutkitleindeksi );


    }
}
