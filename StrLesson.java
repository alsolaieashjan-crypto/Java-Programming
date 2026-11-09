import java.util.Scanner;
public class StrLesson
{
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the time in this format HH:MM> ");
String str=input.next();
String hour, min;
int loc1=str.indexOf(':');
hour=str.substring(0,loc1);
min=str.substring(loc1+1);
int x=Integer.parseInt(min);
int y=Integer.parseInt(hour);
System.out.println("Hours are: "+hour);
System.out.println("Minutes are: "+min);
int total_minutes=x+(y*60);
System.out.println("Total time in minutes: "+total_minutes);











}
}