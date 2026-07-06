import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallestElement {

    public static void main(String[] args) {

        int[] arr = {2,4,1,5,-2,-4,-9,22};
        int k = 1  ;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele : arr){
            pq.add(ele);
            if(pq.size() > k){
                pq.remove();
            }
        }


        System.out.println(pq.peek());
    }
}
