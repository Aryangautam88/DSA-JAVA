import java.util.Collections;
import java.util.PriorityQueue;

public class Y_k_smallest_element {

    public static void main(String[] args) {

        int[] arr = {7,10,4,3,20,15};
        int k = 4;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele : arr){
            pq.add(ele);
            if(pq.size() > k ){
                pq.remove();
            }
        }

        System.out.println(pq.peek());

    }

}
