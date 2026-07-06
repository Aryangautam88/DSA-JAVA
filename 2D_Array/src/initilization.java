
import java.util.Scanner;

public class initilization {

    public static boolean isPresent(int arr[][] ,int target , int row ,int col) {

        for (int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<4 ;j++){
                if(arr[i][j] == target){
                    return true;
                }
            }
        }
return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];

        for (int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<4 ;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<4 ;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }


        System.out.println("Enter element to search : ");
        int target = sc.nextInt();

        if(isPresent(arr , target , 3,4)){
            System.out.println("Found");
        }
        else {
            System.out.println("not found");
        }



    }

}
