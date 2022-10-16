import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int tmp = random.nextInt(100);
        Scanner sc = new Scanner(System.in);
        boolean buf = true;
        while(buf) {
            int ans = sc.nextInt();
            if(ans == tmp){
                System.out.println("Great !");
                sc.close();
                buf = false;
            } else if (ans > tmp) {
                System.out.println("too big !");
            } else if (ans < tmp) {
                System.out.println("too small !");
            }
        }
    }
}
