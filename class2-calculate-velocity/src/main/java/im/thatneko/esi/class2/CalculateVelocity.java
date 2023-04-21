package im.thatneko.esi.class2;

import java.util.Scanner;

public class CalculateVelocity {
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
                //secondExercise(scanner);
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
        double distance = Double.parseDouble(askToConsole("Indica la distancia (metros)", scanner));
        double time = Double.parseDouble(askToConsole("Indica el tiempo (segundos)", scanner));

        double velocity = distance / time;

        System.out.println("La velocidad es de " + fastRound(velocity) + "m/s.");
    }

    public static String askToConsole(String s, Scanner scanner) {
        System.out.print(s + ": ");
        return scanner.nextLine();
    }

    public static double fastRound(double d) {
        return ((int) (d * 2)) / 2.0;
    }
}