import java.util.Scanner;

public class Print1_to_N_YT {

    public static void print(int n){

        if(n == 0){
            return;
        }
         print(n-1);
        System.out.println(n+" ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int  n = sc.nextInt();
        print(n);

    }
}
