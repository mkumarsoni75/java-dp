package learn.dp;

import java.util.HashMap;
// leetcode : https://leetcode.com/problems/unique-paths/
public class UniquePaths {
	 public int uniquePaths(int m, int n) {
	        return returnUniquePaths(m,n,new HashMap<String,Integer>());
	    }
	    public int returnUniquePaths(int m, int n, HashMap<String,Integer> memo){
	        
	        String key = (m+"+"+n).toString();
	        if(m == 1 && n == 1) return 1;
	        if(m == 0 && n != 0) return 0;
	        if(m != 0 && n == 0) return 0;
	        if(memo.containsKey(key)) return memo.get(key);
	        
	        memo.put(key, returnUniquePaths(m-1,n, memo)+returnUniquePaths(m,n-1,memo));
	        return memo.get((m+"+"+n).toString());
	        
	    }
	}
