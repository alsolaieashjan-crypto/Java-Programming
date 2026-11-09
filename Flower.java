public class Flower
{
public String color;
public int amount;
private double price;

public double getOrderCost(int a, double dcost)
{
double orderCost=0.0;
if(a<=amount)
{
orderCost=price*a+dcost;
amount=amount-a;
}
return orderCost;
}

public void setPrice(double p)
{
price=p;
}

public double getPrice()
{
return price;
}




}