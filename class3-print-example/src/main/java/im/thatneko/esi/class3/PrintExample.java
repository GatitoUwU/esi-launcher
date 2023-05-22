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
        String seasonings = Arrays.stream(SeasoningType.values()).map(seasoningType ->
                " - " + seasoningType.seasoningNumber + ": " + seasoningType.displayName).collect(Collectors.joining("\n  "));
        String seasoningsInput = askForInput(scanner,
                "Condimentos:\n  " +
                        seasonings + "\n" +
                        "Ingrese los condimentos, separados por coma"
        );

        String[] seasoningInputSplit = seasoningsInput.split(",");
        List<SeasoningType> seasoningTypes = Arrays.stream(seasoningInputSplit)
                .map(s -> SeasoningType.values()[Integer.parseInt(s)])
                .collect(Collectors.toList());

        String fancierSeasonings = seasoningTypes.stream()
                .map(seasoningType -> seasoningType.displayName)
                .collect(Collectors.joining(", "));

        boolean withFries = askForInput(scanner, "Con fritas (S/n)").toLowerCase().startsWith("s");

        int baseBurgerPrice = 50;
        int burgerPrice = burgerType.burgerPrice;
        int friesPrice = 50;

        int total = baseBurgerPrice + (burgerPrice * burgerQuantity) + (withFries ? friesPrice : 0);

        System.out.println("****************************************** GRACIAS POR SU COMPRA ******************************");
        System.out.println("¡Gracias, " + clientName + "! Detalle del pedido");
        System.out.println();
        System.out.println(">>>>>>>>>> \"Usted lleva \":");
        System.out.println("             " + burgerQuantity + "x Hamburguesa de " + burgerType.displayName + ".");
        System.out.println(">>>>>>>>>>  Con los condimentos: "+fancierSeasonings);
        System.out.println(">>>>>>>>>>  Con fritas: " + (withFries ? "sí" : "no"));
        System.out.println(">>>>>>>>>>  Total a pagar: " + total);
        System.out.println("****************************************** GRACIAS POR SU COMPRA ******************************");
    }

    public static String askForInput(Scanner scanner, String inputConsole) {
        System.out.print(inputConsole + ": ");
        return scanner.nextLine();
    }


    public static int burgerTypeCount = 0;

    public enum BurgerType {
        TOFU("Tofu", 60),
        CHICKEN("Pollo", 50),
        COW("Vaca", 40);

        private final String displayName;
        private final int burgerNumber;
        private final int burgerPrice;

        BurgerType(String displayName, int burgerPrice) {
            this.displayName = displayName;
            this.burgerNumber = burgerTypeCount;
            this.burgerPrice = burgerPrice;

            burgerTypeCount++;
        }
    }

    public static int seasoningCount = 0;

    public enum SeasoningType {
        MAYONNAISE("Mayonesa"),
        KETCHUP("Ketchup"),
        MUSTARD("Mostaza");

        private final String displayName;
        private final int seasoningNumber;

        SeasoningType(String displayName) {
            this.displayName = displayName;

            this.seasoningNumber = seasoningCount;
            seasoningCount++;
        }
    }
}