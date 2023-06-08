package im.thatneko.esi.launcher;

import im.thatneko.esi.class1.AskAge;
import im.thatneko.esi.class2.CalculateVelocity;
import im.thatneko.esi.class3.PrintExample;
import im.thatneko.esi.class4.Activity2;

import java.util.Scanner;

public class ESILauncher {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.print("Indícame qué clase quieres: ");
        String clazz = scanner.nextLine();
        System.out.println();
        try {
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
                case "4": {
                    Activity2.main(args);
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
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("¡Oh no! Parece que hubo un error al ejecutar el programa, revisa el stack-trace.");
        }
        System.out.println();
        System.out.println("La clase lanzada parece haber terminado su flujo, volviendo a ESI-Launcher");
        System.out.println();
        main(args);
    }
}
