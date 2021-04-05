// replace the number with the greatest number from right.
// the last number is -1
//
//
//
//
public class _1299_P {
    public static int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = 0;
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
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 6, 5, 10, 0, -6};
        replaceElements(arr);
        printArray(arr);
    }
}
