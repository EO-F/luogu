import java.util.Scanner;

public class P5709 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int t = scan.nextInt();
        int s = scan.nextInt();
        //需要向上取整
        //答案可能为负数
        if(m*t<=s){
            System.out.println(0);
        }else{
            System.out.printf("%.0f",m - Math.ceil(s * 1.0 / t));
        }
    }
}
