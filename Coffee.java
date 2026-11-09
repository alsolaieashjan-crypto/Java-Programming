public class Coffee
{
private String name;
private double price;
private int calories;
public static int nOfC; //static counter


public Coffee(String n, double p, int c) //parameterized constructor 
{
name=n; //Attribute before parameter
price=p;
calories=c;
nOfC++; //Since tis static so its counter that is shared by all the methods
}

public String getDescription(char size)
{
String description="";
switch(size) //Better to use switch since its easier
{
case 'S':
description="Small cup- "+calories+"calories, "+price+"SR";
break; 
case 'M':
description="Medium cup- "+(calories*2)+"calories, "+(price*2)+"SR";
break; 
case 'L':
description="Large cup- "+(calories*3)+"calories, "+(price*3)+"SR";
break; 
default:
description="Sorry, invalid size";
break;
}//end switch
return description+"\n";
}

public void predictPrice(int y, double gRate) //Since its void its print 
{
double predictedPrice=price*Math.pow((1+gRate), y); //y is the parameter for years
System.out.printf("The predicted %s price is %.2f SR %n",name,predictedPrice);
}

public int cupsToTarget(double tPrice)
{
double numOfCups=tPrice/price; //35/8=4.375 they rounded to 5 which means ceil
return (int) (Math.ceil(numOfCups)); //typecast because they only take double
}
}