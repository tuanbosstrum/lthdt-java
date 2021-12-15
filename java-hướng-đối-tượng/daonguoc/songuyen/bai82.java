package songuyen;

public class bai82 {
	boolean b[] = new boolean[101];
	boolean a[][]= new boolean[101][101];
	int M = -1;
	void dfs(int u, int v, int n, int count){
	    b[u] = false;
	    for (int i = 1; i <= n; i++){
	        if (a[u][i] && b[i]){
	            if (i == v){
	                if (count+1 > M){
	                    M = count+1;
	                    break;
	                }
	            }
	            dfs(i, v, n, count+1);
	            b[i] = true;
	        }
	    }
	}
	int graphFunction(int n, int[][] e, int u, int v) {
	    for (int i = 0; i <= n; i++){
	        b[i] = true;
	    }
	    for (int i = 1; i <= n; i++){
	        for (int j = 1; j <= n; j++){
	            a[i][j] = false;
	        }
	    }
	    for (int i = 0; i < e.length; i++){
	    	a[e[i][0]][e[i][1]] = true;
            a[e[i][1]][e[i][0]] = true;
	    }
	    dfs(u, v, n, 0);
	    return M;
	}
}
