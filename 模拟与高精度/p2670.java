import java.io.BufferedInputStream;
import java.util.Scanner;

// TODO 使数组大一圈，就不用处理复杂的边界越界问题了！！！！！！！！！！！！！！！！
public class p2670 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedInputStream(System.in));
        String[] s = scan.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        char[][] arr= new char[n + 2][m + 2];
        for(int i = 1;i < n + 1;i++){
            char[] temp = scan.nextLine().toCharArray();
            for(int j= 1;j < m + 1;j++){
                arr[i][j] = temp[j - 1];
            }
            //TODO 不能这样获取输入数组，这样的数组前后都不为空
//            arr[i] = scan.nextLine().toCharArray();
        }
        for(int i = 1;i < n + 1;i++){
            for(int j = 1;j < m + 1;j++){
                int sum = 0;
                if(arr[i][j] == '*'){
                    System.out.printf("*");
                }else{
                    if(arr[i][j + 1] == '*')sum++;
                    if(arr[i][j - 1] == '*')sum++;
                    if(arr[i + 1][j] == '*')sum++;
                    if(arr[i - 1][j] == '*')sum++;
                    if(arr[i + 1][j + 1] == '*')sum++;
                    if(arr[i + 1][j - 1] == '*')sum++;
                    if(arr[i - 1][j + 1] == '*')sum++;
                    if(arr[i - 1][j - 1] == '*')sum++;
                    System.out.printf(String.valueOf(sum));
                }
            }
            System.out.println();
        }
    }
}
