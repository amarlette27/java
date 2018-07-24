public class cat {
   public static void main (String args[]) {
      System.out.println("Hello World");
      double d = 4.5;
      int i = 1;
      float f = 2.1f;
      boolean b = true;
      long l = 5l;
      int a = 4;
      int result = a == 4 ? 1 : 8;
    String s1 = new String("nums: " + d + " " + i + " " +  f + " " + b + " " + l
);
      System.out.println("==========here" + s1);
      System.out.print(5+6+"Seven");

      int [] arr;
      arr = new int[10];
      arr[0] = 1;
      arr[1] = 2;
      arr[1] = arr[0] + 1;
 
      int[]arr2 = {1,2,3};
      for (int j =0; j < 3; j++) 
      { 
        System.out.println("arr2: " + arr2[j]);
      }
      int[] arr3 = {2, 0, 1, 3};
      for (int el : arr3) {
          if (el > 1) {
             System.out.println("before break, el > 1: " + el);
             break;
          }
          System.out.println("after break, arr3: " + el);
      }

      System.out.println("arr[1]: " + arr[1]);
      System.out.println(arr.length);

      josh();
      }

      public static void josh() {
         System.out.println("josh");
      }
}
