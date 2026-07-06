public class insertionSort {
    public static void print(int[] arr) {

        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {10,-40,20,78,-6,8};

        print(arr);

//  ---------insertion Sort-------------------//
        for(int i = 1; i<arr.length ; i++){

            for(int j = i; j>=1;j--){
                if(arr[j] < arr[j-1]){

                    int temp = arr[j];
                    arr[j] =  arr[j-1];
                    arr[j-1] = temp;

                }
                else break;
            }

        }

        print(arr);

    }
}
