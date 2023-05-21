package im.thatneko.esi.class3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String clientName = askForInput(scanner, "Ingrese el cliente");
        String burgerTypes = Arrays.stream(BurgerType.values()).map(burgerType ->
                " - " + burgerType.burgerNumber + ": " + burgerType.displayName).collect(Collectors.joining("\n"));
        BurgerType burgerType = BurgerType.values()[Integer.parseInt(askForInput(scanner,
                "Tipos de carne:\n" +
                        burgerTypes + "\n" +
                        "Ingrese el tipo de carne"
        ))];
        int burgerQuantity = Integer.parseInt(askForInput(scanner, "Cantidad de hamburguesas"));
        String seasonings = Arrays.stream(BurgerType.values()).map(burgerType ->
                " - " + burgerType.burgerNumber + ": " + burgerType.displayName).collect(Collectors.joining("\n"));
        String seasoningsInput = askForInput(scanner,
                "Condimentos:\n" +
                        seasonings + "\n" +
                        "Ingrese los condimentos, separados por coma"
        );

        String[] seasoningInputSplit = seasoningsInput.split(",");
        List<SeasoningType> seasoningTypes = Arrays.stream(seasoningInputSplit).map(s -> SeasoningType.values()[Integer.parseInt(s)]).collect(Collectors.toList());

        boolean withFries = askForInput(scanner, "Con fritas (S/n)").toLowerCase().startsWith("s");

        System.out.println("****************************************** GRACIAS POR SU COMPRA ******************************");
        System.out.println(">>>>>>>>>> " + clientName + " : Detalle del pedido \n");
        System.out.println();
        System.out.println(">>>>>>>>>> \"Usted lleva \" , "+burgerQuantity+"x ,  "+burgerType.displayName+".");
                "\n" +
                ">>>>>>>>>>  \"Con los condimentos \" , CONDIMENTOS\n" +
                "\n" +
                " \n" +
                "\n" +
                ">>>>>>>>>>  \"Con fritas \" , (verdadero o falso)\n" +
                "\n" +
                " \n" +
                "\n" +
                ">>>>>>>>>>  \"Total a pagar \" , TOTAL");
    }

    public static String askForInput(Scanner scanner, String inputConsole) {
        System.out.print(inputConsole + ": ");
        return scanner.nextLine();
    }


    public static int burgerTypeCount = 0;

    public enum BurgerType {
        TOFU("Tofu"),
        CHICKEN("Pollo"),
        COW("Vaca");

        private final String displayName;
        private final int burgerNumber;

        BurgerType(String displayName) {
            this.displayName = displayName;
            this.burgerNumber = burgerTypeCount;

            burgerTypeCount++;
        }
    }

    public enum SeasoningType {
        MAYONNAISE("Mayonesa"),
        KETCHUP("Ketchup"),
        MUSTARD("Mostaza");

        private final String displayName;

        SeasoningType(String displayName) {
            this.displayName = displayName;
        }
    }
}