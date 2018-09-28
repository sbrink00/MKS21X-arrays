public class ArrayDemo{
    public static void main(String[] args) { //The main is where I'm running
        int[] ary1 = new int[]{1,2};         //all of the functions.
        int[] ary2 = new int[]{1, 56, 78, 54, 34, 5453545};
        int[][] ary3 = new int[][]{{1, 1, 1},{1, 1, 1}};
        int[][] ary4 = new int[][]{{1, 4, 76, 56},{54, 43}};
        int[][] ary5 = new int[][]{{1, 4, 76, 56},{54, 43}};
        int[][] ary6 = new int[][]{{0, 0, 0, 0},{0, 00}};
        int[][] ary7 = new int[][]{{9807, 0, 0, 66},{0, 00, 89}};
        int[][] ary8 = new int[][]{{9807, 0, 0, 66},{0, 00, 89}};
        int[][] ary9 = new int[][]{{54},{76},{98, 65, 45},{5, 65, 6, 4}};
        int[][] ary10 = new int[][]{{-4, -6, -9},{9, 6, -98}, {4, -23}};
        int[][] ary11 = new int[][]{{-9, -6, -4, -6, -3, 3}};
        int[][] ary12 = new int[][]{{0},{0, 0},{0, 0, 0, 0, 0}};
        printArray(ary1);
        printArray(ary2);
        printArray(ary3);
        printArray(ary4);
        System.out.println(countZeros2D(ary5));
        System.out.println(countZeros2D(ary6));
        System.out.println(countZeros2D(ary7));
        fill2D(ary8);
        fill2D(ary9);
        printArray(fill2DCopy(ary10));
        printArray(fill2DCopy(ary11));
        printArray(fill2DCopy(ary12));
    }
    public static void printArray(int[] ary){ //Oa: this function prints a
      String Final = "[";                     //1d array
      for (int idx = 0; idx < ary.length; idx ++){
        Final += ary[idx] + ", ";
      }
      System.out.println(Final.substring(0,Final.length() - 2) + "]");
    }

    public static void printArray(int[][] ary){ //0b: this function prints a
      String Final = "[[";                      //2d array
      for (int idx = 0; idx < ary.length; idx ++){
        for (int idx2 = 0; idx2 < ary[idx].length; idx2 ++){
          if (idx2 != ary[idx].length - 1){
            Final += ary[idx][idx2] + ", ";
          }
          else{
            Final += ary[idx][idx2] + "], [";
          }
        }
      }
      System.out.println(Final.substring(0,Final.length() - 3) + "]");
    }

    public static int countZeros2D(int[][] nums){ //1a: This function returns
      int total = 0;                              //how many zeroes there are
      for (int idx = 0; idx < nums.length; idx ++){//in a given 2d array
        for (int idx2 = 0; idx2 < nums[idx].length; idx2 ++){
          if (nums[idx][idx2] == 0){
            total ++;
          }
        }
      }
      return total;
    }

    public static void fill2D(int[][] vals){ //2a: This function returns a
      for (int idx = 0; idx < vals.length; idx ++){//given 2d array with
        for (int idx2 = 0; idx2 < vals[idx].length; idx2 ++){//every value
          if (idx == idx2){                 //value replaced with 1, except
            vals[idx][idx2] = 3;            //those that are represented
          }                                 //by rows and columns that
          else{                             //have the same number. Those
            vals[idx][idx2] = 1;            //values are replaced by 3s.
          }
        }
      }
      printArray(vals);
    }

    public static int[][] fill2DCopy(int[][] vals){ //2b: This function returns
      int[][] Final = new int[vals.length][];       //a copy of the given
      for (int idx = 0; idx < vals.length; idx ++){ //array except negative
        Final[idx] = vals[idx];                     //values are replaced by 3
      }                                             //and positive ones are
      for (int idx = 0; idx < vals.length; idx ++){//replaed by 1
        for (int idx2 = 0; idx2 < vals[idx].length; idx2 ++){
          if (vals[idx][idx2] < 0){
            Final[idx][idx2] = 3;
          }
          else{
            Final[idx][idx2] = 1;
          }
        }
      }
      return Final;
    }
}
