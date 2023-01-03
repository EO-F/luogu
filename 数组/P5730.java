import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class P5730 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(br.readLine());
        String a = br.readLine();
        char b[] = a.toCharArray();

        String s0 [] = {"XXX","X.X","X.X","X.X","XXX"};
        String s1 [] = {"..X","..X","..X","..X","..X"};
        String s2 [] = {"XXX","..X","XXX","X..","XXX"};
        String s3 [] = {"XXX","..X","XXX","..X","XXX"};
        String s4 [] = {"X.X","X.X","XXX","..X","..X"};
        String s5 [] = {"XXX","X..","XXX","..X","XXX"};
        String s6 [] = {"XXX","X..","XXX","X.X","XXX"};
        String s7 [] = {"XXX","..X","..X","..X","..X"};
        String s8 [] = {"XXX","X.X","XXX","X.X","XXX"};
        String s9 [] = {"XXX","X.X","XXX","..X","XXX"};

        for(int i=0; i<5; i++) {
            for(int j=0; j<n; j++) {
                int t = b[j]-48;
                switch(t) {
                    case 0:
                        pw.print(s0[i]);
                        if(j!=n-1) {
                            pw.print(".");
                        }
                        continue;
                    case 1:
                        pw.print(s1[i]);
                        if(j!=n-1) {
                            pw.print(".");
                        }
                        continue;
                    case 2:
                        pw.print(s2[i]);
                        if(j!=n-1) {
                            pw.print(".");
                        }
                        continue;
                    case 3:
                        pw.print(s3[i]);
                        if(j!=n-1) {
                            pw.print(".");
                        }
                        continue;
                    case 4:
                        pw.print(s4[i]);
                        if(j!=n-1) {
                            pw.print(".");
                        }
                        continue;
                    case 5:
                        pw.print(s5[i]);
                        if(j!=n-1) {
                            pw.print(".");
                        }
                        continue;
                    case 6:
                        pw.print(s6[i]);
                        if(j!=n-1) {
                            pw.print(".");
                        }
                        continue;
                    case 7:
                        pw.print(s7[i]);
                        if(j!=n-1) {
                            pw.print(".");
                        }
                        continue;
                    case 8:
                        pw.print(s8[i]);
                        if(j!=n-1) {
                            pw.print(".");
                        }
                        continue;
                    case 9:
                        pw.print(s9[i]);
                        if(j!=n-1) {
                            pw.print(".");
                        }
                        continue;
                }
            }
            pw.println();
        }
        pw.flush();

    }
}

