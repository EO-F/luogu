import java.io.*;
import java.util.Scanner;

public class P5728 {

    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

    public static void main(String[] args) throws IOException {

        int n = nextInt();
        int[][] arr = new int[n + 1][3];
        for(int i = 0;i < n;i++){
            arr[i][0] = nextInt();
            arr[i][1] = nextInt();
            arr[i][2] = nextInt();
        }
        int res = 0;
        for(int i = 0; i < arr.length;i++){
            for(int j = i+ 1;j < arr.length;j++){
                    int sum1 = arr[i][0] + arr[i][1] + arr[i][2];
                    int sum2 = arr[j][0] + arr[j][1] + arr[j][2];
                    //TODO 分数要去绝对值进行比较
                    if(Math.abs(arr[i][0] - arr[j][0]) <= 5 && Math.abs(arr[i][1] - arr[j][1]) <= 5 && Math.abs(arr[i][2] - arr[j][2]) <= 5 && Math.abs(sum1 - sum2) <= 10){
                        res++;
                }
            }
        }
        System.out.println(res);
    }
}
