package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q56 {
  public int[][] merge(int[][] intervals) {
    if (intervals.length == 0) {
      return intervals;
    }
    List<int[]> result = new ArrayList<>();
    result.add(intervals[0]);
    int leftSectionLow, leftSectionHigh, rightSectionLow, rightSectionHigh;
    for (int i = 1; i < intervals.length; i++) {
      boolean included = false;
      for (int j = 0; j < result.size(); j++) {
        // sort
        if(intervals[i][0] <= result.get(j)[0]) {
          leftSectionLow = intervals[i][0];
          leftSectionHigh = intervals[i][1];
          rightSectionLow = result.get(j)[0];
          rightSectionHigh = result.get(j)[1];
        } else {
          rightSectionLow = intervals[i][0];
          rightSectionHigh = intervals[i][1];
          leftSectionLow = result.get(j)[0];
          leftSectionHigh = result.get(j)[1];
        }
        if (leftSectionHigh >= rightSectionLow) {
          result.get(j)[0] = leftSectionLow;
          result.get(j)[1] = Math.max(leftSectionHigh, rightSectionHigh);
          included = true;
        }
      }
      if (!included){
        result.add(intervals[i]);
      }
    }
    result = new ArrayList<>(result.stream().collect(Collectors.toMap(array -> array[0], array -> array, (p, q) -> p)).values());
    int[][] res = new int[result.size()][];
    return result.toArray(res);
  }

  public int[][] merge1(int[][] intervals) {
    if (intervals.length == 0) {
      return intervals;
    }
    List<int[]> sortedIntervals = Arrays.stream(intervals).sorted(Comparator.comparingInt(a -> a[0])).collect(Collectors.toList());
    List<int[]> merged = new ArrayList<>();
    merged.add(sortedIntervals.get(0));
    int[] mergeEle, intervalEle;
    for (int i = 1; i < sortedIntervals.size(); i++) {
        int j = merged.size() -1;
        mergeEle = merged.get(j);
        intervalEle = sortedIntervals.get(i);
        if (mergeEle[1] >= intervalEle[0] && mergeEle[1] < intervalEle[1]) {
          mergeEle[1] = intervalEle[1];
        } else if (mergeEle[1] < intervalEle[1]){
          merged.add(intervalEle);
        }
    }
    int[][] res = new int[merged.size()][];
    return merged.toArray(res);
  }


  public static void main(String[] args) {
    int[][] input = {{2,3},{4,5},{6,7},{8,9},{1,10}};
    int[][] res = new Q56().merge1(input);
    for (int i = 0; i < res.length; i++) {
      if (res[i].length>0){
        System.out.println( res[i][0] + "  " + res[i][1]);
      }
    }
  }
}
