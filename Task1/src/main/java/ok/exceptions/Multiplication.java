package ok.exceptions;

public class Multiplication {
    public int multiplication(int a, int b) throws CheckedParity {
        if (a % 2 == 0 && b % 2 == 0) {
            return a*b;
        } else {
            throw new CheckedParity("Одно из чисел нечетное!");
        }
    }
}