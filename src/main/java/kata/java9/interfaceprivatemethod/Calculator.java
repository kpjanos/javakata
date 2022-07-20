package kata.java9.interfaceprivatemethod;

public class Calculator implements CalculatorInterface {

    /**
     * Implement all methods in CalculatorInterface!
     */

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.addEvenNumbers(10, 20, 30, 40, 50));
        System.out.println(calc.addOddNumbers(10, 20, 30, 40, 50));
    }
}
