import java.util.*;
public class Overload {
   public static void main(String [] args){
      Scanner input=new Scanner(System.in);
      System.out.println("Enter you choice: ");
      System.out.println("1-Area of rectangle");
      System.out.println("2-Area of square");
      int num=input.nextInt();
   
      switch(num)
      {
         case 1:
            System.out.println("Enter len and wid: ");
            double len=input.nextDouble();
            double wid=input.nextDouble();
            double ar=Area(len,wid);
            System.out.println("Area= "+ar);
            break;
      
         case 2:
            System.out.println("Enter side: ");
            double side=input.nextDouble();
            double ar2=Area(side);
            System.out.println("Area= "+ar2);
            break;
      
         default:
            System.out.println("Not found");
            break;
      }
   }
   
   public static double Area(double x, double y)
   {
      return x*y;
   }
   public static double Area(double x)
   {
      return x*x;
   }

}
