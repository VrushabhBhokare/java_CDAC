public class starpattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print spaces before stars
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // Print stars with a space
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
