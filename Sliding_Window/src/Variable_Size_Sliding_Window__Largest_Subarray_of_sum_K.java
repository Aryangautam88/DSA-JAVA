import java.util.HashMap;

public class Variable_Size_Sliding_Window__Largest_Subarray_of_sum_K {

    public static void main(String[] args) {

        int[] arr = {4,1,1,1,2,3,5};
        int k = 5;
        int i = 0;
        int j = 0;
        int max = 0;
        int sum = 0;

        while (j<arr.length){
            sum += arr[j];
            if(sum < k){
                j++;
            }
            else if(sum == k) {
               max = Math.max(max,j-i+1);
            }

            if(sum > k ){
                while(sum > k){
                    sum -= arr[i];
                    i++;
                }
            }
            if (sum == k) {
                max = Math.max(max, j - i + 1);
            }
            j++;
        }


    }
}