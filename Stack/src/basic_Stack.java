import java.util.Stack;

public class basic_Stack {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(29);
        st.push(30);
        st.push(31);
        st.push(32);

        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());

    }

}
