import java.util.Scanner;

public class P1957 {

    public static int Lenth(int ans) {
        String str = ans + "";
        return str.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String x = "";
        int a, b, ans;    // 存储数据
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String c[] = s.split(" ");
            if (c.length == 3) {
                // 获得当前运算符
                x = c[0];
                a = Integer.parseInt(c[1]);
                b = Integer.parseInt(c[2]);
            } else {
                a = Integer.parseInt(c[0]);
                b = Integer.parseInt(c[1]);
            }
            switch (x) {
                case "a":
                    ans = a + b;
                    System.out.println(a + "+" + b + "=" + ans);
                    System.out.println(Lenth(a) + Lenth(b) + 2 + Lenth(ans));
                    break;
                case "b":
                    ans = a - b;
                    System.out.println(a + "-" + b + "=" + ans);
                    System.out.println(Lenth(a) + Lenth(b) + 2 + Lenth(ans));
                    break;
                case "c":
                    ans = a * b;
                    System.out.println(a + "*" + b + "=" + ans);
                    System.out.println(Lenth(a) + Lenth(b) + 2 + Lenth(ans));
                    break;
            }
        }
    }
}
