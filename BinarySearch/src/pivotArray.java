public class pivotArray {

    public static int getPivot(int[] arr, int n) {

        int s = 0;
        int e = n-1;

        while (s < e){

            int mid = s+ (e-s)/2;

            if(arr[mid] >=  arr[0]){
                s= mid+1;
            }
            else{
                e=mid;
            }

        }
        return s;


    }


    public static void main(String[] args) {
        int[] arr = {8,10,17,1,3};

        System.out.println("pivot element is :"+getPivot(arr,5));

    }

}
