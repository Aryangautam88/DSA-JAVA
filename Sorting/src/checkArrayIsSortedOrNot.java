import java.util.Scanner;

public class checkArrayIsSortedOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter element in an array : ");
        int[] arr = new int[5];
        boolean flag = true;
        for(int i = 0;i<arr.length; i++){

            arr[i] = sc.nextInt();

        }

        for(int i = 0; i<arr.length-1 ; i++){

            if(arr[i]>arr[i+1]){
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println("Sorted");
        }
        else {
            System.out.println("unsorted");
        }

    }
}
