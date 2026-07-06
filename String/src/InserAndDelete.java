public class InserAndDelete {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("abcd");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.delete(1,2);
        System.out.println(sb);

        sb.insert(1,3);
        System.out.println(sb);

    }

}
