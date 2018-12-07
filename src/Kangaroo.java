import java.util.ArrayList;

public class Kangaroo {


  /**
   *
   * @param s - house start point
   * @param t - house end point
   * @param a - where apple tree is
   * @param b - where orange tree is
   * @param m - number of apples that fell from the tree
   * @param ad - distance each apple fell from its tree
   * @param n - number of oranges that fell from the tree
   * @param an - distance each orange fell from its tree
   * @return
   */
  public int[] kangaroo(int s, int t, int a, int b, int m, int[] ad, int n, int[] an) {

    int distAppleToHouse = s - a;
    int distHouseToOrange = b - t;

    ArrayList<Integer> apples = new ArrayList<>();
    ArrayList<Integer> oranges = new ArrayList<>();


    for(int i = 0; i < m; i++) {

      if(ad[i] >= 0) {


        if((ad[i] >= s) && (ad[i] <= t)) {
          apples.add(ad[i]);
        }
      }
    }

    for(int f = 0; f < n; f++) {
      if(an[f] < 0) {

        if(b + ad[f] <= t) && (b + ad[f] >= s) {

        if((an[f] <= t) && (an[f] >= s)) {
          oranges.add(an[f]);
        }
      }



    }

    return new int[]{apples.size(), oranges.size()};

  }



  public static void main(String[] args) {

    Kangaroo k = new Kangaroo();

    int[] a = k.kangaroo(7,11, 5,15, 3, new int[]{-2, 2, 1}, 2, new int[]{5, -6});

    System.out.println(a);

  }

}
