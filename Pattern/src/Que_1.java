import java.util.Scanner;
public class Que_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no :");
        int n = sc.nextInt();
        int i=1;


        while(i<=n){
            int j=1;

           while(j<=n){

               System.out.print(j);
               j=j+1;

            }

           System.out.println();
           i=i+1;

        }



    }
}
