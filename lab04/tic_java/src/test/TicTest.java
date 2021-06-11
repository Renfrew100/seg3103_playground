package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class TicTest {
	
	Tic obj = new Tic();
	tic_java.tic_java ob = new tic_java.tic_java();
	
	@Test
	void default_Board() {
		String[] [] map = {{"_","_","_"},{"_","_","_"},{"_","_","_"}};
		assertEquals(map,obj.default_Board());
	}
	
	@Test
	public void test_emptyBoard(){
		String[][] map = {{"_","5"},{"_","_"}};
		assertEquals(map, obj.emptyBoard(2,2));		
	}
	
	@Test
	void sizeBoard(){
		String[][] result= obj.emptyBoard(4, 4);
	    assertEquals(16,obj.sizeBoard(result)); //get result from above
	}
	
	@Test
	void test_winner() {
		assertEquals(true, obj.winner());
	}
	
	@Test
	void test_boardPositions(){
		assertEquals("X", obj.boardPositions(true, 0, 1));
		assertEquals("O", obj.boardPositions(false, 0, 2));
		assertEquals("X", obj.boardPositions(true, 1, 1));
		assertEquals("O", obj.boardPositions(false, 2, 0));
		assertEquals("X", obj.boardPositions(true, 2, 1));
		assertEquals("O", obj.boardPositions(false, 2, 2));
		//assertEquals("O", obj.boardPositions(true, 2, 2));
		assertEquals("N", obj.boardPositions(true, 2, 2));
	}
	
}
