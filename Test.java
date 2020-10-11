class Test {
private static int global = 1;

   public static int multiply(int a, int b) {
      return a * b;
   }

   public static int third_index(int[] arr) {
      return arr[2];
   }
   
   public static void side_effect() {
      global = 1;
      System.out.println("Hello World!");
   }
   
   public static void main(String[]args) {
      int array[] = {1,2,3};
      multiply(array[0],third_index(array));
      side_effect();
   }
}