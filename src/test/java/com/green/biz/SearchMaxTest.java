package com.green.biz;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchMaxTest {

	@Test
	public void test() {
		CalcUtil calc = new CalcUtil();
		int[]a = {1,3,4,2};
		int[]b = {-12,-1,-3,-4,-2};
		
		assertEquals("SearchMax",4,calc.searchMax(a));
		
		System.out.println(calc.searchMax(a));
		
		assertEquals("SearchMax",-1,calc.searchMax(b));
		
		System.out.println(calc.searchMax(b));
	}

}
