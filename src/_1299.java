//Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
//
//After doing so, return the array.
//Input: arr = [17,18,5,4,6,1]
//Output: [18,6,6,6,1,-1]

public class _1299 {
    public static int[] replaceElements(int[] arr) {
        int max;
        for (int i = 0; i < arr.length - 1; i++) {
            max = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + ", ");
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        replaceElements(arr);
        printArray(arr);
    }


}
