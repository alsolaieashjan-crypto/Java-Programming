import java.util.Scanner;
public class JavaProgram
{
public static void main (String[]args)
{
Scanner read=new Scanner(System.in);
String time,s1,s2,s3;
int loc1,loc2;
System.out.println("Enter the time in this format HH:MM:SS>: ");
time=read.next();
loc1=time.indexOf(':');
loc2=time.indexOf(':',loc1+1);
s1=time.substring(0,loc1);
s2=time.substring(loc1+1,loc2);
s3=time.substring(loc2+1);
int hour=Integer.parseInt(s1);
int min=Integer.parseInt(s2);
int sec=Integer.parseInt(s3);
System.out.println("Hour is: "+hour);
System.out.println("Minutes are: "+min);
System.out.println("Seconds are: "+sec);

int total=sec+(min*60)+(hour*60*60);
System.out.println("Total time in seconds is: "+total);

}
}