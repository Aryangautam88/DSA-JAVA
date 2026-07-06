public class StringTraversal {

    public static void print(int n,String s) {
        if(n == s.length() )return;
        System.out.print(s.charAt(n)+" ");
        print(n+1,s);
    }

    public static void skip(int i ,String s,String ans) {
        if(i == s.length() ){
            System.out.println(ans+" ");
            return;
        }
        if(s.charAt(i)!='a') ans += s.charAt(i);
        skip(i+1,s,ans);
    }

    public static void main(String[] args) {
        String s = "Aryan";
//        print(0,s);
        skip(0,s," ");
    }
}
