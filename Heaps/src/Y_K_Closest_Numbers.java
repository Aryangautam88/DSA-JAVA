import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

class air{

    int diff;
    int value;

    air(int diff,int value){
        this.diff = diff;
        this.value = value;
    }

}

public class Y_K_Closest_Numbers {

    public static void main(String[] args) {

        int[] arr = {5,6,7,8,9};
        int k = 3;
        int x = 7;

        PriorityQueue<air> pq = new PriorityQueue<>((a,b) -> b.diff-a.diff);

        for(int i = 0 ; i < arr.length ; i++){

            int diff = Math.abs(arr[i] - x);
            pq.offer(new air(diff, arr[i]));

            if(pq.size() > k){
                pq.poll();
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();

        while (pq.size() > 0){
            ans.add(pq.poll().value);
        }


        System.out.println(ans);

    }

}
