import java.util.Scanner;

public class P1425 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        int hour = c - a;
        int m = 0;
        if(d < b){
            hour--;
            m = 60 - b + d;
        }else{
            m = d - b;
        }
        System.out.println(hour + " " + m);
    }
}
