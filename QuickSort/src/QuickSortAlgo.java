    public class QuickSortAlgo {

        public static void print(int[] arr) {

            for(int ele : arr){

                System.out.print(ele+" ");

            }
            System.out.println();
        }

        public static void swap(int[] arr, int i,int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static int partition(int[] arr,int s,int e) {

            int pivot = arr[s];
            int pivotidx = s;
            int smallerCount = 0;
            for(int i = s+1; i<=e;i++){

                if(pivot>arr[i]){
                    smallerCount++;
                }
            }
            int correctIndex =s+ smallerCount;
            swap(arr,pivotidx,correctIndex);

    //        partition
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

        public static void quickSort(int[] arr,int s,int e) {

            if(s>=e) return;
            int pivot = arr[s];

            int idx = partition(arr, s,e);

            quickSort(arr,s,idx-1);
            quickSort(arr,idx+1,e);

        }

        public static void main(String[] args) {
            int[] arr = {4,9,7,1,2,3,6,5,8};
            int n = arr.length;
            int s = arr[0];
            int e = n-1;
            print(arr);
            quickSort(arr,0,e);
            print(arr);
        }
    }
