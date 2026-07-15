package Day 18;

public // Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class BubbleSortDescending {
   public BubbleSortDescending() {
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{5, 1, 4, 2, 8};

      for(int var3 = 0; var3 < var1.length - 1; ++var3) {
         for(int var4 = 0; var4 < var1.length - var3 - 1; ++var4) {
            if (var1[var4] < var1[var4 + 1]) {
               int var2 = var1[var4];
               var1[var4] = var1[var4 + 1];
               var1[var4 + 1] = var2;
            }
         }
      }

      System.out.println("Descending Order:");

      for(int var5 = 0; var5 < var1.length; ++var5) {
         System.out.print(var1[var5] + " ");
      }

   }
}
 {
    
}
