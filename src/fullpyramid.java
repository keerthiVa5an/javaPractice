import java.util.Scanner;

public class fullpyramid{
    public static void main(String[] args)
    {


        int N = 5;


        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }


            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

