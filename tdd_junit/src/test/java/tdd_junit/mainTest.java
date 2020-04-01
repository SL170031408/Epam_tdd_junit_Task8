package tdd_junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class mainTest {
main dhir=new main();

	@Test
	public void Dhiraj() {
	assertEquals("DHI",dhir.accept("DHI"));	
	}


	@Test
	public void test9() {
	assertEquals("CD",dhir.accept("AACD"));	
	}
    

	@Test
	public void test8() {
	assertEquals("",dhir.accept(""));	
	}
	@Test
	public void test7() {
	assertEquals("BAA",dhir.accept("AABAA"));	
	}

	@Test
	public void test6() {
	assertEquals("BCD",dhir.accept("BACD"));	
	}

	@Test
	public void test5() {
	assertEquals("BBAA",dhir.accept("BBAA"));	
	}
	
	@Test
	public void test4() {
	assertEquals("",dhir.accept("AA"));	
	}
}
