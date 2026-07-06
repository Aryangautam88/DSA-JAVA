public class ArrayFunction {

    public static void update(int[] arr, int n){

        System.out.println("Inside the function");

        arr[1] = 20;

        for(int i = 0; i<3; i++){
            System.out.print(arr[i]);
            System.out.println();
        }
        System.out.println("Going back to main function");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};

        update(arr,3);

        System.out.println("Printing in the main function");
        for(int i = 0; i<3; i++){

            System.out.print(arr[i]+" ");
        }
    }
}
