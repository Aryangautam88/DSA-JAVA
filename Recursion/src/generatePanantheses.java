import java.util.Scanner;

public class generatePanantheses {
    public static void printparanteses(int o,int c,int n,String ans ) {

        if(ans.length() == 2*n){
            System.out.println(ans);
            return;
        }

         if(o<n)  printparanteses(o+1,c,n,ans+"(");
         if(o>c)  printparanteses(o,c+1,n,ans+")");


    }
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no : ");
        int n = sc.nextInt();

        printparanteses(0,0,n,"");
    }
}
