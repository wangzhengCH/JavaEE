import java.util.Scanner;

public class X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 5;
//        while (in.hasNextInt()) {
//            num = in.nextInt();
//       }
        for(int i = 0; i < num; ++i){
            for(int j = 0; j < num; ++j){
                if(i == j || i + j == num - 1){
                    System.out.print('*');
                } else{
                    System.out.print(' ');
                }
                if(j == num - 1 && i != num - 1){
                    System.out.println();
                }
            }
        }
    }
}
