import java.util.Scanner;

public class pw254ReturnTotalNoOfDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Digit : ");
        int n =sc.nextInt();
        String s = n + "";

        int res = s.length();

        System.out.println("total no. of digit is : "+ res);



    }

}
