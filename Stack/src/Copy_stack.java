import java.util.Stack;

public class Copy_stack {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st);
        Stack<Integer> st3 = new Stack<>();
        while (!st.isEmpty()){

            st2.push(st.pop());

        }
        while (!st2.isEmpty()){

            st3.push(st2.pop());

        }

        System.out.println(st3);
    }

}
