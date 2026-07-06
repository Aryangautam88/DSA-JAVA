public class Merge_sort {

    public static void print(int[] arr) {

        for(int ele : arr){

            System.out.print(ele+" ");

        }
        System.out.println();
    }

    public static void mergesort(int[] arr) {

        int n = arr.length;

        if(n == 1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        for(int i = 0; i < n/2; i++){
            a[i] =  arr[i];
        }
        for(int i = 0; i<n-n/2;i++){
            b[i] = arr[i+n/2];
        }
        mergesort(a);
        mergesort(b);

        merge(a,b,arr);
    }

    public static void merge(int[] a,int[] b, int[] c) {

        int i = 0,j = 0,k = 0;
        while(i<a.length && j<b.length){

            if(a[i]<=b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if(i == a.length){
            while (j < b.length){
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if(j == b.length){
            while (i < a.length){
                c[k] = a[i];
                i++;
                k++;
            }
        }

    }

    public static void main(String[] args) {

        int[] arr = {80,70,40,60,30,50,10,20};
        print(arr);
        mergesort(arr);
        print(arr);
    }

}
