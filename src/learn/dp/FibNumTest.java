package learn.dp;



import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;


public class FibNumTest {
	
	@Test
	public void testFibNumber(){
		
		assertEquals(Long.valueOf(FibNum.fib(50, new HashMap<>())), Long.valueOf(12586269025L));
		assertEquals(Long.valueOf(FibNum.fib(0, new HashMap<>())), Long.valueOf(1L));
		assertEquals(Long.valueOf(FibNum.fib(1, new HashMap<>())), Long.valueOf(1L));
		assertEquals(Long.valueOf(FibNum.fib(2, new HashMap<>())), Long.valueOf(1L));
		assertEquals(Long.valueOf(FibNum.fib(3, new HashMap<>())), Long.valueOf(2L));
	}
	@Test
	public void testFibWithoutMemo(){
		
		//assertEquals(Long.valueOf(FibNum.fibwithoutMemo(50)), Long.valueOf(12586269025L));
		assertEquals(Long.valueOf(FibNum.fibwithoutMemo(0)), Long.valueOf(1L));
		assertEquals(Long.valueOf(FibNum.fibwithoutMemo(1)), Long.valueOf(1L));
		assertEquals(Long.valueOf(FibNum.fibwithoutMemo(2)), Long.valueOf(1L));
		assertEquals(Long.valueOf(FibNum.fibwithoutMemo(3)), Long.valueOf(2L));
	}

}
