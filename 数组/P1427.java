import java.util.Arrays;
import java.util.Scanner;

public class P1427 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
        for(int i = arr.length - 2;i >= 0;i--){
            if(i == 0){
                System.out.printf("%s",arr[i]);
            }else {
                System.out.printf("%s" + " ",arr[i]);
            }
        }
    }
}
