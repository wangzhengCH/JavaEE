import java.util.Scanner;

public class DaffodilNumber {
    public static void main(String[] args) {
        int ans;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 100; i < n; ++i){
            ans = (i / 100)*(i / 100)*(i / 100) + ((i / 10) % 10)*((i / 10) % 10)*((i / 10) % 10) + (i % 10)*(i % 10)*(i % 10);
            if(ans == i){
                System.out.println(ans);
            }
        }
    }
}
