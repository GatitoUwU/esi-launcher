package im.thatneko.esi.launcher;

import im.thatneko.esi.class1.AskAge;
import im.thatneko.esi.class2.CalculateVelocity;
import im.thatneko.esi.class3.PrintExample;

import java.util.Scanner;

public class ESILauncher {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.print("Indícame qué clase quieres: ");
        String clazz = scanner.nextLine();
        System.out.println();
        switch (clazz) {
            case "1": {
                AskAge.main(args);
                break;
            }
            case "2": {
                CalculateVelocity.main(args);
                break;
            }
            case "3": {
                PrintExample.main(args);
                break;
            }
            case "q": {
                System.out.println("See you...");
                System.exit(0);
                break;
            }
            default: {
                System.out.println("La clase es inválida...");
                break;
            }
        }
        main(args);
        for (int i = 0; i < 15; i++) {
            System.out.println();
        }
    }
}
