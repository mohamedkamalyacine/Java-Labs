package quadraticequation;

import static java.lang.Math.*;

public class QuadraticEquation {
   static void calcRoots(int a, int b, int c){
       if(a == 0)
       {
           System.out.println("a cannot equal to 0");
           return;
       }
       
       int d = (b*b) - (4 * a * c);
       double sqrtVal = sqrt(abs(d));
       
       if(d > 0)
       {
           System.out.println("The equation roots are real and different");
           System.out.println("");
           double x1 = (-(double)b + sqrtVal) / (2 * a);
           double x2 = (-(double)b - sqrtVal) / (2 * a);
           System.out.println("X1 = " + x1);
           System.out.println("X2 = " + x2);
       }
       else if(d==0)
       {
           System.out.println("The equation roots are real and same");
           double x1 = (-(double)b + sqrtVal) / (2 * a);
           double x2 = (-(double)b - sqrtVal) / (2 * a);
           System.out.println("X1 = " + x1);
           System.out.println("X2 = " + x2);
       }
       else
       {
           System.out.println("The equation roots are complex");
           double x1 = (-(double)b) / (2*a);
           double x2 = ((double)b) / (2*a);
           System.out.println("X1 = " + x1 + " i" + sqrtVal);
           System.out.println("X1 = " + x1 + " i" + sqrtVal);
       }
   }
}
