import java.util.Scanner;

public class P1914 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        char[] arr = scan.nextLine().toCharArray();
        for(int i = 0;i < arr.length;i++){
            arr[i] = (char) (arr[i] + n);
            if(arr[i] > 'z'){
                arr[i] = (char) (arr[i] - 26);
            }
        }
        System.out.println(arr);
    }
}
