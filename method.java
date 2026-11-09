import static java.lang.Character.*;
import java.util.*;
public class method {
static Scanner read=new Scanner(System.in);
   public static void main(String [] args)
   {
   
   System.out.println("Enter character: ");
   char ch=read.next().charAt(0);
   ch= toLowerCase(ch);
   if(isVowel(ch))
   System.out.println("your char is vowel");
   else
   System.out.println("you char is not vowel");
   
   
    }
   
   public static boolean isVowel(char ch)
   {
   if(ch=='a' || ch=='u' || ch=='e' || ch=='i' || ch=='o')
   return true;
   return false;
   }

}