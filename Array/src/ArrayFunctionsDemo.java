import java.util.Arrays;

public class ArrayFunctionsDemo {

    public static void main(String[] args) {

        // 1. create array
        int[] arr = {5, 2, 8, 1, 9};

        // toString()
        System.out.println("Original Array: " + Arrays.toString(arr));

        // sort()
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));


        // binarySearch()
        int index = Arrays.binarySearch(arr, 8);
        System.out.println("Index of 8: " + index);


        // fill()
        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("Filled Array: " + Arrays.toString(filled));


        // copyOf()
        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied Array: " + Arrays.toString(copy));


        // equals()
        boolean same = Arrays.equals(arr, copy);
        System.out.println("arr and copy equal? " + same);


        // copyOfRange()
        int[] part = Arrays.copyOfRange(arr, 1, 4);
        System.out.println("Sub Array (1 to 3 index): " + Arrays.toString(part));
    }
}
