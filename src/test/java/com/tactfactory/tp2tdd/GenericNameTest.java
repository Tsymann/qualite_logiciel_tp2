package com.tactfactory.tp2tdd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

public class GenericNameTest {
   
   /**
   * NameStartWithMaj function
   *
   */
	@Test
	public static void nameStartWithMajKo(String test) {
		
		
		//65 -> 90 C'est une maj (Ascii)
		// Imprimable non maj 32 -> 64  91 -> 126 inclu
		
		/*for (int i = 32; i <= 64; i++) {
			String test = Character.toString(i);
			assertFalse(test.charAt(0) >= 65 && test.charAt(0) <= 90);
		}*/
		/*for (int i = 91; i <= 162; i++) {
			String test = Character.toString(i);
		}*/
		assertFalse(test.charAt(0) >= 65 || test.charAt(0) <= 90);
	}
	
	@Test
	public static void nameStartWithMajOk(String test) {
		/*for (int i = 65; i <= 90; i++) {
			String test = Character.toString(i);
		}*/
		assertTrue(test.charAt(0) >= 65 && test.charAt(0) <= 90);
	}
}
