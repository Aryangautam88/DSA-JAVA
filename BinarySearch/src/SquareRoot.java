public class SquareRoot {

    public static void main(String[] args) {
        int x = 1;
        int e = x;
        int s=0;
        int ans = 0;

        while(s<=e){
            int mid = s+(e-s)/2;
            long square =(long) mid*mid;
            if(square == x){
                ans =mid;
                break;
            }
            else if (square < x) {
                ans = mid;
                s = mid+1;

            }
            else {
                e = mid-1;
            }
        }
        System.out.println(ans);
    }
}
