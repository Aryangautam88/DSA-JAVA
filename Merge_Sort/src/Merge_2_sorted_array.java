public class Merge_2_sorted_array {

    public static void print(int[] arr) {

        for(int ele : arr){

            System.out.print(ele+" ");

        }
        System.out.println();
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
        if(j == a.length){
            while (i < a.length){
                c[k] = a[i];
                i++;
                k++;
            }
        }

    }

    public static void main(String[] args) {
        int[] a = {10,30,50,60,90};
        int[] b = {20,40,70,75};
        int[] c  = new int[a.length+b.length];

        merge(a,b,c);
        print(c);

    }

}
