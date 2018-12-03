/**
 * This class represents the Time Conversion Challenge from Hacker Rank.
 */
public class TimeConversion {


  /**
   * Hacker Rank Time Conversion challenge.
   * "Given a 12-hour AM/PM format, convert it to military (24-hour) time" - from Hacker Rank.
   * @param s - the given 12-hour time as a String
   * @return String representing the converted time in 24-hour format
   */
  public String timeConversion(String s) {
    /*
     * Write your code here.
     */

    //The new hour in 24-hour format
    int newHours;

    String result;

    String sHour = s.substring(0,2);


    int hours =  Integer.parseInt(sHour);

    if(s.substring(8,10).equals("AM") && hours == 12) {

      newHours = 00;

    } else if(s.substring(8,10).equals("AM") && hours < 12) {
      newHours = hours;

    } else  if(s.substring(8,10).equals("PM") && hours == 12) {

      newHours = 12;


    }else  {
      newHours = hours + 12;

    }



    
    if(s.substring(8,10).equals("AM") && ((hours < 10) || (hours == 12))) {

      result = "0" + newHours + s.substring(2,8);



    } else

      result = newHours + s.substring(2,8);


    return result;


  }


  public static void main(String[] args) {




    String am = "12:05:39AM";
    TimeConversion t = new TimeConversion();



    System.out.println(t.timeConversion(am));




  }
}
