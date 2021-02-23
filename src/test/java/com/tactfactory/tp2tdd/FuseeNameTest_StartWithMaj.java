package com.tactfactory.tp2tdd;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.tactfactory.tp2tdd.fusee.Fusee;
import com.tactfactory.tp2tdd.utils.GenericNameTest;
import com.tactfactory.tp2tdd.utils.StringUtils;
import org.junit.jupiter.api.Test;

public class FuseeNameTest_StartWithMaj {

	/**
	 * testNameStartWithMajOk test function.
	 *
	 * @throws Exception to throw.
	 */
	@Test
	public void testNameStartWithMajOk() throws Exception {
		Fusee fusee = new Fusee();
		fusee.setName("AaaaA");
		GenericNameTest.nameStartWithMajOk(fusee.getName());
	}

	/**
	 * testNameStartWithMajKo test function.
	 *
	 * @throws Exception to throw.
	 */
	@Test
	public void testNameStartWithMajKo() throws Exception {
		Fusee fusee = new Fusee();
		fusee.setName("aAAAa");
		GenericNameTest.nameStartWithMajOk(fusee.getName());
	}

	/**
	 * testNameStartWithMajNull test function.
	 */
	@Test
	public void testNameStartWithMajNull() {
		Fusee fusee = new Fusee();
		assertThrows(Exception.class, () -> {
			fusee.setName(null);
		});
	}

	/**
	 * testNameStartWithMajEmpty test function.
	 */
	@Test
	public void testNameStartWithMajEmpty() {
		Fusee fusee = new Fusee();
		assertThrows(Exception.class, () -> {
			fusee.setName("");
		});
	}

	/**
	 * testNameStartWithMajOneChar test function.
	 *
	 * @throws Exception to throw.
	 */
	@Test
	public void testNameStartWithMajOneChar() throws Exception {
		Fusee fusee = new Fusee();
		fusee.setName("a");
		GenericNameTest.nameStartWithMajOk(fusee.getName());
	}

	/**
	 * testNameStartWithMajOneCharWitha test function.
	 *
	 * @throws Exception to throw.
	 */
	@Test
	public void testNameStartWithMajOneCharWitha() throws Exception {
		Fusee fusee = new Fusee();
		fusee.setName("a");
		assertTrue(fusee.getName().equals("A"));
	}

	/**
	 * testNameStartWithMajOneCharWithA test function.
	 *
	 * @throws Exception to throw.
	 */
	@Test
	public void testNameStartWithMajOneCharWithA() throws Exception {
		Fusee fusee = new Fusee();
		fusee.setName("A");
		assertTrue(fusee.getName().equals("A"));
	}

	/**
	 * testNameStartWithMajOneCharWithabcdef test function.
	 *
	 * @throws Exception to throw.
	 */
	@Test
	public void testNameStartWithMajOneCharWithabcdef() throws Exception {
		Fusee fusee = new Fusee();
		fusee.setName("abcdef");
		assertTrue(fusee.getName().equals("Abcdef"));
	}

	/**
	 * testNameStartWithMajOneCharWithAbcdef test function.
	 *
	 * @throws Exception to throw.
	 */
	@Test
	public void testNameStartWithMajOneCharWithAbcdef() throws Exception {
		Fusee fusee = new Fusee();
		fusee.setName("Abcdef");
		assertTrue(fusee.getName().equals("Abcdef"));
	}

	/**
	 * testNameStartWithMajRandom test function.
	 *
	 * @throws Exception to throw
	 */
	@Test
	public void testNameStartWithMajRandom() throws Exception {
		Fusee fusee = new Fusee();
		fusee.setName(StringUtils.getRandomString());
		GenericNameTest.nameStartWithMajOk(fusee.getName());
	}
}
