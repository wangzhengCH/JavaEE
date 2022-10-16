import java.util.Arrays;
import java.util.Scanner;

public class DecomposeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp = sc.nextInt();
        int len = LengthNum(tmp);
        int[] arr = new int[len];
        for(int i = 0; i < len; ++i){
            arr[i] = tmp % 10;
            tmp = tmp / 10;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int LengthNum(int num){
        int count = 0;
        while(num >= 1){
            num /= 10;
            count ++;
        }
        return count;
    }
}

