import java.util.ArrayList;

/**
 * This class represents the solution for Hacker Rank challenge Diagonal Difference
 */
public class DiagonalDifference {


  /**
   * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
   *
   * @param arr - The Square Matrix - a 2D array of Integers
   * @return int - representing the absolute difference between the sum of its diagonals
   */
  public int diagonalDifference(int[][] arr) {
    ArrayList<Integer> diag1 = new ArrayList<>();
    ArrayList<Integer> diag2 = new ArrayList<>();

    int sum1 = 0;
    int sum2 = 0;


    for (int r = 0; r < arr.length; r++) {

      diag1.add(arr[r][r]);
      diag2.add(arr[r][(arr.length - 1) - r]);

      sum1 = arr[r][r] + sum1;
      sum2 = arr[r][(arr.length - 1) - r] + sum2;


    }

    return Math.abs(sum1 - sum2);


  }


  public static void main(String[] args) {

    DiagonalDifference d = new DiagonalDifference();
    int b = d.diagonalDifference(new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}});

    System.out.println(b);


  }


}
