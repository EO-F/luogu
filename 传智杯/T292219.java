import java.util.HashSet;
import java.util.Scanner;

public class T292219 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        HashSet<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        while (flag){
            String s = scan.nextLine();
            if(s.equals("0")){
                flag = false;
                continue;
            }
            if(set.contains(s)){
                continue;
            }
            set.add(s);
            sb.append(s);
        }
        System.out.println(sb);
    }
}
