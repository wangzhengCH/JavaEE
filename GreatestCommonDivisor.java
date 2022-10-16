import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a >= b){
            int temp = b;
            while(a % temp != 0 || b % temp != 0){
                --temp;
            }
            System.out.println(temp);
        }else{
            int temp = a;
            while(a % temp != 0 || b % temp != 0){
                --temp;
            }
            System.out.println(temp);
        }
    }
}