package com.tactfactory.tp2tdd.utils;

import java.util.Random;

public class StringUtils {

  /**
   * Generate random string.
   *
   * @return compiled string.
   */
  public static String getRandomString() {
    Random rand = new Random();
    StringBuilder result = new StringBuilder();

    int loop = rand.nextInt(20) + 1;
    for (int i = 0; i < loop; i++) {
      result.append(Character.toString((char) (rand.nextInt(126 - 32) + 32)));
    }
    
    System.out.println(result);

    return result.toString();
  }
}
