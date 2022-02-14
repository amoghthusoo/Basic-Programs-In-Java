// Program to solve a quadratic equation with real coefficients

import java.util.Scanner;

class Quadratic_Equation_Calc {

    static void execute() {

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter coefficient of x^2 : ");
        double a = input.nextDouble();
        System.out.print("Enter coefficient of x : ");
        double b = input.nextDouble();
        System.out.print("Enter the constant term : ");
        double c = input.nextDouble();
        input.close();

        double D = Math.pow(b, 2) - 4 * a * c;

        if (D >= 0) {
            double root_D = Math.pow(D, 0.5);
            // System.out.println(root_D);

            double x1 = (-b + root_D) / 2 * a;
            double x2 = (-b - root_D) / 2 * a;

            System.out.println("\n" + x1);
            System.out.println(x2 + "\n");
        } else if (D < 0) {

            D = -D;
            double root_D = Math.pow(D, 0.5);
            double real_part = -b / 2 * a;
            double imaginary_part = root_D / 2 * a;
            double real_part_r = Math.round(real_part * 100.0)/100.0;
            double imaginary_part_r = Math.round(imaginary_part * 100.0)/100.0;

            System.out.println("\n" + real_part_r + " + " + imaginary_part_r + 'i');
            System.out.println(real_part_r + " - " + imaginary_part_r + "i\n");
        }
    }

    public static void main(String[] args) {
        execute();
    }
}