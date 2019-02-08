import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int numFrosh = 0;
    while ((numFrosh = in.nextInt()) != 0) {
      TreeMap <String, Integer> m = new TreeMap<>();
      for (int i = 0; i < numFrosh; i++) {
        ArrayList<Integer> courseCombination = new ArrayList<>();
        for (int c = 0; c < 5; c++) 
        {
          courseCombination.add(in.nextInt());
        }
        Collections.sort(courseCombination);
        String uniqueKey = arrayListToString(courseCombination);
        if (m.containsKey(uniqueKey)) {
          m.put(uniqueKey, m.get(uniqueKey) + 1);
        }
        else {
          m.put(uniqueKey, 1);
        }
      }
      int mostPopularValue = 0;
      for (int x : m.values()) {
        mostPopularValue = Math.max(mostPopularValue, x);
      }
      int countFrosh = 0;
      for (int x : m.values()) {
        if (x == mostPopularValue) {
          countFrosh += x;
        }
      }
      System.out.println(countFrosh);
    }
  }
  public static String arrayListToString(ArrayList<Integer> list) {
    StringBuilder sb = new StringBuilder();
    for (Integer s : list) {
      sb.append(s);
    }
    return sb.toString();
  }

}

