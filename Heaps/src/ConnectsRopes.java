import java.util.PriorityQueue;

public class ConnectsRopes {

    private static int minCost(int[] arr){

        int cost = 0;
        int max = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int ele : arr){
            pq.add(ele);
        }

        while(pq.size()>1) {
            int x = pq.remove();
            int y = pq.remove();
            cost += x+y;
            pq.add(x+y);
        }
        return cost;
    }

    public static void main(String[] args) {

        int[] arr = {2,7,4,1,8};

        System.out.println(minCost(arr));

    }

}
