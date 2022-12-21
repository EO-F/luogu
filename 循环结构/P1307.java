import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P1307 {
    //    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        boolean flag = false;
//        if(n < 0){
//            flag = true;
//            n = -n;
//        }
//        int sum = 0;
//        int len = 0;
//        int a = n;
//        while (a != 0){
//            a /= 10;
//            len++;
//        }
//        while(n != 0){
//            sum += (n % 10) * Math.pow(10,len - 1);
//            len--;
//            n /= 10;
//        }
//        if(flag){
//            sum = -sum;
//        }
//        System.out.println(sum);
//    }

    //思路二
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int s = 0;
//        for(int n = scan.nextInt();n != 0;n /= 10){
//            s = s * 10 + n % 10;
//        }
//        System.out.println(s);
//    }

    //思路三
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // 将数据存入
        StringBuffer sb=new StringBuffer(br.readLine().trim());
        sb.reverse();   // 反转
        //负号跑到最后
        if(sb.charAt(sb.length()-1)=='-'){
            // 删除负号并且在头插入负号
            sb.delete(sb.length()-1, sb.length());
            sb.insert(0, '-');

        }
        System.out.println(Integer.parseInt(sb.toString()));
    }
}
