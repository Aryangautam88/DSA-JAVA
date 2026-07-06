import java.util.Stack;

public class Y_Nearest_Greater_to_right {

    public static void main(String[] args) {

        int[] arr = {1,3,2,4};
        int[] ans = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        for(int i = arr.length-1; i>=0;i--){

            if(st.isEmpty()){
                ans[i] = -1;
            }
            else if(st.peek() > arr[i]){
                ans[i] = st.peek();
            }
            else if (arr[i] > st.peek()){

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
