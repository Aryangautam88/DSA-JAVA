import java.util.Scanner;
public class pattern6 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = sc.nextInt();

        int i = 1;
        while(i<=n){
            int j = 1;
            int val = i;
            while(j<=i){

                System.out.print(val);
                val = val+1;
                j = j+1;
            }
                i = i+1;
                System.out.println();
        }
    }
}
