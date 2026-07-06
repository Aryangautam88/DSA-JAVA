import javax.imageio.ImageTranscoder;
import java.util.Arrays;

public class BookAllocation {

    public static boolean isPossible(int[] arr , int mid, int k) {

        int studentCount = 1;
        int pageSum = 0 ;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > mid){
                return false;
            }
            if(arr[i]+pageSum <= mid){
                pageSum = pageSum + arr[i];
            }
            else {
                studentCount++;
                pageSum = arr[i];
            }
            if(studentCount > k){
                return false;
            }
        }
        return true;
    }

    public static  int splitArray(int[] arr, int k) {


        int s = 0;
        int sum = 0;

        for(int i = 0; i < arr.length ;i++){
            sum = sum + arr[i];
            s = Math.max(s,arr[i]);
        }

        int e = sum;
        int ans = -1;

        while(s<=e){

            int mid = s + (e-s)/2;

            if(isPossible( arr , mid, k)){

                ans = mid;
                e = mid-1;
            }
            else {
                s= mid+1;
            }
        }
       return ans;
    }

    public static void main(String[] args) {

        int[] arr = {7,2,5,10,8};
        int k = 2;

        int res = splitArray(arr,2);

        System.out.println("ans is  : "+res);

    }


}
