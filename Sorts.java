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

  public static void main(String[]args){
    int[] a = new int[Integer.parseInt(args[0])];
    for (int i = 0; i < Integer.parseInt(args[0]); i++){
      a[i] = (int)(java.lang.Math.random() * 1000);
      System.out.print(a[i] + " ");
    }
    System.out.println();
    if (args[1].equals("sel")) selectionSort(a);
    if (args[1].equals("bub")) bubbleSort(a);
    for (int i = 0; i < a.length; i++){
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }
}
