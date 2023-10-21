package PracticeDSA.Arrays;

public class DuplicatZero {
    public static void main(String[] args) {
//        int[] input = {1,0,2,3,0,4,5,0};
        int[] input = {8,4,5,0,0,0,0,7};
        int countZeros = 0;
        int len = input.length - 1;

        for(int i = 0; i <= len - countZeros;i++){
            if(input[i] == 0){
                if(i == len - countZeros){
                    input[len] =0;
                    len--;
                    break;
                }
                countZeros++;
            }
        }
        for (int a:input) {
            System.out.println(a);
        }
        int position = len - countZeros;
        for (int i = position;i>=0;i--){
            if(input[i] == 0){
                input[i + countZeros] = 0;
                countZeros--;
                input[i + countZeros] = 0;
            }else{
                input[i + countZeros] = input[i];
            }
        }
        for (int a:input) {
            System.out.println(a);
        }
    }
}
