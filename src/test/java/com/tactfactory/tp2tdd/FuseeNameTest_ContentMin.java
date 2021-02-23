package com.tactfactory.tp2tdd;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.tactfactory.tp2tdd.fusee.Fusee;
import com.tactfactory.tp2tdd.utils.GenericNameTest;
import com.tactfactory.tp2tdd.utils.StringUtils;

public class FuseeNameTest_ContentMin {

	/**
	 * testNameContentMinOk test function.
	 *
	 * @throws Exception to throw.
	 */
	@Test
	public void testNameContentMinOk() throws Exception {
		Fusee fusee = new Fusee();
		fusee.setName("Aaaa");
		GenericNameTest.testNameContentMinOk(fusee.getName());
	}
	
	/**
	 * testNameContentMinKo test function.
	 *
	 * @throws Exception to throw.
	 */
	@Test
	public void testNameContentMinKo() throws Exception {
		Fusee fusee = new Fusee();
		fusee.setName("AaaA");
		GenericNameTest.testNameContentMinKo(fusee.getName());
	}
	
	/**
	 * testNameContentNull test function.
	 */
	@Test
	public void testNameContentMinNull() {
		Fusee fusee = new Fusee();
		assertThrows(Exception.class, () -> {
			fusee.setName(null);
		});
	}
	
	/**
	 * testNameContentEmpty test function.
	 */
	@Test
	public void testNameContentMinEmpty() {
		Fusee fusee = new Fusee();
		assertThrows(Exception.class, () -> {
			fusee.setName("");
		});
	}
	
	/**
	 * testNameContentOneChar test function.
	 *
	 * @throws Exception to throw.
	 */
	@Test
	public void testNameContentMinOneChar() throws Exception {
		Fusee fusee = new Fusee();
		fusee.setName("a");
		assertTrue(fusee.getName().length() == 1);
	}
	
	/**
	 * testNameContentWithabcdef test function.
	 *
	 * @throws Exception to throw.
	 */
	@Test
	public void testNameContentMinWithabcdef() throws Exception {
		Fusee fusee = new Fusee();
		fusee.setName("abcdef");
		assertTrue(fusee.getName().equals("Abcdef"));
	}
	
	/**
	 * testNameContentRandom test function.
	 *
	 * @throws Exception to throw
	 */
	@Test
	public void testNameContentMinRandom() throws Exception {
		Fusee fusee = new Fusee();
		fusee.setName(StringUtils.getRandomString());
		GenericNameTest.testNameContentMinOk(fusee.getName());
	}
}
