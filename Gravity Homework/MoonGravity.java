import java.util.Scanner;

   public class MoonGravity {
      public static void main(String[] args){
      
      Scanner scnr = new Scanner(System.in);
      
      double G      = 6.673e-11;
      double M      = 7.34767e22;
      double accelGravity = 0.0;
      System.out.println("Enter your distance from Moon's centre (km):"); 
      double distCenter = scnr.nextDouble();
      accelGravity = (G * M) / (distCenter * distCenter);
      System.out.print("Acceleration of gravity from your location is ");
      System.out.println(accelGravity + " m/s/s");
      
      return;
   }
}