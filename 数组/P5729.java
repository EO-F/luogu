import java.io.*;
import java.util.Scanner;

public class P5729 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int n = scanner.nextInt();
        int[][][] cube = new int[x + 1][y + 1][z + 1];
        for (int i = 0; i < n; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int z1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int z2 = scanner.nextInt();
            for (int j = x1; j <= x2; j++) {
                for (int k = y1; k <= y2; k++) {
                    for (int l = z1; l <= z2; l++) {
                        cube[j][k][l] = 1;
                    }
                }
            }
        }
        int count = 0;
        for (int j = 1; j <= x; j++) {
            for (int k = 1; k <= y; k++) {
                for (int l = 1; l <= z; l++) {
                    if (cube[j][k][l] == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
