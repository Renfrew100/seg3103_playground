package test;

import tic_java.Tic;

public class TicTest {
	
	Tic obj = new Tic();
	
	void default_Board() {
		String[] [] map = {{"_","_","_"},{"_","_","_"},{"_","_","_"}};
		assertEquals(map,obj.default_Board());
	}
	
	public void test_emptyBoard{
		String[][] map = {{"_","_"},{"_","_"}};
		assertEquals(result2, obj.emptyBoard(2,2));		
	}
	
	void sizeBoard{
		String[][] result= obj.emptyBoard(4, 4);
	    assertEquals(16,obj.boardSize(result)); //get result from above
	}
	
	void test_winner() {
		assertEquals(true, obj.winner());
	}
	
	void test_boardPositions{
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
