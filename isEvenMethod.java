import java.util.Scanner;
public class isEvenMethod
{
   static int num;
   static Scanner input=new Scanner(System.in);
   public static void main(String [] args)
   {
      System.out.println("Enter a number: ");
      num=input.nextInt();
   
      if(isEven())
         System.out.println("The number is even");
      else
         System.out.println("The number is odd");
   }
   public static boolean isEven()
   {
      if(num%2==0)
         return true;
      else
         return false;
   }
}