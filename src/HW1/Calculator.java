package HW1;

public class Calculator {
    public static double discountCalc (double purchaseAmount, double discount){
        double result;
        if (purchaseAmount <= 0) {
            throw new ArithmeticException("Purchase amount is less or equal to 0. Purchase amount must be more 0!");
        }
        else if (discount <= 0) {
            throw new ArithmeticException("Discount is less or equal to 0%. Discount must be more 0% and less 100%!");
        }
        else if (discount >= 100) {
            throw new ArithmeticException("Discount is more or equal to 100%. Discount must be more 0% and less 100%!");
        } else {
            result = (100 - discount) * purchaseAmount / 100;
        }
        return result;
    }
}