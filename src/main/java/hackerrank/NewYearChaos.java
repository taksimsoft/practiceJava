package hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NewYearChaos {

  // Complete the minimumBribes function below.
  static void minimumBribes(int[] q) {

    List<Integer> integerList = Arrays.stream(q).sorted().boxed().collect(Collectors.toList());

    int bribe = 0;
    int indexList = 0;
    int realIndex = 0;
    int personCount = 0;
    for (int listItem : integerList) {

      for (int j = 0; j < q.length; j++) {
        if (listItem == q[j]) {
          realIndex = j;
          break;
        }
      }
      if (realIndex < indexList) {
        personCount++;
        bribe += Math.abs(indexList - realIndex);
      }
      indexList++;
    }

    if (bribe > 0) {
      System.out.println(bribe);
    }
    if (personCount > 1) {
      System.out.println("Too chaotic");
    }
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int t = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int tItr = 0; tItr < t; tItr++) {
      int n = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      int[] q = new int[n];

      String[] qItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int i = 0; i < n; i++) {
        int qItem = Integer.parseInt(qItems[i]);
        q[i] = qItem;
      }

      minimumBribes(q);
    }

    scanner.close();
  }
}
