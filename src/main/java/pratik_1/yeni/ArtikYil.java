package pratik_1.yeni;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir yıl giriniz: ");
        int yil = scanner.nextInt();
        if (yil % 400 == 0  ) {
            System.out.println(yil + " artık bir yıldır.");
            }
        else if  (yil % 100 == 0) {
            System.out.println(yil + " artık bir yıl değildir.");
        }
        else if (yil % 4 == 0) {
            System.out.println(yil + " artık bir yıldır.");
        }
        else {
            System.out.println("Artık bir yıl değildir.");
        }
    }
}
