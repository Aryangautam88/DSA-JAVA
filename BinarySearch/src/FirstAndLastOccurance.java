public class FirstAndLastOccurance {

    public static int FirstOccurnce(int[] arr, int n, int k){
        int s = 0;
        int e = n-1;
        int ans = -1;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(arr[mid] == k){
                ans = mid;
                e = mid-1;
            }
            else if (arr[mid]<k) {
                s = mid+1;
            }
            else {
                e = mid-1;
            }
        }
        return ans;

    }

    public static int LastOccurance(int[] arr, int n, int k) {
        int s = 0;
        int e = n-1;
        int ans = -1;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(arr[mid] == k){
                ans = mid;
                s = mid+1;
            }
            else if (arr[mid]<k) {
                s = mid+1;
            }
            else {
                e = mid-1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,3,3,3,4,5};
        System.out.println(FirstOccurnce(arr,8,3));
        System.out.println(LastOccurance(arr,8,3));

    }
}
