public class years {
    public static void main(String[] args) {
        int year = 2000;
        if((year % 100) == 0)
        {
            if(year % 400 == 0)
            {
                System.out.println("是世纪闰年");
            }else{
                System.out.println("不是闰年");
            }
        }else{
            if(year % 4 == 0){
                System.out.println("是普通闰年");
            }else{
                System.out.println("不是闰年");
            }
        }
    }
}
