package PracticeDSA.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        deleteAtEnd(inputArray);
        deleteAtStart(inputArray);
        deleteAnyWhere(inputArray, 3);
    }

    public static void deleteAtEnd(int[] arr) {
        int length = arr.length;
        length--;

        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void deleteAtStart(int[] arr) {
        int lenght = arr.length;

        for (int i = 1; i < lenght; i++) {
            arr[i - 1] = arr[i];
        }
        System.out.println("Delete at the start");
        lenght--;
        for (int i = 0; i < lenght; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void deleteAnyWhere(int[] arr, int position) {

        int length = arr.length;
        for (int i = position + 1; i < length; i++) {
            arr[i - 1] = arr[i];
        }

        System.out.println("Delete Anywhere from Array");
        length -= 2;
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }
}
