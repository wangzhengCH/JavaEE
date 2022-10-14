import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        input = scanner.next();
        int var = Integer.parseInt(input);
        if(var > 0 && var <= 3) {
            System.out.println(var + " is a primeNumber");
        }
        if(var > 3)
        {
            for(int i = 2; i < var; ++i) {
                if(var % i == 0) {
                    System.out.println(var + " is not a primeNumber");
                    return;
                }
            }
            System.out.println(var + " is a primeNumber");
        }else{
            System.out.println("error");
        }
    }
}
