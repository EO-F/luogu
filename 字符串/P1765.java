import java.util.Scanner;

public class P1765 {
    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[][] { { '0', 'a', 'b', 'c' }, { '0', 'd', 'e', 'f' }, { '0', 'g', 'h', 'i' },
                { '0', 'j', 'k', 'l' }, { '0', 'm', 'n', 'o' }, { '0', 'p', 'q', 'r', 's' }, { '0', 't', 'u', 'v' },
                { '0', 'w', 'x', 'y', 'z' } };
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            } else {
                for (int j = 0; j < arr.length; j++) {
                    for (int j2 = 1; j2 < arr[j].length; j2++) {
                        if (s.charAt(i) == arr[j][j2]) {
                            count += j2;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
