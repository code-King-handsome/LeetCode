package com.medium;

import java.util.LinkedList;
import java.util.Queue;

public class PokerShuffle {

  public int[] shuffle(int[] numbers) {
    Queue<Integer> queue = new LinkedList<>();
    int len = numbers.length;
    int[] result = new int[len];
    if (len % 2 == 1){
      result[len - 1] = numbers[0];
    }
    for (int i = 0; i < (len - 1) / 2; i++) {
      queue.element();
    }
    return null;
  }

  public static void main(String[] args) {
    int[] target = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    int[] result = new PokerShuffle().shuffle(target);
    for (int tmp: result){
      System.out.print(tmp + " ");
    }
  }

}
