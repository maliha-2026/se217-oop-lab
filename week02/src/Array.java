public class Array {
   public Array() {
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{10, 20, 30};
      int var2 = var1[0] + var1[2];
      System.out.println("value of x is : " + var2);
      var1[2] = 100;
      var2 = var1[0] + var1[2];
      System.out.println("value of x is: " + var2);
   }
}