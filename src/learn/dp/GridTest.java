package learn.dp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;




public class GridTest {

	@Test
	public void GridwithMemoTest(){
		assertEquals(Grid.gridTraveler(15,15,new int[10000][10000]), 40116600);
	}
	@Test
	public void GridwithoutMemoTest(){
		assertEquals(Grid.gridTraveler(15,15), 40116600);
	}
}
