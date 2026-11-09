public class FlowerShop {
public static void main(String [] args)
{
Flower tulip=new Flower();

tulip.color="white";
tulip.amount=80;
tulip.setPrice(20.75);

double total=tulip.getOrderCost(15, 70.0);
System.out.println("total cost= "+total);



}
}