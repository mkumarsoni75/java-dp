package learn.dp;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {

	public static boolean canSum(int target, int[] values){
		if(target == 0) return true;
		if(target  < 0) return false;
		
		
		for(int i: values){
			int v = target - i;
			
			if( canSum(v, values) == true)
				return true;
		}
		return false;
	}
	public static boolean canSumWithMemo(int target, int[] values, Map<Integer,Boolean> list){
		if(target == 0) return true;
		if(target  < 0) return false;
		if(list.containsKey(target)) return list.get(target);
		
		for(int i: values){
			int v = target - i;
			list.put(v, canSumWithMemo(v, values, list));
			if( list.get(v) == true)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
	
		System.out.println(canSumWithMemo(300,new int[]{7,14}, new HashMap<Integer,Boolean>()));

	}

}
