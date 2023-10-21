package PracticeDSA.Arrays;

import java.util.stream.Stream;

public class ArrayInsert {
    public static void main(String[] args) {

        int[] arr = new int[6];
        insertAtLast(arr);
        insertAtStart(arr);
        insertAnyWhere(arr,2);
    }
    public static void insertAtLast(int[] arr){
            int len = 0;

            for (int i= 0;i<3;i++){
                arr[len ++] = i;
            }
        System.out.println("Insert at the last:");
            for (int a: arr) {
                System.out.println(a);
            }
        }

        public static void insertAtStart(int[] arr){
            for(int i = 3; i >= 0; i--){
                arr[i + 1] = arr[i];
            }
            arr[0] = 20;

            System.out.println("Insert 20 at the start");
            for (int a:arr) {
                System.out.println(a);
            }
        }
        public static  void insertAnyWhere(int[] arr, int position) {
            for (int i = arr.length - 2; i >= position; i--) {
                arr[i + 1] = arr[i];
            }
            arr[position] = 100;

            System.out.println("Insert 100 at position =" + position);

            for (int a : arr) {
                System.out.println(a);
            }
        }
    }

