public class Maximum_Sum_Subarray_of_size_K {

    public static void main(String[] args) {

        int[] arr = {2,5,1,8,2,9,1};
        int k = 3;

        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        int sum = 0;

       while(j<arr.length) {
           sum += arr[j];

           if (j - i + 1 < k) {
               j++;
           }
           else if (j - i + 1 == k) {
               max = Math.max(max,sum);
               sum = sum - arr[i];
               i++;
               j++;
           }
       }

        System.out.println(max);
    }

}
