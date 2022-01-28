// Program to check whether a number is odd or even

import java.util.*;

class Odd_Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an interger : ");
        int n = input.nextInt();

        if (n % 2 == 0) {
            System.out.println("Entered number is even.");
        } else {
            System.out.println("Entered number is odd.");
        }
        input.close();
    }
}
