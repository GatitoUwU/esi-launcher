package im.thatneko.esi.class1;

import java.util.Scanner;

public class AskAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ask(scanner);
    }

    public static void ask(Scanner scanner) {
        System.out.println("------------------------------------------");
        System.out.print("Indícame qué ejercicio quieres (desde el 1 hasta el 3): ");
        String exercise = scanner.nextLine();
        switch (exercise) {
            case "1": {
                firstExercise(scanner);
                break;
            }
            case "2": {
                secondExercise(scanner);
                break;
            }
            case "3": {

                break;
            }
            case "q": {
                return;
            }
            default: {
                System.out.println("No se ha podido encontrar un ejercicio por la variable: " + exercise);
            }
        }
        ask(scanner);
    }

    public static void firstExercise(Scanner scanner) {
        int maximo;
        maximo = 0;

        for (int i = 0; i < 4; i++) {
            int edad = 0;
            System.out.print("Ingrese edad: ");
            edad = Integer.valueOf(scanner.nextLine());

            if (edad > maximo) {
                maximo = edad;
            }
        }
        System.out.println("La edad más grande es " + maximo);
    }

    public static final int MAYORIA_DE_EDAD = 18;

    public static void secondExercise(Scanner scanner) {
        int edad = 0;
        System.out.print("Ingrese edad: ");
        edad = Integer.valueOf(scanner.nextLine());

        System.out.println("La edad ingresada es " + (edad >= MAYORIA_DE_EDAD ? "mayor" : "menor") + " de edad");
    }
}