public class Employee {

private String name;
private double salary;
private int yearsOfService;

//Default constructor-writing this is optional
public Employee() 
{
this.name="";
this.salary=0.0;
this.yearsOfService=0;
}

//Parameterized constructor-writing this is nessecary
public Employee(String name, double salary, int yearsOfService) 
{
this.name=name;
this.salary=salary;
this.yearsOfService=yearsOfService;
}

private double calculateBonus()
{
if(yearsOfService>5)
return salary*0.10; //Return 10%
return salary*0.05; //Return 5%
}

public boolean hasSameSalary(Employee otherEmployee)
{
if(salary==otherEmployee.salary)
return true;
return false;
}


public void print()
{
System.out.println("Name: "+name);
System.out.println("Salary: "+salary);
System.out.println("Years of service: "+yearsOfService);
System.out.println("Bonus: "+calculateBonus());
}




}