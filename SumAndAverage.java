public class SumAndAverage {
    public static void main(String[] args) {
      
      int a[] = {4,6,2,8,10};
      int sum = 0;
      int avg;
      
       for (int i = 1; i < a.length; i++) 
       {
        sum= 0 +a[i];
       }
        avg = (sum/a.length);
      System.out.println("answer is" + avg);
    }
  }