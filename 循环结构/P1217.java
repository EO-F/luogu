import java.util.Scanner;

public class P1217 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();


    }
    public static boolean isPrime(int n){
        for(int i = 2;i * i <= n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
