public class practice1 {
    public static int BinarySearch(int[] arr, int target) {

        int s = 0;
        int e = arr.length;

        while (s<=e){
            int mid = s+(e-s)/2;

            if(arr[mid]== target ){
                return mid;
            }
            else if (arr[mid]>target) {

                e = mid - 1;

            }
            else {
                s = mid +1;
            }
        }
            return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10,23,46,89,91,97,107,140,264};
        int target = 91 ;

        int res = BinarySearch(arr,target);
        System.out.println(res);

    }
}
