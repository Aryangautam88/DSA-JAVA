import java.util.Stack;

public class Reverse_stack {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        int reverse;

        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);
        System.out.println(st);

        while (!st.isEmpty()){
            st2.push(st.pop());
        }
        System.out.println(st2);

    }

}
