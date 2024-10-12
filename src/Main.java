/* Programmer: JAAR
*  Assignment Chapter: 4 assignment 4
*  Date modified: 10/10/2024
*  IDE/Tool used: IntelliJ
*/

import java.util.Scanner;

// Represents a test environment for the SoftwareSales Class
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many licenses of our software would you like" +
                " to purchase?: ");
        int orderQuantity = input.nextInt(); // Assume the user enters a
        // valid number.
        input.nextLine(); // clears the newline char.

        System.out.printf("You inputted %d are you sure? (yes/no): ",
                orderQuantity);
        String response = input.nextLine(); // Assume the user enters either
        // yes or no.
        if (!response.equalsIgnoreCase("yes")) {
            System.out.print("How many licenses would you like?: ");
            orderQuantity = input.nextInt();
            input.nextLine();
        }

        SoftwareSales order = new SoftwareSales(orderQuantity);
        System.out.printf("Your total is %.2f. You saved %.0f%%",
                order.finalPrice(), order.discountRate() * 100);
    }
}