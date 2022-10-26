import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

//TODO
public class p1102 {
    public static void main(String[] args) throws Exception {
        Read read = new Read();
        int n = read.nextInt();
        int c = read.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = read.nextInt();
        }
        int count = 0;

        System.out.println(count);
    }
    static class Read {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

        public int nextInt() throws Exception {
            st.nextToken();
            return (int) st.nval;
        }
    }
}
