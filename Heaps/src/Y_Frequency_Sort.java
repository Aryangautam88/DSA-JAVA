import java.security.Permission;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Map;

class FreqPair{
    int freq ;
    int val ;

    FreqPair(int freq,int val){
        this.freq = freq;
        this.val = val;
    }
}

public class Y_Frequency_Sort {

    public static void main(String[] args) {

        int[] arr = { 1,1,1,3,3,3,3,2,2,4};
        HashMap<Integer,Integer> map =  new HashMap<>();
        PriorityQueue<FreqPair> pq = new PriorityQueue<>((a,b)->b.freq- a.freq);
        ArrayList<Integer> ans =new ArrayList<>();

        for(int ele : arr){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }
            else {
                map.put(ele,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            pq.add(new FreqPair(entry.getValue(), entry.getKey()));


        }
        while (!pq.isEmpty()){

            FreqPair p = pq.remove();

            for(int i = 0; i < p.freq; i++){
                ans.add(p.val);
            }

        }

        System.out.println(ans);
    }

}
