package pratik_1.yeni;
import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
        double armutKg = scanner.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        double elmaKg = scanner.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        double domatesKg = scanner.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        double muzKg = scanner.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        double patlicanKg = scanner.nextDouble();

        double toplam = (armutKg * armutFiyat) +
                (elmaKg * elmaFiyat) +
                (domatesKg * domatesFiyat) +
                (muzKg * muzFiyat) +
                (patlicanKg * patlicanFiyat);

        System.out.println("Toplam Tutar : " + toplam + " TL");
    }
}
