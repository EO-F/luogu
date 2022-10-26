import java.io.BufferedInputStream;
import java.util.Scanner;

public class p1042 {
    static String str;
    static int a,b;
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(new BufferedInputStream(System.in));
        do{
            sb.append(scan.next());
        }while (sb.indexOf("E") == -1);

        str = sb.substring(0,sb.indexOf("E") + 1);
        print11();
        System.out.println();
        print21();
    }
    public static void print11(){
        a = b = 0;
        for(int i = 0;str.charAt(i) != 'E';i++){
            if(str.charAt(i) == 'W'){
                a++;
            }else{
                b++;
            }
            if((a - b >= 2 || b - a >= 2) && (a >= 11 || b >= 11)){
                System.out.println(a + ":" + b);
                a = b = 0;
            }
        }
        System.out.println(a + ":" + b);
    }

    public static void print21(){
        a = b = 0;
        for(int i = 0;str.charAt(i) != 'E';i++){
            if(str.charAt(i) == 'W'){
                a++;
            }else{
                b++;
            }
            if((a - b >= 2 || b - a >= 2) && (a >= 21 || b >= 21)){
                System.out.println(a + ":" + b);
                a = b = 0;
            }
        }
        System.out.println(a + ":" + b);
    }
}
