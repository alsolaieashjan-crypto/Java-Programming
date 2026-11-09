public class Parcel {
private String id;
private double weight;
private char type;
public static int totalParcels;

public Parcel(String id, double weight, char type)
{
this.id=id;
this.weight=weight;
this.type=Character.toUpperCase(type);
totalParcels++;
}

public double CalculateFee(double rate)
{
if(type=='E')
return weight*rate*1.5;
return weight*rate;
}

public String getShippingDays(String city)
{
    String days = ""; 
    switch (city) {
        case "Riyadh":
            days = "1 Day";
            break; 
        case "Jeddah":
            days = "2 Days";
            break;
        default:
            days = "4 Days";
            break;
    }
    return days; 
}


}