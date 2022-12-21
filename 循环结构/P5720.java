import java.util.Scanner;

public class P5720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int count = 1;
        while(n != 1){
            n /= 2;
            count++;
        }
        System.out.println(count);
    }
}
