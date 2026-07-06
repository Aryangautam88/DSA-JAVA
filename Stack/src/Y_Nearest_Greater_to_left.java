import java.util.Stack;

public class Y_Nearest_Greater_to_left {

    public static void main(String[] args) {

        int[] arr = {1,5,3,2,4};
        int[] ans = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i<arr.length; i++){

            if(st.isEmpty()){
                ans[i] = -1;
            }
            else if(arr[i] < st.peek()){
                ans[i] = st.peek();
            }
            else if (arr[i] > st.peek()) {

                while(!st.isEmpty() && arr[i] >= st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[i] = -1;
                }
                else {
                    ans[i] = st.peek();
                }

            }
            st.push(arr[i]);

        }

        for(int ele : ans){
            System.out.print(ele+" ");
        }


    }

}
