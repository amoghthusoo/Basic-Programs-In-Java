// Program to iterate all letters of a string

import java.util.*;

class String_Iterator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = input.nextLine();

        for (int a = 0; a < word.length(); a++) {
            System.out.println(word.charAt(a));
        }

        input.close();
    }
}