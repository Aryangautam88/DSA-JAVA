public class SearchInRoatedSortedArray {

    public static int BinarySearch(int[] arr, int s,int e,int x) {

        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] < x){
                s = mid +1;
            }
            else if(arr[mid] > x){
                e = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int x = 4;
        int p =-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]<arr[mid+1] && arr[mid]>arr[mid-1]){
                p = mid;
                break;
            }
            else if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]){
                p = mid-1;
                break;
            } else if (arr[mid]<arr[mid+1] && arr[mid]>arr[mid-1]){
                if(arr[mid]>arr[n-1]){
                    s = mid+1;

                }
                else {
                    e = mid - 1;
                }
            }
        }
        if(p == -1){
            BinarySearch(arr,s,e,x);
        }
        int left  =BinarySearch(arr,s,p,x);
        if(left != -1);
    }

}
