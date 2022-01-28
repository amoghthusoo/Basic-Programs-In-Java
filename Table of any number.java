// Progaram to print table of any number

import java.util.*;

class Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enrer an integer : ");
        int n = input.nextInt();

        for (int a = 1; a <= 20; a++) {
            System.out.println(n + " x " + a + " = " + a * n);

        }
        input.close();
    }
}