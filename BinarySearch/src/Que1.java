public class Que1{

    public static int BinarySearch(int[] arr, int size ,int key) {

        int start = 0;
        int end = size-1;

        while(start <= end){

            int mid = start+((end-start)/2);

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid+1;
            }
            else{
                start = mid-1;
            }

        }

        return -1;
    }


    public static void main(String[] args) {

        int[] even = {1,2,3,4,5,6};
        int[] odd = {5,6,7,8,9};

        int index1 = BinarySearch(even , 6,5);
        System.out.println("index1 of 5 is :"+index1);

        int index2 = BinarySearch(odd , 5,7);
        System.out.println("index2 of 5 is :"+index2);

    }
}