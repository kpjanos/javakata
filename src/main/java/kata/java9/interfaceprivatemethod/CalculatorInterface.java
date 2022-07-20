package kata.java9.interfaceprivatemethod;

import java.util.function.IntPredicate;

public interface CalculatorInterface {
    /**
     * Implement addEvenNumbers(), addOddNumbers() and add() methods.
     *
     * addEvenNumbers() and addOddNumbers() should call the private add() method!
     */

    default Integer addEvenNumbers(int... nums) {
        return null;
    }

    default Integer addOddNumbers(int... nums) {
        return null;
    }

    private Integer add(IntPredicate predicate, int... nums) {
        return null;
    }

}
