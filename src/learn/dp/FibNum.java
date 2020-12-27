package learn.dp;

import java.util.HashMap;
import java.util.Map;

public class FibNum {
	
	public static Long fib(long num, Map<Long,Long> map){
		
		if (num <= 2) return 1L;
		if(map.containsKey(num)) return map.get(num);
		long number = fib(num-1,map)+fib(num-2,map);
		map.put(num, number);
		return map.get(num);
	}
public static Long fibwithoutMemo(long num){
		
		if (num <= 2) return 1L;
		return fibwithoutMemo(num-1)+fibwithoutMemo(num-2);
	}
	

}
