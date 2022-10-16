import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i < n + 1; ++i){
            for(int j = 1; j < i + 1; ++j){
                System.out.print(j + "X" + i + "=" + i * j + " ");
            }
            System.out.println();
        }
    }
}
