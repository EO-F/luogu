import java.util.Scanner;

public class P5719 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int count1 = 0;
        int count2 = 0;

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 1;i <= n;i++){
            if(i % k == 0){
                count1++;
                sum1 += i;
            }else{
                count2++;
                sum2 += i;
            }
        }
        System.out.printf("%.1f" + " ",sum1 * 1.0 / count1);
        System.out.printf("%.1f",sum2 * 1.0 / count2);
    }
}
