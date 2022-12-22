import java.io.*;
import java.util.Arrays;

public class P1047ToSegmentTree {

    static long[] tree = new long[100000 << 2], mark = new long[100000 << 2]; //mark懒人标记

    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

    public static String next() throws IOException {
        in.nextToken();
        return (String) in.sval;
    }

    public static double nextDouble() throws IOException {
        in.nextToken();
        return in.nval;
    }

    public static float nextFloat() throws IOException {
        in.nextToken();
        return (float) in.nval;
    }

    public static void main(String[] args) throws IOException {
        int l = nextInt();
        int m = nextInt();
        build(1,l + 1,1);
        for(int i = 0;i < m;i++){
            int u = nextInt();
            int v = nextInt();
            update(u + 1,v + 1,1,1,l + 1);
        }
        System.out.println(query(0,l,1,0,l));
    }

    private static void build(int l, int r, int p) {
        if(l == r){
            tree[p] = 1;
            return;
        }
        int m = l + ((r - l) >> 1);
        //创建左子树
        build(l,m,p << 1);
        //创建右子树
        build(m + 1,r, p << 1 | 1);
        tree[p] = tree[p << 1] + tree[p << 1 | 1];
    }

    private static void push_down(int p,int l,int r){
        //这里我们使用push_down统一清除标记
        if(mark[p] == 1) {
            tree[p << 1] = 0;
            mark[p << 1] = 1;
            tree[p << 1 | 1] = 0;
            mark[p << 1 | 1] = 1;
            mark[p] = 0;
        }
    }

    private static void update(int l,int r,int p,int ll,int rr){
        if(l <= ll && rr <= r){
            tree[p] = 0;
            mark[p] = 1;
            return;
        }
        push_down(p,ll,rr);
        int m = ll + ((rr - ll) >> 1);
        if(l <= m)update(l,r,p << 1,ll,m);
        if(r > m)update(l,r,p << 1 | 1,m + 1,rr);
        tree[p] = tree[p << 1] + tree[p << 1 | 1];
    }

    private static long query(int l,int r,int p,int ll,int rr){
        if(l <= ll && rr <= r)return tree[p];
        push_down(p,ll,rr);
        int m = ll + ((rr - ll) >> 1);
        long ans = 0;
        if(l <= m) ans += query(l,r,p << 1,ll,m);
        if(r > m) ans += query(l,r,p << 1 | 1,m + 1,rr);
        return ans;
    }
}
