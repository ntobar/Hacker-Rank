
public class HurdleRace {

  public int hurdleRace(int k, int[] height) {

    int max = 0;

    if (height.length > 1) {

      for (int i = 0; i < height.length - 1; i++) {


        //System.out.println(height[i]);

        if (max > height[i + 1]) {
          break;

        } else if (height[i + 1] > max) {
          max = height[i + 1];
        }


      }

      if (k >= max) {
        return 0;
      } else {
        return Math.abs(k - max);
      }

    } else {
      if (k >= height[0]) {
        return 0;
      } else {
        return Math.abs(k - height[0]);
      }
    }


  }

  public static void main(String[] args) {

    HurdleRace a = new HurdleRace();
    int[] cd = new int[]{0, 2, 3, 0};
    int b = a.hurdleRace(1, cd);
    System.out.println(b);


  }

}



