import javax.xml.stream.events.ProcessingInstruction;
import java.util.Collections;
import java.util.PriorityQueue;

public class Y_Sum_of_Elements_between_k1_smallest_and_k2_smallest_numbers {

    public static int kthSmallest(int[] arr, int k){

        PriorityQueue<Integer> pq  = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < arr.length ; i++){
            pq.add(arr[i]);

            if( pq.size() > k){
                pq.remove();
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {

        int[] arr = {1,3,12,5,15,11};
        int k1 = 3;
        int k2 = 6;
        int x;
        int y;
        int sum=0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i<arr.length ; i++){
            pq.add(arr[i]);
        }
        x = kthSmallest(arr,k1);
        y = kthSmallest(arr,k2);

        for(int i = 0  ; i<arr.length;i++ ){

            if(arr[i] > x && y > arr[i]){
                sum += arr[i];
            }
        }

        System.out.println(sum);

    }

}
