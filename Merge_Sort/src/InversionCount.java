public class InversionCount {
    static int count = 0;
    public static void print(int[] arr) {

        for(int ele : arr){

            System.out.print(ele+" ");

        }
        System.out.println();
    }

    public static void inversion(int[] a, int[] b) {
        int i = 0;
        int j = 0;

        while (i<a.length && j<b.length){
            if(a[i]>b[j]){
            count += (a.length-i);
            j++;
            }
            else {
                i++;
            }
        }

    }

    public static void merge(int[] a,int[] b,int[] c) {

        int i = 0,j = 0, k = 0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else{
                c[k] = b[j];
                k++;
                j++;
            }
        }
        while(i < a.length){
            c[k] = a[i];
            i++;
            j++;
        }
        while (j< b.length) {
            c[k] = b[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int[] arr) {
        if(arr.length <= 1) return;
        int n = arr.length;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

       for(int i = 0;i<n/2;i++){
           a[i] = arr[i];
       }
       for(int i = 0;i<n-n/2;i++){
           b[i] = arr[i+n/2];
       }

       mergeSort(a);
       mergeSort(b);
        inversion(a,b);
       merge(a,b,arr);
    }

    public static void main(String[] args) {
        int[] arr = {8,2,5,9,3,1,4};

        print(arr);
        mergeSort(arr);
        print(arr);
        System.out.println(count);
    }

}
