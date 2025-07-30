package pratik_1.yeni;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınızı giriniz:");
        String name = scanner.nextLine();
        System.out.println(  "Adınız: " + name);
    }
}
