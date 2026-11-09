import java.util.Scanner;
public class ParcelTest {
public static void main(String [] args)
{
Scanner read=new Scanner(System.in);
Parcel p1=new Parcel("456", 1.7, 'S');
Parcel p2=new Parcel("254", 2.6, 'E');

System.out.println("Enter your city: ");
String usercity=read.next();
System.out.println("The shipping days are: "+p1.getShippingDays(usercity));
System.out.printf("The shipping fee for p2 is: %.2f SR %n", p2.CalculateFee(10.0));
System.out.println("Total parcels: "+Parcel.totalParcels);

}
}