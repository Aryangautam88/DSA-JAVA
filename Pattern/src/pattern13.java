import java.util.Scanner;
public class pattern13{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No.");
        int n = sc.nextInt();
        char ch = 'A';

        int i = 1;
        while(i<=n){


            int j = 1;
            while(j<=i){
                System.out.print((char)(ch+i+j-2));
                j = j + 1 ;
            }

                System.out.println();
                i = i + 1 ;
        }
    }

}