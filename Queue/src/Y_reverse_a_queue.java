import java.util.*;

public class Y_reverse_a_queue {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Stack<Integer> st = new Stack<>();
        while (q.size() > 0) {

            st.push(q.remove());

        }
        while (st.size() > 0) {

            q.add(st.pop());

        }
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }


}
