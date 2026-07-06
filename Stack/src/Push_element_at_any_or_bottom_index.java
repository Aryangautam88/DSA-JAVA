import java.util.Stack;

public class Push_element_at_any_or_bottom_index {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        int idx = 3;
        int val = 4;
        Stack<Integer> temp = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(8);
        st.push(5);

        System.out.println(st);
        while(st.size()-1 > idx){
            temp.push(st.pop());
        }
        st.pop();
        st.push(val);
        while (!temp.isEmpty()){
            st.push(temp.pop());
        }

        System.out.println(st);
    }

}
