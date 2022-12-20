import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class P5714 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double m = scan.nextDouble();
        double n = scan.nextDouble();
        List<Object> list = new LinkedList<>();
        double BMI = m / (n * n);

        if(BMI < 18.5){
            System.out.println("Underweight");
        }else if(BMI < 24 && BMI >= 18.5){
            System.out.println("Normal");
        }else {
            char [] bmi =new BigDecimal(String.valueOf(BMI)).divide(BigDecimal.ONE, new MathContext(6)).toString().toCharArray();
            int flag = 1;
            for(int i=6;i>=0;i--) { //重后往前遇到第一个非0数开始输出，满足去0要求
                if(bmi[i]=='0'&& flag==1) {
                    continue;
                }
                flag = 0;
                list.add(bmi[i]);
            }
            Collections.reverse(list); //列表反转
            for(Object i:list) { //输出
                System.out.print(i);
            }
            System.out.println();
            System.out.println("Overweight");
        }
    }
}
