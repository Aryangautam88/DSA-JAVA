import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Y_reverse_k_element {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k = 3;

        Stack<Integer> st = new Stack<>();
        while (q.size() > k)    {

            st.push(q.remove());

        }
        while (st.size() > k) {

            q.add(st.pop());

        }
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }

}
