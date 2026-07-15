package Day 19;

public // Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class QuickSortDescending {
   public QuickSortDescending() {
   }

   static int partition(int[] var0, int var1, int var2) {
      int var3 = var0[var2];
      int var4 = var1 - 1;

      for(int var5 = var1; var5 < var2; ++var5) {
         if (var0[var5] > var3) {
            ++var4;
            int var6 = var0[var4];
            var0[var4] = var0[var5];
            var0[var5] = var6;
         }
      }

      int var7 = var0[var4 + 1];
      var0[var4 + 1] = var0[var2];
      var0[var2] = var7;
      return var4 + 1;
   }

   static void quickSort(int[] var0, int var1, int var2) {
      if (var1 < var2) {
         int var3 = partition(var0, var1, var2);
         quickSort(var0, var1, var3 - 1);
         quickSort(var0, var3 + 1, var2);
      }

   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{10, 7, 8, 9, 1, 5};
      quickSort(var1, 0, var1.length - 1);
      System.out.println("Descending Order:");

      for(int var2 = 0; var2 < var1.length; ++var2) {
         System.out.print(var1[var2] + " ");
      }

   }
}
 {
    
}
