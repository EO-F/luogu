import java.util.Scanner;
//TODO
public class P1321 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int boy = 0;
        int girl = 0;
        for(int i = 0;i < s.length() - 2;i++){
            if(s.charAt(i) == 'b' || s.charAt(i + 1) == 'o' || s.charAt(i + 2) == 'y'){
                boy++;
            }
        }
        for(int i = 0;i < s.length() - 3;i++){
            if(s.charAt(i) == 'g' || s.charAt(i + 1) == 'i' || s.charAt(i + 2) == 'r'||s.charAt(i + 3) == 'l'){
                girl++;
            }
        }
        System.out.println(boy);
        System.out.println(girl);
    }
}
