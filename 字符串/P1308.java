import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1308{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str0 = sc.nextLine();
        String str = sc.nextLine();
        String wordExp = "[a-zA-z]+";
        Pattern pattern = Pattern.compile(wordExp);
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        int index = -1;
        while(matcher.find()) {
            if(matcher.group().equalsIgnoreCase(str0)) {
                count++;
                if(index==-1) {
                    index = matcher.start();
                }
            }
        }
        if(count>0) {
            System.out.println(count+" "+index);
        }else {
            System.out.println(-1);
        }
    }
}

