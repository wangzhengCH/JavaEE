public class CalculateValueFraction {
    public static void main(String[] args) {
        int n = 1;
        double ans = 1.0;
        for(int i = 2; i < 101; ++i){
            if(n == 1){
                ans -= 1 / (i * 1.0);
                n = 0;
            }else{
                ans += 1 / (i * 1.0);
                n = 1;
            }
        }
        System.out.println(ans);
    }
}