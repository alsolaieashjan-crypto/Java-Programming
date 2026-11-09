import java.util.Scanner;
public class mathrandom
{
static int num;
static Scanner input=new Scanner(System.in);
public static void main(String[]args)
{
System.out.println("Enter a nmuber: ");
num=input.nextInt();

if( isEven() )
System.out.println("Number is even");
else
System.out.println("Number is odd");
}


public static boolean isEven()
{
if(num%2==0)
return true;
else
return false;
}

}