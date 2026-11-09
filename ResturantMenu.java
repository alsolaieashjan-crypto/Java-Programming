import java.util.Scanner;
public class ResturantMenu
{
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);
int num;
int sum=0;

do
{
System.out.println("Select your choice: ");
System.out.println("1.Pizza for 30SR ");
System.out.println("2.Coffee for 15SR ");
System.out.println("3.Juice for 10SR ");
System.out.println("4.Exit ");
num=input.nextInt();

switch(num)
{
case 1:
sum+=30;
break;

case 2:
sum+=15;
break;

case 3:
sum+=10;
break;
}
}
while(num!=4);
System.out.println("Total Bill= "+sum);











}
}