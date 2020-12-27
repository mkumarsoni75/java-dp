package learn.dp;

public class Grid {
	
	public static int gridTraveler(int m, int n,int[][] memo){
		
		if(m ==1 && n ==1) return 1;
		if(m == 0 || n == 0) return 0;
		if(memo[m][n] != 0) return memo[m][n];
		memo[m][n] = gridTraveler(m-1,n,memo)+gridTraveler(m,n-1,memo);
		return memo[m][n];
	}
public static int gridTraveler(int m, int n){
		
		if(m ==1 && n ==1) return 1;
		if(m == 0 || n == 0) return 0;
		
		
		return gridTraveler(m-1,n)+gridTraveler(m,n-1);
	}

	public static void main(String[] args) {
		System.out.println(gridTraveler(17,17,new int[10000][10000])); //601080390
		//System.out.println(gridTraveler(15,15,new int[10000][10000])); //40116600
	}

}
