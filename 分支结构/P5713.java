import java.util.Scanner;

public class P5713 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum1 = 5 * n;
        int sum2 = 3 * n + 11;
        if(sum2 > sum1){
            System.out.println("Local");
        }else{
            System.out.println("Luogu");
        }
    }
}
