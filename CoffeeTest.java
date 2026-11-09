import static java.lang.Character.*;
import java.util.*;
public class CoffeeTest {
static Scanner read=new Scanner(System.in);
public static void main(String [] args) {
Coffee c1=new Coffee("Espresso", 8, 80);
Coffee c2=new Coffee("Latte", 12, 120);
System.out.println("Enter a size (S / M / L): ");
char size=read.next().charAt(0);
size=toUpperCase(size); //I wrote the package so no need to write Char...
System.out.println(c2.getDescription(size));
c1.predictPrice(5,0.1);

double tPrice=35;
System.out.println("You need "+c1.cupsToTarget(tPrice)+" espresso cups to reach "+tPrice+"SR\n");

System.out.println("The number of Coffee is "+Coffee.nOfC);

}
}