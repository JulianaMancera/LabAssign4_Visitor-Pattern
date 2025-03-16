

public class FunitureShoppingCostApp {
    public static void main(String[] args) {
        
        ShippingCostCalculator calculator = new FunitureShipping();

        System.out.println("\n========================================");
        System.out.println(" Welcome to the Furniture Shipping Cost Calculator ");
        System.out.println("========================================\n");

        String[] funitureItems = {"Chair", "Table", "Sofa", "Bed", "Cabinet"};

        for(String item : funitureItems){
            double cost = calculator.calculateShipping(item);
            System.out.println("Shipping cost for " + item + ": $" + cost);
        }
        System.out.println();
    }
}
