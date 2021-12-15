package songuyen;

public class bai80 {

boolean b[] = new boolean[1001];
boolean a[][] = new boolean[1001][1001];
boolean kt = false;
void dfs(int u, int v, int n){
    b[u]= false;
    for(int i = 0; i<= n; i++){
        if(a[u][i]&& b[i]){
            if(i==v){
                kt = true;
            }
            dfs(i,v,n);
            b[i] = true;
        }
    }
}
boolean check(int n, int[][] e, int u, int v) {
    for(int i = 0;i<=n;i++){
        b[i] = true;
    }
    for(int i = 1;i<=n;i++){
        for(int j = 1;j<=n;j++){
            a[i][j] = false;
        }
    }
    for(int i = 0;i<e.length;i++){
        a[e[i][0]][e[i][1]] = true;
    }
    dfs(u,v,n);
    return kt;
}

}
