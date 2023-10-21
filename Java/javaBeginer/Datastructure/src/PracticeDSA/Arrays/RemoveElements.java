package PracticeDSA.Arrays;
class Execution{
    public int removeElement(int[] arr, int val){
        int pointer = 0;

        for(int i = 0; i < arr.length;i++){
            if(arr[i] != val){
                arr[pointer++] = arr[i];
//                pointer++;
            }
        }
        return pointer;
    }
}
public class RemoveElements {
    public static void main(String[] args) {
        Execution exe = new Execution();
        int[] inputArray = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(exe.removeElement(inputArray,val));
    }
}
