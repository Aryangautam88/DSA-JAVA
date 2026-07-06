import java.util.Stack;

public class Y_Rain_Water_Trapping {


    public static void main(String[] args) {

        int[] arr = {3,0,0,2,0,4};

        int[] maxL = new int[arr.length];
        int[] maxr = new int[arr.length];

        maxL[0] = arr[0];

        for(int i = 1 ; i<arr.length ; i++) {

            maxL[i] = Math.max(maxL[i-1] , arr[i]);
        }
        maxr[arr.length-1] = arr[arr.length-1];

        for (int i = arr.length-2 ; i>=0 ; i--){
            maxr[i] = Math.max(maxr[i+1],arr[i]);
        }
        int[] water = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++) {
            water[i] = Math.min(maxL[i],maxr[i]) -arr[i];
        }
        int sum = 0;
        for(int i = 0 ;i <arr.length ;i++){
            sum += water[i];
        }

        System.out.println(sum);
    }
}
