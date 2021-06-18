package com.redbee.academy.challenge;

import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    List<Integer>max;
    for(Integer i=0; i<=a || i<=b; i++){
      if(b.get(i) > a.get(i))
      {
        max[i]=b.get(i);
      } else {
        max[i]=a.get(i);
      }
    }
    return max;
  }



}
