public class BubbleSort {

    public static void print(int[] arr) {

        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5,1,6,4,2};

        print(arr);

        for(int j = 0;j<arr.length-1;j++){
            for(int i = 0 ; i<arr.length-1; i++){

                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                }

            }

        }
        print(arr);

    }

}
