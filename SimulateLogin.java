import java.util.Scanner;

public class SimulateLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = "5asb2c";
        for(int i = 3; i > 0; --i){
            String str = sc.nextLine();
            if(str.equals(ans)){
                System.out.println("登录成功 !");
                return;
            }else{
                System.out.println("密码错误，请重新输入(剩余次数:" + i + ")");
            }
        }
        System.out.println("重试次数过多，系统自动退出 ！");
    }
}
