import java.util.*;
public class Reorder_Queue {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};//1,5,2,6,3,7,4,8
        int n = (arr.length)/2;
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();

        for(int ele : arr){
            q.add(ele);
        }
        for(int i = 0 ; i < n ; i ++){
                st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }

        for(int i = 0 ; i < st.size() ; i++){
            q.add(q.remove());
        }
        for(int i = 0 ; i < n ; i++){
            st.push(q.remove());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
            q.add(q.remove());
        }

        // Print Answer
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }



    }
}
