import java.util.Scanner;
public class FirstProgram 
{
public static void main(String[]args) 
{
Scanner read=new Scanner(System.in);
String Str,name,num,str_year;
int loc;
System.out.println("Enter your name and KSU student ID");
Str=read.nextLine();
loc=Str.indexOf(' ');
name=Str.substring(0,loc);
num=Str.substring(loc+1);
name=name.substring(0,1).toUpperCase()+name.substring(1);
str_year=num.substring(0,3);
int y=Integer.parseInt(str_year);
y=y+1000;
String email=num+"@student.ksu.edu.sa";
System.out.println("your name: "+name);
System.out.println("you enrolled in the university in: "+y+"H.");
System.out.println("you have been studying here for: "+(1447-y)+"years");
System.out.println("your KSU email: "+email);






}


}