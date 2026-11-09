import java.util.Scanner;
public class Test1
{
public static void main ( String[]args )
{
Scanner read=new Scanner(System.in);
int n1,n2;
char ch;
System.out.print("Enter your expression: ");
n1=read.nextInt();
ch=read.next().charAt(0);
n2=read.nextInt();

switch(ch)
{
   case '+':
      System.out.println("The result is: "+(n1+n2));
      break;
   case '-':
      System.out.println("The result is: "+(n1-n2));
      break;
   case '*':
      System.out.println("The result is: "+(n1*n2));
      break;
   case '/':
      System.out.println("The result is: "+(n1/n2));
      break;

}

}

}