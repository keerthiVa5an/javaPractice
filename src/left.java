import java.util.Scanner;

public class left {
    public static void main(String[] args)
    {


        int N = 5;


        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }


            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
