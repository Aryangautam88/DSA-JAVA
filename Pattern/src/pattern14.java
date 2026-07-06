import java.util.Scanner;
public class pattern14{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;

        while(i<=n){

            int j = 1;
            char start = (char)('A'+i-1);
            while (j<=n){

                System.out.print(start);
                start =(char)(start+1);
                j = j+1;

            }
            System.out.println();
            i = i+1;

        }
    }

}