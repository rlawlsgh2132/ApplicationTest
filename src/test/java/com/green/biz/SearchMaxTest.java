package com.green.biz;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchMaxTest {

	@Test
	public void test() {
		CalcUtil calc = new CalcUtil();
		int[]a = {1,3,4,2};
		int[]b = {-12,-1,-3,-4,-2};
		
		System.out.println(calc.searchMax(a));
		
		System.out.println(calc.searchMax(b));
	}

}
