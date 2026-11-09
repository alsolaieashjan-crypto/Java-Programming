public class ParkingSlot {
    private int slotId;
    private boolean available;

    public ParkingSlot() //defult constructor that intializes the slot ID and sets parking slot as available
    {
        slotId = 0;
        available = true; 
    }

    public ParkingSlot(int slotId, boolean available) //parameterized constructr the intializes the parking spot using the given values
    {
        this.slotId = slotId; //Since the attribute and the parameter have the same name we used this so it can differentiate and it wont cause any logical errors
        this.available = available;
    }

    public void reserve() {
        available = false; //Marks the parking slot as occupied
    }

    
    public boolean isAvailable() {
        return available;
    }

    public void display() {
        System.out.printf("%-10d %15s \n", slotId, available ? "Available" : "Occupied");
        //Conditional statement if its true retuen available otherwise false
    }

    //Since these attributes are private we need getters and setters so the methods can access them
    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
}