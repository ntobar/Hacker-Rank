import java.util.Arrays;

/**
 * A Class representing the solution for Hacker Rank challenge:  Grading Students.
 */
public class GradingStudents {


  /**
   * Hacker Rank challenge Grading Students.
   * "It should return an integer array consisting of rounded grades." - Hacker Rank.
   * @param grades - the grades before rounding
   * @return - an array of the rounded grades
   */
  static int[] gradingStudents(int[] grades) {

    int diff;


    for (int i = 0; i < grades.length; i++) {

      if (grades[i] > 37) {

        if (((5 - Integer.parseInt(Integer.toString(grades[i]).substring(1))) < 3)
              && ((5 > Integer.parseInt(Integer.toString(grades[i]).substring(1))))) {

          diff = (5 - Integer.parseInt(Integer.toString(grades[i]).substring(1)));

        } else if(((10 - Integer.parseInt(Integer.toString(grades[i]).substring(1))) < 3)
              && ((Integer.parseInt(Integer.toString(grades[i]).substring(1))) > 5)) {

          diff = (10 - Integer.parseInt(Integer.toString(grades[i]).substring(1)));



      } else {
          diff = 0;
        }

        grades[i] = grades[i] + diff;


      }

    }

    return grades;

  }


  public static void main(String[] args) {

    GradingStudents grades = new GradingStudents();

    int[] g = new int[] {73,67,38,33};

    int[] result = grades.gradingStudents(g);

    System.out.println(Arrays.toString(result));



  }
}
