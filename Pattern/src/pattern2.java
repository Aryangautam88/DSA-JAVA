import java.util.Scanner;
public class pattern2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.");
        int n = sc.nextInt();
        int count  = 1;
        int i = 1;

        while(i<=n){

            int j = 1;
            while (j<=n){
                System.out.print(count + " ");
                count = count + 1;
                j = j + 1;
            }
                System.out.println();
                i = i+1;
        }

    }

}
