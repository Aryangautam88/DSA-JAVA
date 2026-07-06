public class SelectionSort {

    public static void print(int[] arr) {

        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {10,-40,20,1,-6,8};

        print(arr);

        for(int i=0; i<arr.length; i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j = i; j< arr.length ; j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        print(arr);
    }

}
