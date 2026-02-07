package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void scannerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("How you name?");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }
}
