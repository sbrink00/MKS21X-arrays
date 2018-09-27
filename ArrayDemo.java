public class ArrayDemo{
    public static void main(String[] args) {
        int[] ary1 = new int[]{1,2};
        int[] ary2 = new int[]{1, 56, 78, 54, 34, 5453545};
        int[][] ary3 = new int[][]{{1, 1, 1},{1, 1, 1}};
        int[][] ary4 = new int[][]{{1, 4, 76, 56},{54, 43}};
        int[][] ary5 = new int[][]{{1, 4, 76, 56},{54, 43}};
        int[][] ary6 = new int[][]{{0, 0, 0, 0},{0, 00}};
        int[][] ary7 = new int[][]{{9807, 0, 0, 66},{0, 00, 89}};
        int[][] ary8 = new int[][]{{9807, 0, 0, 66},{0, 00, 89}};
        int[][] ary9 = new int[][]{{54},{76},{98, 65, 45},{5, 65, 6, 4}};
        printArray(ary1);
        printArray(ary2);
        printArray(ary3);
        printArray(ary4);
        System.out.println(countZeros2D(ary5));
        System.out.println(countZeros2D(ary6));
        System.out.println(countZeros2D(ary7));
        fill2D(ary8);
        fill2D(ary9);
    }
    public static void printArray(int[] ary){
      String Final = "[";
      for (int idx = 0; idx < ary.length; idx ++){
        Final += ary[idx] + ", ";
      }
      System.out.println(Final.substring(0,Final.length() - 2) + "]");
    }

    public static void printArray(int[][] ary){
      String Final = "[[";
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

    public static int countZeros2D(int[][] nums){
      int total = 0;
      for (int idx = 0; idx < nums.length; idx ++){
        for (int idx2 = 0; idx2 < nums[idx].length; idx2 ++){
          if (nums[idx][idx2] == 0){
            total ++;
          }
        }
      }
      return total;
    }

    public static void fill2D(int[][] vals){
      for (int idx = 0; idx < vals.length; idx ++){
        for (int idx2 = 0; idx2 < vals[idx].length; idx2 ++){
          if (idx == idx2){
            vals[idx][idx2] = 3;
          }
          else{
            vals[idx][idx2] = 1;
          }
        }
      }
      String Final = "[[";
      for (int idx = 0; idx < vals.length; idx ++){
        for (int idx2 = 0; idx2 < vals[idx].length; idx2 ++){
          if (idx2 != vals[idx].length - 1){
            Final += vals[idx][idx2] + ", ";
          }
          else{
            Final += vals[idx][idx2] + "], [";
          }
        }
      }
      System.out.println(Final.substring(0,Final.length() - 3) + "]");
    }


}
