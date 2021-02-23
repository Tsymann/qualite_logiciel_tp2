package com.tactfactory.tp2tdd;

import java.util.Random;

import org.junit.jupiter.api.Test;

import com.tactfactory.tp2tdd.fusee.Fusee;

public class FuseeNameTest {
	/**
	 * testNameStringWithMajOk test function
	 */
	private Random rand = new Random();
	@Test
	public void testNameStartWithMajOk() {
		Fusee fusee = new Fusee();
		fusee.setName(Character.toString((rand.nextInt(26)+65)% 91));
		GenericNameTest.nameStartWithMajOk(fusee.getName());
	}
	/**
	 * testNameStringWithMajOk test function
	 */
	@Test
	public void testNameStartWithMajKo() {
		Fusee fusee = new Fusee();
		String c = Character.toString(rand.nextInt(126 - 32) + 32);
		if(((char)c.charAt(0)) >= 65 || ((char)c.charAt(0)) <= 90) {
			c = c + 26;
		}
		fusee.setName(c);
		GenericNameTest.nameStartWithMajOk(fusee.getName());
	}
}
