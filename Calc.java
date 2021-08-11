package javaproject2;

import java.util.Scanner;
/**
 * Second project done from scratch in java
 * @author Wasim Nasser
 */
public class Calc {
    static double calculate(double x, double y, int operator) {
        switch(operator) {
            case 1: return x + y;
            case 2: return x - y;
            case 3: return x * y;
            case 4: return  x / y;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number you want to perform a mathematical operation on: ");
        double x = scanner.nextDouble();
        System.out.print("Please enter the second number you want to perform a mathematical operation on: ");
        double y = scanner.nextDouble();

        System.out.print("Please enter 1 for addition, 2 for subtraction, 3 for multiplication, or 4 for division: ");
        int operator = scanner.nextInt();

        double result = calculate(x, y, operator);

        System.out.println(result);
    }
}
