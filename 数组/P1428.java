import java.util.Scanner;

public class P1428 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = scan.nextInt();
        }
        for(int i = 0;i < n;i++){
            int count = 0;
            for(int j = 0;j <= i - 1;j++){
                if(arr[j] < arr[i]){
                    count++;
                }
            }
            if(i == n - 1){
                System.out.printf("%d",count);
                break;
            }
            System.out.printf("%d" + " ",count);
        }
    }
}
