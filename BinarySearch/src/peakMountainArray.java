    public class peakMountainArray {
        public static void main(String[] args) {
            int[] arr = { 1,2,4,6,10,45,4,3,2};
            int s = 0;
            int e = arr.length-1;

            while(s<=e){
                int mid = s+(e-s)/2;
                if(arr[mid]<arr[mid+1]){
                    s =mid+1;
                }
                else {
                    e = mid-1;
                }
            }
            System.out.println(arr[s]);
        }
    }
