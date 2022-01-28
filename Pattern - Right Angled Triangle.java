// Program to print Pattern of right angled triangle

class Pattern_right_angle_triangle {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}