public class EmployeeDemo {
public static void main(String [] args) {


Employee emp1=new Employee("Lamya",10000,15);
Employee emp2=new Employee("Sara",10000,3);

if(emp1.hasSameSalary(emp2))
System.out.println("Both employees have the same salary");
else
System.out.println("The employees have different salaries");


System.out.println("\nEmployee 1 details: ");
emp1.print();

System.out.println("\nEmployee 2 details: ");
emp2.print();


}
}