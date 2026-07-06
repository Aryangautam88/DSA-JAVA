import java.util.ArrayList;
import java.util.PriorityQueue;

public class kSortedArrya {

    public static void main(String[] args) {

        int k = 3;
        int[] arr = {6,5,3,2,8,10,9};
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int ele : arr){
            pq.add(ele);

            if(pq.size()>k){
                ans.add(pq.remove());
            }
        }
        while (pq.size()>0){
            ans.add(pq.remove());
        }

        System.out.println(ans);
    }

}
