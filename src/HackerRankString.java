import java.util.HashMap;


//Not working
public class HackerRankString {


  // Complete the hackerrankInString function below.
  public String hackerrankInString(String s) {

    String result = "NO";
    int nR = 0;

    String hackerrank = "ackerrank";

    if (s.charAt(0) != 'h') {
      return result;
    } else {


      for (int i = 1; i < s.length(); i++) {


        if ((hackerrank.length() == 1) && (s.contains("k"))) {
          result = "YES";
          break;
        } else if ((hackerrank.length() == 1) && !(hackerrank.equals(s.charAt(i)))) {
          result = "NO";
          break;
        }

        if (s.charAt(i) == 'r') {
          nR = nR + 1;
        }

        if ((i < s.length() - 1) && (s.charAt(i) == s.charAt(i + 1)) && (s.charAt(i) != 'r') && nR > 2
                || s.charAt(i) != hackerrank.charAt(0)) {
          s = s.substring(i + 1);
          //i++;
        } else if (s.charAt(i) == hackerrank.charAt(0)) {
          hackerrank = hackerrank.substring(1);

          //i++;
        } else {

          result = "NO";
        }
      }
    }


    return result;


  }


  public static void main(String[] args) {

    HackerRankString hr = new HackerRankString();
    String n = hr.hackerrankInString("hackerrank");
    String aa = "a";

    //System.out.println(aa.substring(1));

    System.out.println(n);


  }


}
