import java.util.Scanner;

public class P4956 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1;i < 101;i++){
            for(int j = 1;j < 101;j++){
                if(52 * 7 * j + i * 21 * 52 == n){
                    System.out.println(j);
                    System.out.println(i);
                    System.exit(0);
                }
            }
        }
    }
}
