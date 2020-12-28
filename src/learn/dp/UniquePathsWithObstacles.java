package learn.dp;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/unique-paths-ii/submissions/

public class UniquePathsWithObstacles {
	 public int uniquePathsWithObstacles(int[][] obstacleGrid) {
	       int m =obstacleGrid.length -1;
	       int n =obstacleGrid[0].length - 1;
	      //  if(n ==0 && m ==0 && obstacleGrid[m][n] ==1) return 0;
	        return returnUniquePaths(obstacleGrid, m,n, new HashMap<String, Integer>());
	    }
	     public int returnUniquePaths(int[][] obstacleGrid,int m, int n, Map<String,Integer> memo){
	        
	        String key = (m+"+"+n).toString();
	           if( m > -1 && n > -1 && obstacleGrid[m][n] == 1) return 0;
	        if(m == 0 && n == 0) return 1;
	        
	        if(m == -1 && n != -1) return 0;
	        if(m != -1 && n == -1) return 0;
	        
	        if(memo.containsKey(key)) return memo.get(key);
	        
	        memo.put(key, Integer.valueOf(returnUniquePaths(obstacleGrid,m-1,n, memo)+returnUniquePaths(obstacleGrid,m,n-1,memo)));
	        return memo.get((m+"+"+n).toString());
	        
	    }
	
}
