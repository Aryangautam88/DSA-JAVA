import java.util.Scanner;

public class BinaryString {

    public static void BinaryStr(String ans , int n) {

        int m = ans.length();
        if(m == n){
            System.out.println(ans);
            return;
        }
        if(m == 0 || ans.charAt(m-1) == '0'){

            BinaryStr(ans+1,n);
            BinaryStr(ans+0,n);

        }
        else {
            BinaryStr(ans+0,n);
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of binary String : ");
        int n = sc.nextInt();

        BinaryStr("",n);
    }
}
