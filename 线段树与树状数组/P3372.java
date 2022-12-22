import java.io.*;

public class P3372 {

    static long[] tree = new long[100000 << 2], mark = new long[100000 << 2]; //mark懒人标记
    static int[] A;//存储数据输入

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
        int n = nextInt();
        int m = nextInt();
        A = new int[n + 1];
        for(int i = 1;i <= n;i++){
            A[i] = nextInt();
        }
        build(1,n,1);//建树
        for(int i = 1;i <= m;i++){
            int t = nextInt();
            int x = nextInt();
            int y = nextInt();
            if(t == 1){
                int k = nextInt();
                update(x,y,k,1,1,n);
            }else {
                out.println(query(x,y,1,1,n));
            }
        }
        out.flush();
    }

    private static void build(int l, int r, int p) {
        if(l == r){
            tree[p] = A[l];
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
        if(l == r)return;
        int m = l + ((r - l) >> 1);
        tree[p << 1] += mark[p] * (m - l + 1);
        mark[p << 1] += mark[p];
        tree[p << 1 | 1] += mark[p] * (r - m);
        mark[p << 1 | 1] += mark[p];
        mark[p] = 0;
    }

    private static void update(int l,int r,int d,int p,int ll,int rr){
        if(l <= ll && rr <= r){
            tree[p] += d * (rr - ll + 1);
            mark[p] += d;
            return;
        }
        push_down(p,ll,rr);
        int m = ll + ((rr - ll) >> 1);
        if(l <= m)update(l,r,d,p << 1,ll,m);
        if(r > m)update(l,r,d,p << 1 | 1,m + 1,rr);
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
