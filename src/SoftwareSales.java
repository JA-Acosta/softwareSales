/* Programmer: JAAR
*  Assignment Chapter: 4 assignment 4
*  Date modified: 10/10/2024
*  IDE/Tool used: IntelliJ
*/

// Creates an order for software sales and tracks information for the order.
public class SoftwareSales {
    // Units Sold
    private int quantitySold;
    private static final int PRICE = 99;



    // constructor:

    public SoftwareSales() {
        quantitySold = 0;
    }

    public SoftwareSales(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    // Setter:

    // Sets the total items sold in an order.
    // Param:
    //  - int quantitySold: the number that represents the total items in the
    //  order.
    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    // Updates the quantity total in an order.
    // Param:
    //  - int quantityChange: the number of units added or subtracted from
    //  the order.
    public void updateQuantitySold(int quantityChange) {
        quantitySold = quantityChange;
    }

    // Getters:

    // Retrieves the number of units associated with an order.
    // Return:
    //  - int quantitySold: current units associated with the order.
    public int totalUnitsSold() {
        return quantitySold;
    }

    // Calculate the final price for the order.
    // Return:
    //  - double orderSubtotal
    public double finalPrice() {
        return quantitySold * (1 - discountRate()) * PRICE;
    }

    // Calculates the order discount based on the number of software licenses
    // sold.
    // Param:
    //  - quantitySold
    // Return:
    //  - double discount: the discount rate for the order represented as a
    //      decimal.
    // Discount Table:
    //  10 – 19             20%
    //  20 – 49             30%
    //  50 – 99             40%
    //  100 or more         50%
    public double discountRate() {
        double discount;
        if (100 <= quantitySold) {
            discount = .50;
        } else if (50 <= quantitySold) {
            discount = .40;
        } else if (20 <= quantitySold) {
            discount = .30;
        } else if (10 <= quantitySold) {
            discount = .20;
        } else {
            discount = 0;
        }
        return discount;
    }
}
