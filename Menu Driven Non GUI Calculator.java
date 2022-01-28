// Program to run a menu driven non GUI Calculatior

import java.util.*;

class test {

    static float add(float a, float b) {
        float r = a + b;
        return r;

    }

    static float sub(float a, float b) {
        float r = a - b;
        return r;
    }

    static float mul(float a, float b) {
        float r = a * b;
        return r;
    }

    static float div(float a, float b) {
        float r = a / b;
        return r;
    }

    static void executer(float x, float y, String choice) {
        float out = 0;

        if (choice.equals("+")) {
            out = add(x, y);
        } else if (choice.equals("-")) {
            out = sub(x, y);
        } else if (choice.equals("*")) {
            out = mul(x, y);
        } else if (choice.equals("/")) {
            out = div(x, y);
        }

        System.out.println("Result is : " + out);
    }

    static void input_taker() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number : ");
        float x = input.nextFloat();

        System.out.print("Enter second number : ");
        float y = input.nextFloat();

        System.out.print("Enter choice : ");
        String choice = input.next();

        input.close();

        executer(x, y, choice);

    }

    public static void main(String[] args) {
        input_taker();
    }
}