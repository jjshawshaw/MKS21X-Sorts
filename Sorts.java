public class Sorts{
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

  public static void main(String[]args){
    int[] a = {1, 7, 9, 4, 110, 2};
    for (int i = 0; i < a.length; i++){
      System.out.print(a[i] + " ");
    }
    System.out.println();
    selectionSort(a);
    for (int i = 0; i < a.length; i++){
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }
}
