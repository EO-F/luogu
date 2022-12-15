import java.math.BigInteger;
import java.util.Scanner;

public class p1009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        BigInteger sum = new BigInteger("0");
        for(int i = 1;i <= n;i++){
            sum = sum.add(getN(i));
        }
        System.out.println(sum);
    }
    public static BigInteger getN(int n){
        BigInteger sumN = BigInteger.valueOf(1);
        for(int i = 2;i <= n;i++){
            sumN = sumN.multiply(new BigInteger(Integer.toString(i)));
        }
        return sumN;
    }
}
