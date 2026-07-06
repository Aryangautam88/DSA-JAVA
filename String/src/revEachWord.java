import java.util.Scanner;

public class revEachWord {
    public static void reverse(StringBuilder sb , int i , int j){

        while(i<=j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);

            i++;
            j--;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int j = 0;
        int i = 0;
        reverse(sb,0,sb.length()-1);
        System.out.println(sb);
    }
}
