import java.util.Scanner;

public class ToggltCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0;i < s.length(); i++){

            char ch = sb.charAt(i);
            int ascii = (int)ch;
            if(ascii >=65  && ascii <= 90){
                ascii += 32 ;
                ch = (char)ascii;
                sb.setCharAt(i,ch);
            }
            else if (ascii >= 97 && ascii <= 122) {
                ascii -= 32 ;
                ch = (char)ascii;
                sb.setCharAt(i,ch);
            }
        }
        System.out.println(sb);
    }

}
