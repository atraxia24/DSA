package functions;
import java.util.Arrays;
class Solution2 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--){
            digits[i]++;
            if(digits[i]==10){
                digits[i]=0;
            }
            else return digits;
        }
        digits = new int[n+1];
        digits[0]=1;
        return digits;
    }

    public static void main(String[] args) {
        int[] arr = {0};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

}

