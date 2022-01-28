// Program to print sum of first n natural numbers

import java.util.*;

class Adder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the upper limit : ");
        int upto_what = input.nextInt();

        int total = 0;

        for (int a = 1; a <= upto_what; a++) {
            total += a;
        }

        System.out.println(total);
        input.close();
    }
}