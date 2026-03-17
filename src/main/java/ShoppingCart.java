import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select a language");
        System.out.println("1. English");
        System.out.println("2. Finnish");
        System.out.println("3. Swedish");
        System.out.println("4. Japanese");

        int choice = input.nextInt();
        Locale locale = switch (choice) {
            case 1 -> new Locale("en", "US");
            case 2 -> new Locale("fi", "FI");
            case 3 -> new Locale("sv", "SE");
            case 4 -> new Locale("ja", "JP");
            default -> new Locale("en", "US");
        };

        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", locale);

        System.out.println(rb.getString("prompt1"));
        int purchase = input.nextInt();

        double totalCost = 0;

        for (int i = 1; i <= purchase; i++) {
            System.out.println(rb.getString("prompt2") + " " + i);
            double unitPrice = input.nextDouble();

            System.out.println(rb.getString("prompt3") + " " + i);
            double quantity = input.nextDouble();

            double totalPrice = multiMe(unitPrice, quantity);
            totalCost += totalPrice;
        }
        System.out.println(
                rb.getString("total")+ " "+ totalCost
        );

        input.close();
    }

    // Calculation: Total Price
    public static double multiMe(double unitPrice, double quantity) {
        return unitPrice * quantity;
    }
}
