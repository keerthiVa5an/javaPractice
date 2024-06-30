public class hollowfullpyramid {
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}

