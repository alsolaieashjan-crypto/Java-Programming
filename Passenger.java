public class Passenger{

public String name;
public int ID;
public String status;

public void setStatus(String s) 
{
status=s;
}


public void displayInfo()
{
System.out.println("The name is "+name+" the ID is "+ID+" the status is "+status);
}



}