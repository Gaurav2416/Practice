package PracticeDSA.Arrays;

public class ReplaceElementsGreatest {
    public static void main(String[] args) {
        int[] arr = {56903,18666,60499,57517,26961};
        int N =  arr.length;
        int i = N - 1;
        int value = arr[i];
        while(i >= 0){
            if(value < arr[i]){
                int temp = arr[i];
                arr[i] = value;
                value = temp;
            }else{
                arr[i] = value;
            }

                i -= 1;
        }
        arr[N - 1] = -1;
        for (int a: arr) {
            System.out.println(a);

        }
    }
}
