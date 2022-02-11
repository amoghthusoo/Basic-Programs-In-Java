// Program to calculate x ^ (x ^ x) form

import java.util.Scanner;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.math.BigDecimal;
import java.io.File;
import java.io.FileWriter;

class Exponent {

    static BigInteger pow(BigInteger base, BigInteger power, boolean stats) {
        BigInteger result = BigInteger.ONE;

        for (BigInteger i = BigInteger.ONE; i.compareTo(power.add(BigInteger.ONE)) == -1; i = i.add(BigInteger.ONE)) {
            result = result.multiply(base);
            
            if(stats){
                BigDecimal stat_i = new BigDecimal(i);
                BigDecimal stat_power = new BigDecimal(power);
                BigDecimal multiplier = new BigDecimal("100");
                BigDecimal percentage = stat_i.divide(stat_power, 4, RoundingMode.HALF_UP).multiply(multiplier);
                String percentage_str = String.valueOf(percentage);
                System.out.print(i + " - ");
                for(int e = 0; e < percentage_str.length() - 2; e++){
                    System.out.print(percentage_str.charAt(e));
                }
                System.out.print(" % ");
                System.out.println();
            }
            
        }
        System.out.println();
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter num : ");
        BigInteger num = input.nextBigInteger();
        input.close();

        BigInteger out_1 = pow(num, num, false);
        BigInteger out_2 = pow(num, out_1, true);
        

        String result = out_2.toString();
        
        File data = new File("data_java.txt");

        try {
            data.createNewFile();
        } catch (Exception e) {
        }
        try {
            FileWriter writer = new FileWriter("data_java.txt");
            writer.write(result);
            writer.close();
        } catch (Exception e) {
        }

        System.out.println("Calculation Completed!");
        System.out.println("Result stored in data_java.txt\n");

    }
}