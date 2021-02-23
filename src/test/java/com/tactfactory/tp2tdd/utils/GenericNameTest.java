package com.tactfactory.tp2tdd.utils;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenericNameTest {

	/**
	 * NameStartWithMaj test function. Maj are ascii 65->90
	 */
	public static void nameStartWithMajOk(String test) {
		assertTrue(test.charAt(0) >= 65 && test.charAt(0) <= 90);
	}

	/**
	 * NameStartWithMaj test function. Printable other elements are 32->64 91->126
	 */
	public static void nameStartWithMajKo(String test) {
		assertTrue(test.charAt(0) < 65 || test.charAt(0) > 90);
	}

  /**
   * testNameContentMin test function.
   * Maj are ascii 65->90
   */
  public static void testNameContentMinOk(String test) {
	  boolean allMin = true;
	  			  
	  for (int i = 1; i < test.length(); i++) {
		  if(!(test.charAt(i) >= 97 && test.charAt(i) <= 122)){
			  allMin = false;
		  }
	  }
	 
	  assertTrue(allMin);
  	}
  
  /**
   * testNameContentMin test function.
   * Maj are ascii 65->90
   */
  public static void testNameContentMinKo(String test) {
	  boolean allMin = true;
			  
	  for (int i = 1; i < test.length(); i++) {
		  if(test.charAt(i) >= 97 && test.charAt(i) <= 122){
			  allMin = false;
		  }
	  }
	 
	  assertTrue(!allMin);
  	}
}