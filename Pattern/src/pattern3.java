import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.");
        int n = sc.nextInt();
        int row = 1;

        while(row<=n){
            int col = 1;
            while(col<=row){
                System.out.print("*");
                col = col + 1;

                System.out.println();
        }
        row = row + 1;
        }

    }
}
