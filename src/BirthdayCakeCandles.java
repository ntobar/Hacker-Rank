/**
 * This class represents the solution for Hacker Rank challenge Birthday Cake Candles.
 */
public class BirthdayCakeCandles {

  /**
   * "Your task is to find out how many candles she can successfully blow out." - Hacker Rank
   *
   * @param ar - represents the candles in a birthday cake
   * @return the number of candles the person can blow out
   */
  public int birthdayCakeCandles(int[] ar) {

    int max = 0;
    int result = 0;

    for (int i = 0; i < ar.length; i++) {

      if (ar[i] > max) {
        max = ar[i];
      }

    }

    for (Integer a : ar) {
      if (a == max) {
        result++;
      }
    }


    return result;
  }


  public static void main(String[] args) {

    BirthdayCakeCandles candles = new BirthdayCakeCandles();

    int[] c = new int[]{1, 2, 5, 5, 3};

    System.out.println(candles.birthdayCakeCandles(c));


  }

}
