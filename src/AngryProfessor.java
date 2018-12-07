/**
 * A Class representing the solution for Hacker Rank challenge:  Angry Professor.
 */
public class AngryProfessor {


  /**
   * "Given the arrival time of each student and a threshhold number of attendees, determine if the
   * class is canceled." - Hacker Rank
   *
   * @param k - The threshold number of students
   * @param a - An array of integers representing arrival times
   * @return String - representing if Class is cancelled or not
   */
  public String angryProfessor(int k, int[] a) {

    String result = "YES";

    int onTime = 0;

    for (Integer i : a) {

      if (i <= 0) {

        onTime++;

      }
    }

    if (onTime >= k) {
      result = "NO";
    }

    return result;


  }


  public static void main(String[] args) {

    int k = 2;
    int[] a = new int[]{-1, -1, 2, 3, 4};

    AngryProfessor ap = new AngryProfessor();

    String result = ap.angryProfessor(k, a);

    System.out.println(result);


  }


}
