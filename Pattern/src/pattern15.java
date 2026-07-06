import java.util.Scanner;
public class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");

        int n = sc.nextInt();
        int i = 1;

        while(i<=n){


            int space = 1;
            while (space <= n - i) {
                System.out.print(" ");
                space++;
            }

            int star = 1;
            while (star <=i) {
                System.out.print("*");
                star++;
            }
            System.out.println();
            i = i+1;
        }

    }
}
