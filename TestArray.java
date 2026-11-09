import java.util.Scanner;
public class TestArray {
public static void main(String [] args)
{
Scanner read=new Scanner(System.in);

//User input
System.out.print("Enter number, negative to stop: ");
int size=read.nextInt();

if(size>=0) 
{
// Everything in here only runs if 'size' is 0 or positive.
 // This includes creating the array, the loops, and printing.
int[] list=new int[size];

for(int i=0; i<size; i++)
list[i]=(int)(Math.random()*100);

System.out.println("List before modification: ");
for(int i=0; i<size; i++)
System.out.print(list[i]+" ");

System.out.println("");


for(int i=0; i<size; i++)
if(list[i]%2==0)
if(list[i]%10==0 || list[i]%3==0)
list[i]=-1;

System.out.println("List after modification: ");
for(int i=0; i<size; i++)
System.out.print(list[i]+" ");

System.out.println("");

} // This only runs if 'size' is negative.
else
System.out.println("End of program");


}
}