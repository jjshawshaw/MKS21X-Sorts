public class sorts{
  public static void selectionsort(int [] ary) {
    for (int i = 0; i < ary.length; i++){
      int min = ary[i];
      int minIndex = i;
      for (int x = i; x < ary.length; x++){
        if (ary[x] < ary[i]){
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
    System.out.println(a);
    selectionsort(a);
    for (int i = 0; i < a.length; i++){
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }
}
