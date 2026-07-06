import java.util.Scanner;
public class pattern11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int n = sc.nextInt();
        char ch = 'A';


        int i =1;
        while(i<=n){
            int j = 1;
            while(j<=i){

                System.out.print(ch);
                j = j + 1;
            }
            ch = (char)(ch+1);
            System.out.println();
            i = i + 1;
        }

    }
}