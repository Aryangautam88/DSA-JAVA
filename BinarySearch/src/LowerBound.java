public class LowerBound {

    public static void main(String[] args) {

        int[] arr = {10,23,46,46,91,97,97,140,264};
        int target = 46 ;
        int n = arr.length;
        int lb  = n;

        int s = 0;
        int e = n;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(arr[mid] >= target){
                lb = Math.min(lb,mid);
                e = mid-1;

            }
            else{
                s = mid +1;
            }
        }

        System.out.println(lb);

    }

}
