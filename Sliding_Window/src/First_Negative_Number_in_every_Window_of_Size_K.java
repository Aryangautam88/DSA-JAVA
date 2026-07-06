import java.util.ArrayList;
import java.util.LinkedList;

public class First_Negative_Number_in_every_Window_of_Size_K {

        public static void main(String[] args) {

            int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
            int k = 3;
            int i = 0;
            int j = 0;
            LinkedList<Integer> ll = new LinkedList<>();
            ArrayList<Integer> ans = new ArrayList<>();

            while (j < arr.length) {
                if (arr[j]<0) {
                    ll.add(arr[j]);
                }

                if (j - i + 1 < k) {
                    j++;
                }
                else if (j - i + 1 == k) {
                    if(ll.isEmpty()){
                        ans.add(0);
                    }
                    else {
                        ans.add(ll.peek());
                    }
                    if (!ll.isEmpty() && arr[i] == ll.peek()) {
                        ll.removeFirst();
                    }
                    j++;
                    i++;
                }
            }

                System.out.print(ans);

        }
    }


//    if(j-i+1 < k){
//    j++;
//            }
//            else if(j-i+1 == k){
//            for(int l = i; l<=j;l++){
//            if(arr[l]<0){
//    ans[i] = arr[l];
//            break;
//            }
//            else {
//    ans[i] = 0;                   brute force
//            }
//            }
//    j++;
//    i++;
//            }
//            }
//            for(int ele : ans){
//            System.out.print(ele + " ");
//            }
