package im.thatneko.esi.class4;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exercise = Integer.valueOf(askForInput(scanner, "Ingresa el ejercicio"));
        switch (exercise) {
            case 1: {
                exercise1(scanner);
                break;
            }
            default: {
                return;
            }
        }
        main(args);
    }

    public static void exercise1(Scanner scanner) {
        int number = Integer.parseInt(askForInput(scanner, "Ingrese un número"));
        int beforeNumber = number - 1;
        int afterNumber = number + 1;

        System.out.printf(
                "El antecesor de %d es %d, y el sucesor de %d es %d.%n",
                number, beforeNumber, number, afterNumber
        );
    }

    public static String askForInput(Scanner scanner, String inputConsole) {
        System.out.print(inputConsole + ": ");
        return scanner.nextLine();
    }
}