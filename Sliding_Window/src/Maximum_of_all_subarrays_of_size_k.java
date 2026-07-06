import java.util.ArrayList;
import java.util.LinkedList;

public class Maximum_of_all_subarrays_of_size_k {
    public static void main(String[] args) {

        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int i = 0;
        int j = 0;
        int max  = Integer.MIN_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();

        while (j < arr.length) {

            while(!ll.isEmpty() && ll.getLast()<arr[j]){
                ll.removeLast();
            }

            ll.addLast(arr[j]);

            if(j-i+1 < k){
                j++;
            } else if (j-i+1 == k) {

                ans.add(ll.getFirst());

                if (arr[i] == ll.getFirst()) {
                    ll.removeFirst();
                }

                i++;
                j++;

            }
        }

        System.out.println(ans);


    }
}
