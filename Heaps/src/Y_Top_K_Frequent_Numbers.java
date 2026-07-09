import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Map;

class pair{
    int freq ;
    int val;
    pair(int freq , int val){
        this.freq = freq;
        this.val = val;
    }
}

public class Y_Top_K_Frequent_Numbers {

    public static void main(String[] args) {

        int[] arr = {1,1,1,3,2,2,4};
        int k = 2;
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b) ->a.freq-b.freq);

        for(int ele : arr){
            if(map.containsKey(ele)){
                map.put( ele,map.get(ele)+ 1);
            }
            else {
                map.put(ele,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){

            pq.add(new pair(entry.getValue(), entry.getKey()));

            if(pq.size() > k){
                pq.remove();
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()){
            ans.add(pq.remove().val);
        }

        System.out.println(ans);
    }

}
