import java.util.Stack;

public class Y_NEAREST_SMALLER_TO_LEFT {

    public static void main(String[] args) {

        int[] arr = {4,5,2,10,8};
        int[] ans  = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ;i < arr.length; i++ ){

            if(st.isEmpty()){
                ans[i] = -1;
            }
            else if (arr[i] > st.peek() ) {
                ans[i] = st.peek();
            }
            else if(arr[i] < st.peek()){

                while (!st.isEmpty() && st.peek() > arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[i] = -1;
                }
                else {
                    ans[i] =st.peek();
                }

            }

            st.push(arr[i]);

        }

        for(int ele : ans){
            System.out.print(ele+" ");
        }

    }

}
