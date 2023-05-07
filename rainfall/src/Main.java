public class Main {
  
    public static double rainfall(double[] readings) {
      
      double valid_nums = 0;
      double readings_sum = 0;

      for (int i = 0; i < readings.length; i++) {
        if (readings[i] >= 0) {
          valid_nums++;
          readings_sum += readings[i];
        }
      }
      return readings_sum / valid_nums;
    }
    
    public static void main(String[] args) {
      double[] readings = { 84, 73.5, 22.1, 0.0, 11.1, -5.2, 4.8, -19.4, 33.1, 0.0, 15.3, 22.1};
      System.out.println(rainfall(readings));
    }
  }