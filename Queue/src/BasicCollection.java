import java.util.LinkedList;
import java.util.Queue;

public class BasicCollection {

    public static void main(String[] args) {

        Queue<Integer> qu = new LinkedList<>();

        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        qu.add(6);
        System.out.println(qu);
        qu.remove();
        System.out.println(qu);
    }

}
