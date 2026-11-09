public class PassengerDemo {
public static void main(String [] args) {

Passenger p=new Passenger();

p.ID=123;
p.name="Ahmed";
p.status="Not confirmed";

p.setStatus("Confirmed");
p.displayInfo();
}


}