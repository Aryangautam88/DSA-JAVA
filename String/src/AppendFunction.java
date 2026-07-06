import java.util.Arrays;

public class AppendFunction {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("ABD");
        System.out.println(s);
        s.append(2);
        System.out.println(s);

        int[] arr = {1,2,3,3};

        s.append(arr);
        System.out.println(s);
    }
}
