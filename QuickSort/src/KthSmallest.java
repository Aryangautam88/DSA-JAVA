public class KthSmallest {

    public static void print(int[] arr) {

        for(int ele : arr){

            System.out.print(ele+" ");

        }
        System.out.println();
    }

    public static void swap(int[] arr,int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr,int s ,int e) {

        int pivot = arr[s];
        int pivotIndex = s;
        int smallerCount = 0;

        for(int i = s+1; i<=e ;i++){
            if(pivot>arr[i]){
                smallerCount++;
            }
        }
        int correctIndex = s+smallerCount;
        swap(arr,correctIndex,pivotIndex);
       // partition
        int i = s;
        int j = e;

        while(i<correctIndex && j>correctIndex ){
            if(arr[i]<=pivot) i++;
            else if (arr[j]>pivot) j--;
            else if (arr[i]>pivot && arr[j]<=pivot){
                swap(arr ,i,j);
                i++;
                j--;
            }
        }

        return correctIndex;

    }

    public static int kthsmallest(int[] arr,int s,int e,int k) {

        if(s<=e) {

            int idx = partition(arr, s, e);

            if (k == idx) {
                return arr[idx];
            } else if (idx > k) {
                return kthsmallest(arr, s, idx - 1, k);
            } else  {
                return kthsmallest(arr, idx + 1, e, k);
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {4,9,7,1,2,3,6};
        int n = arr.length;
        int e = n-1;
        int k= 2;
        partition(arr,0,e);
        int ans = kthsmallest(arr,0,e,2);
        System.out.println(ans);

    }

}
