import java.math.BigDecimal;
import java.util.Scanner;

public class P1035 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        boolean flag = true;
        BigDecimal sum = new BigDecimal("0");
        BigDecimal count = new BigDecimal("0");
        BigDecimal one = new BigDecimal("1");
        BigDecimal K = new BigDecimal(k);
        while (flag){
            count = count.add(one);
            sum = sum.add(one.divide(count));
            if(sum.compareTo(K) == 1){
                flag = false;
            }
        }
        System.out.println(count.intValue());
    }
}

/**
 * import java.io.*;
 * import java.util.*;
 * public class Main{
 * 	public static void main(String[] args) throws Exception {
 * 		Scanner cin = new Scanner(System.in);
 * 		int k, n;
 * 		k = cin.nextInt();
 * 		double sum = 0;
 * 		// for(n=1; ; n++){
 * 		// 	sum += (double)1/n;
 * 		// }
 * 		n = 0;
 * 		while (sum < k) {
 * 			n++;
 * 			sum += (double)1/n;
 *                }
 * 		System.out.println(n);* 	}
 * }
 */
