import java.util.Scanner;

public class Fibonacci {

    public static int series(int n) {
        if(n <= 1 )return n;
        return series(n-1)+series(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = sc.nextInt();

        System.out.println(series(n));
    }
}
