/**
 * A Class representing the solution for Hacker Rank challenge:  Bon Apetit.
 */
public class BonApetit {


  /**
   * "If the bill is fairly split, print Bon Appetit ;
   * otherwise, print the amount of money that Brian must refund to Anna." - Hacker Rank
   * @param n - The total number of items ordered
   * @param k - the Kth item that Anna refuses to eat (index)
   * @param c - an Array of the costs of each item
   * @param b - amount of money that Brian charged Anna for her share of the bill.
   * @return
   */
  public String bonApetit(int n, int k, int[] c, int b) {

    String result = "Bon Appetit";


    int[] annPrices = new int[]{};

    int annesCharge = 0;


    for(int i = 0; i < c.length; i++) {

      if(i != k) {
        annesCharge = annesCharge + c[i];
      }

    }

    annesCharge = (annesCharge / 2);

    if(annesCharge != b) {

      result = Integer.toString(annesCharge - (b - annesCharge));

    }

    return result;

  }



  public static void main(String[] args) {

    BonApetit bon = new BonApetit();
    int[] costs = new int[]{3, 10, 2, 9};

    System.out.println(bon.bonApetit(4,1,costs,7));



  }


}
