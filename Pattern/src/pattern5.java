import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.");
        int n = sc.nextInt();
        int row = 1;
        int count = 0;

        while(row<=n){
            int col = 1;
            while(col<=row){
                count  = count +1;
                System.out.print(count);
                col = col + 1;

            }
            System.out.println();
            row = row + 1;
        }

    }
}
