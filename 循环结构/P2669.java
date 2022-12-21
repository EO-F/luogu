import java.util.Scanner;

public class P2669 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();

        int count = 1;
        int sum = 0;
        int i;
        for(i = k;i > 0;i -= count){
            int n = count;
            while(n != 0){
                sum += count;
                n--;
            }
            count++;
        }
        //TODO 需要判断天数不够count，但仍需发工资的情况
        while (i + count - 1 > 0){
            sum += count;
            i--;
        }
        System.out.println(sum);
    }
}
