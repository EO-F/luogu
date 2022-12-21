import java.util.Scanner;

public class P5721 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 1;
        for(int i = 0;i < n;i++){
            for(int j = n - i;j > 0;j--){
                if(count < 10){
                    System.out.printf("0" + "%d",count);
                }else{
                    System.out.printf("%d",count);
                }
                count++;
            }
            System.out.println();
        }
    }
}
