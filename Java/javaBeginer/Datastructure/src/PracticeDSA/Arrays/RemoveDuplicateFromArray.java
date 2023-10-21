package PracticeDSA.Arrays;
class Working{
    int exe(int[] arr){
        int pointer = 1;
        for(int i = 1; i < arr.length;i++){
            if(arr[i - 1] != arr[i]){
                arr[pointer] = arr[i];
                pointer++;
            }
        }
        return pointer;
    }
}
public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
    Working w = new Working();
    int[] inputArray = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(w.exe(inputArray));
    }
}
