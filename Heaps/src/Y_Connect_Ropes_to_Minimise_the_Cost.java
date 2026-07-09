import java.util.PriorityQueue;

public class Y_Connect_Ropes_to_Minimise_the_Cost {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int cost = 0;
        int x ;
        int y;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i <arr.length ; i++){
            pq.add(arr[i]);
        }
        while (pq.size() > 1) {
            x = pq.remove();
            y = pq.remove();

            int sum = x + y;
            cost+= sum;
            pq.add(sum);
        }
        System.out.println(cost);
    }

}
