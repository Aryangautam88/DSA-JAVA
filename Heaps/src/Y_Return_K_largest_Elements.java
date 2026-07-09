import java.util.PriorityQueue;

public class Y_Return_K_largest_Elements {

    public static void main(String[] args) {

        int[] arr = {7,10,4,3,20,15};
        int k = 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int ele : arr){
            pq.add(ele);
            if(pq.size() > k){
                pq.remove();
            }
        }

        System.out.println(pq.peek());

    }

}
