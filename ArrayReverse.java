//Implement a function to reverse an array in place.

public class ArrayReverse {
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements at the left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        reverseArray(arr);
        
        System.out.println("\nReversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
