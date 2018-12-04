import java.util.ArrayList;

public class DiagonalDifference {


  public int diagonalDifference(int[][] arr) {
    ArrayList<Integer> diag1 = new ArrayList<Integer>();
    ArrayList<Integer> diag2 = new ArrayList<Integer>();

    int sum1 = 0;
    int sum2 = 0;


    for(int r = 0; r < arr.length; r++) {

      diag1.add(arr[r][r]);
      diag2.add(arr[r][(arr.length - 1) - r]);


    }

    
    for(int i = 0; i < diag1.size(); i++) {

      sum1 = diag1.get(i) + sum1;
      sum2 = diag2.get(i) + sum2;

    }

   return Math.abs(sum1 - sum2);


  }


  public static void main(String[] args)  {

    DiagonalDifference d = new DiagonalDifference();
    int b = d.diagonalDifference(new int[][]{{1, 2, 3}, {1,2,3}, {1,2,3}});

    System.out.println(b);



  }


}
