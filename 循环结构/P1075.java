import java.util.Scanner;

public class P1075 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        for(i = 2;i * i <= n;i++){
            if(n % i ==  0){
                break;
            }
        }
        System.out.println(n / i);
    }
}
