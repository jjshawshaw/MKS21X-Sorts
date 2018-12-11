public class Sorts{
  /**Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int [] ary) {
    for (int i = 0; i < ary.length; i++){
      int min = ary[i];
      int minIndex = i;
      for (int x = i; x < ary.length; x++){
        if (ary[x] < min){
          min = ary[x];
          minIndex = x;
        }
      }
      ary[minIndex] = ary[i];
      ary[i] = min;
    }
  }

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int [] ary) {
    boolean isSorted = false;
    while(!isSorted){
      boolean loopSort = true;
      for (int i = 0; i < ary.length - 1; i++){
        if (ary[i] > ary[i + 1]) {
        loopSort = false;
        int temp = ary[i + 1];
        ary[i + 1] = ary[i];
        ary[i] = temp;
        }
      }
      isSorted = loopSort;
    }
  }

  public static void insertionSort(int[] ary){
    for (int i = 1; i < ary.length; i++){
      // System.out.print(i + ": ");
      // for (int y = 0; y < ary.length; y++){
      //   System.out.print(ary[y] + " ");
      // }
      // System.out.println();
      boolean inserted = false;
      int temp = ary[i];
      if (ary[i - 1] > ary[i]){
        int x = i - 1;
        while (x > 0 && ary[x - 1] > temp){
          //System.out.println("\t " + x + ": " + ary[x])
        ary[x + 1] = ary[x];
        x--;
        }
        ary[x + 1] = ary[x];
        ary[x] = temp;
      }
    }
  }
}
