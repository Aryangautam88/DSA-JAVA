public class SwapAlternater {

    public static void swap(int[] arr,int n) {

        for(int i = 0; i < n; i =i+2){

            if(i+1<n){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                                     }
        }

    }
    public static void print(int[] arr,int n) {

        for(int i = 0; i < n; i++ ){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int[] arr = {10,22,4,3,5};

        swap(arr,arr.length);
        print(arr,arr.length);
    }
}
