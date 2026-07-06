import java.util.Scanner;
public class Sqrt_using_BS {

    public static int tempSol( int n) {

        int s = 0;
        int e  = n;
        int ans = -1;
        while(s<=e){

            int mid = s + (e-s)/2;

            long square = mid *mid;

            if(n == square){

                return mid;
            }
            else if (square < n) {
                ans =  mid ;
                s = mid +1;

            }
            else {
                e = mid-1;
            }

        }
        return ans;
    }

    public static double morePrecision(int n ,int precision , int tempSol) {

        double factor = 1;
        double ans  = tempSol;

        for (int i = 0; i<precision ;i++){
            factor =factor/10;

            for (double j = ans ; j*j<n ; j=j+factor ){
                ans = j;

            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int n =sc.nextInt();

        int tempSol = tempSol(n);
        System.out.println("Anwser is "+morePrecision(n,3,tempSol));


    }
}
