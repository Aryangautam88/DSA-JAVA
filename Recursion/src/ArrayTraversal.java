public class ArrayTraversal {

    public static void print(int i,int[] arr) {

        if(i==arr.length ) return ;
        System.out.print(arr[i] +" ");
        print(i+1,arr);
    }

    public static void main(String[] args) {

        int[] arr = {1,4,2,3,5,9,7};
        print(0,arr);

    }
}
