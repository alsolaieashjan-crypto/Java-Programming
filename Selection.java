import java.util.Scanner;
public class Selection
{
public static void main(String[]args)
{
Scanner read=new Scanner(System.in);
System.out.print("Enter your membership: ");
String str=read.next();
System.out.print("Enter original price: ");
double price=read.nextDouble();
int loc=str.indexOf('_');
if(loc==-1)
System.out.println("Invalid membership");
else
{
char st=str.charAt(0);
char pr=str.charAt(loc+1);
double discount=0;
if(st=='D' && pr=='F')
{
discount=30;
}
else
if(st=='D' && pr=='S')
{
discount=40;
}
else
if(st=='G' && pr=='F')
{
discount=25;
}
else
if(st=='G' && pr=='S')
{
discount=35;
}
else
{
System.out.println("Invalid input");
}
if(discount!=0)
{
double newprice=price-(price*discount/100);
System.out.printf("%-25s %n","BILL");
System.out.printf("%-25s %n","**********");
System.out.printf("%-25s %-15c %n","Status: ",st);
System.out.printf("%-25s %-15c %n","Profession: ",pr);
System.out.printf("%-25s %-15.2f SR %n","Original Price: ",price);
System.out.printf("%-25s %-15.2f SR %n","Discount Price: ",newprice);
System.out.printf("%-25s %n","**********");
}

}
}

}