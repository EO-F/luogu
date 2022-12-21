import java.util.Scanner;

public class P1086 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        for(int i = 1;i <= 12;i++){
            int a = scan.nextInt();
            if(a  > 300 + sum){
                System.out.println("-" + i);
                System.exit(0);
            }
            sum += 300 - a;
            while(sum >= 100){
                count++;
                sum -= 100;
            }
        }
        System.out.println((int)(sum + (100 * count) * 1.2));
    }
}
