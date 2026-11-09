import java.util.Scanner;
public class Sheet2
{
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);
System.out.print("Enter three numbers seperate by a hyphen: ");
String str=input.next();
int loc1=str.indexOf('-');
int loc2=str.indexOf('-',loc1+1);

String n1,n2,n3;
n1=str.substring(0,loc1);
n2=str.substring(loc1+1,loc2);
n3=str.substring(loc2+1);

int s1=Integer.parseInt(n1);
int s2=Integer.parseInt(n2);
int s3=Integer.parseInt(n3);

if(s1==(s2-1)&&s2==(s3-1))
System.out.println("Consecutive");
else
System.out.println("Not consecutive");


}
}