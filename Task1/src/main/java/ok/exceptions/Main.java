package ok.exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CheckedParity {
        Multiplication res = new Multiplication();
        Scanner uInput = new Scanner(System.in);

        System.out.println("Введите четные числа для произведения.");
        System.out.print("Первое число: ");
        int a = uInput.nextInt();
        System.out.print("Второе число: ");
        int b = uInput.nextInt();

        try {
            System.out.println("Произведение: " + res.multiplication(a, b));
        } catch (Exception e) {
            System.out.println("Одно из чисел нечетное!");
        } finally {
            System.out.println("Вы молодец!");
        }
    }
}
