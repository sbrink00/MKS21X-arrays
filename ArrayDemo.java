public class ArrayDemo{
    public static void main(String[] args) {
        int[] ary1 = new int[]{1,2};
        int[] ary2 = new int[]{1, 56, 78, 54, 34, 5453545};
        int[][] ary3 = new int[][]{{1, 1, 1},{1, 1, 1}};
        int[][] ary4 = new int[][]{{1, 4, 76, 56},{54, 43}};
        printArray(ary1);
        printArray(ary2);
        printArray(ary3);
        printArray(ary4);
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


}
