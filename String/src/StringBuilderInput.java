import java.util.Scanner;

public class StringBuilderInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sb = sc.nextLine();
        StringBuilder a = new StringBuilder(sb);
        System.out.println(sb);
        a.setCharAt(1,'z');
        System.out.println(a);
    }

}
