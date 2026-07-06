public class countVowel {

    public static int Isvoewls(String s) {

        int coutn = 0;

        for(int i = 0 ; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                coutn++;
            }
        }
        return coutn;
    }

    public static void main(String[] args) {

        String s = "Aeiou";


        int res = Isvoewls(s);

        System.out.println("No of vowel in given string is "+res);

    }

}
