//Student name: Ashjan Alsolaie, Shatha Algahtani
//Student ID: 446206911, 446204142
//Lab instructor name: Meerah Alhakbani
//Section number: 80070
import java.util.Scanner;

public class project_phase2 {
    // Global scanner so every method can read user input 
    static Scanner read = new Scanner(System.in);
    
    // Global parking slot objects
    static ParkingSlot slot1, slot2, slot3, slot4, slot5; 
    
    // Global variables to keep track of money and stats across different menus
    static double totalProfit = 0; // Changed to double to match price logic
    static int duration1Count = 0, duration2Count = 0, duration3Count = 0, duration4Count = 0, duration5Count = 0;
    static final int DAY_PASS_PRICE = 30;
    static final int HOURLY_PRICE = 5;

    public static void main(String[] args) {
        // Initializing the 5 slots
        slot1 = new ParkingSlot(1, true);
        slot2 = new ParkingSlot(2, true);
        slot3 = new ParkingSlot(3, true);
        slot4 = new ParkingSlot(4, true);
        slot5 = new ParkingSlot(5, true);

        displayMenu();
    }

    public static void displayMenu() {
        int mainChoice;
        do {
            System.out.println("\n --- Welcome to the parking slot reservation system!--- ");
            System.out.println("1. Customer");
            System.out.println("2. Parking Administrator");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            mainChoice = read.nextInt();
            
            switch (mainChoice) {
                case 1:
                    customerMenu();
                    break;
                case 2:
                    administratorMenu();
                    break;
                case 3:
                    System.out.println("Thank you, goodbye...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (mainChoice != 3);
    }

    public static void customerMenu() {
        if (allSlotsOccupied()) {
            System.out.println("\nAll parking slots are occupied. Returning to main menu --");
            return;
        }

        int customerChoice = 0;
        ParkingSlot selectedSlot = null;
        int selectedDuration = 0;
        boolean isSlotSelected = false;
        boolean isDurationSelected = false;

        while (customerChoice != 3) {
            System.out.println("\n ---Customer Menu---");
            System.out.println("1. Choose parking slot and duration");
            System.out.println("2. Checkout");
            System.out.println("3. Return to main menu");
            System.out.print("Enter your choice: ");

            customerChoice = read.nextInt();

            switch (customerChoice) {
                case 1:
                    System.out.println("\n AVAILABLE PARKING SLOTS:");
                    System.out.printf("%-12s %-17s %n", "Slot ID", "Status");
                    
                    if (slot1.isAvailable()) slot1.display();
                    if (slot2.isAvailable()) slot2.display();
                    if (slot3.isAvailable()) slot3.display();
                    if (slot4.isAvailable()) slot4.display();
                    if (slot5.isAvailable()) slot5.display();

                    System.out.print("Enter Slot ID to reserve: ");
                    int idChoice = read.nextInt();

                    // Logic to link ID to the actual object
                    if (idChoice == 1 && slot1.isAvailable()) { selectedSlot = slot1; isSlotSelected = true; }
                    else if (idChoice == 2 && slot2.isAvailable()) { selectedSlot = slot2; isSlotSelected = true; }
                    else if (idChoice == 3 && slot3.isAvailable()) { selectedSlot = slot3; isSlotSelected = true; }
                    else if (idChoice == 4 && slot4.isAvailable()) { selectedSlot = slot4; isSlotSelected = true; }
                    else if (idChoice == 5 && slot5.isAvailable()) { selectedSlot = slot5; isSlotSelected = true; }
                    else {
                        System.out.println("Invalid or unavailable slot.");
                        isSlotSelected = false;
                        break;
                    }

                    System.out.println("\nSelect your duration: ");
                    System.out.println("1. 1 hour for 5 SAR");
                    System.out.println("2. 2 hours for 10 SAR");
                    System.out.println("3. 3 hours for 15 SAR");
                    System.out.println("4. 4 hours for 20 SAR");
                    System.out.println("5. Day pass for 30 SAR");
                    System.out.print("Please Select a Duration: ");
                    selectedDuration = read.nextInt();

                    if (selectedDuration >= 1 && selectedDuration <= 5) {
                        isDurationSelected = true;
                        System.out.println("Selection stored. Please proceed to Checkout.");
                    } else {
                        System.out.println("Invalid duration choice.");
                        isDurationSelected = false;
                    }
                    break;

                case 2:
                    if (!isSlotSelected || !isDurationSelected) {
                        System.out.println("Please select a slot and duration first.");
                    } else {
                        generateInvoice(selectedSlot, selectedDuration);
                        // Reset selection after checkout attempt
                        isSlotSelected = false;
                        isDurationSelected = false;
                    }
                    break;

                case 3:
                    System.out.println("Returning to main menu...");
                    break;

                default:
                    System.out.println("Invalid customer choice.");
            }
            
            // Break loop if parking is now full after a checkout
            if (allSlotsOccupied() && customerChoice != 3) {
                System.out.println("Lot is now full!");
                break;
            }
        }
    }

    // Creates a formatted bill and asks for final confirmation
    public static void generateInvoice(ParkingSlot slot, int duration) {
        double price;
        String invoice = "\n\n *** OFFICIAL INVOICE *** \n";
        invoice += String.format("%-20s: %d \n", "Selected Slot ID", slot.getSlotId());
        
        if (duration >= 1 && duration <= 4) {
            invoice += String.format("%-20s: %s \n", "Parking Duration", duration + " hour(s)");
            price = duration * HOURLY_PRICE;
        } else {
            invoice += String.format("%-20s: %s \n", "Parking Duration", "Day Pass");
            price = DAY_PASS_PRICE;
        }
        
        invoice += String.format("%-20s: %.2f SAR \n", "Total Cost", price);
        System.out.println(invoice);

        System.out.print("Confirm reservation? (1-Yes, 0-No): ");
        int confirm = read.nextInt();

        if (confirm == 1) {
            slot.reserve(); // Mark slot as occupied
            totalProfit += price;
            
            // Update tracking for reports
            if (duration == 1) duration1Count++;
            else if (duration == 2) duration2Count++;
            else if (duration == 3) duration3Count++;
            else if (duration == 4) duration4Count++;
            else if (duration == 5) duration5Count++;
            
            System.out.println("Reservation confirmed! Thank you.");
        } else {
            System.out.println("Reservation cancelled.");
        }
    }

    public static void administratorMenu() {
        int adminChoice = 0;
        while (adminChoice != 3) {
            System.out.println("\n **** PARKING ADMINISTRATOR MENU ****");
            System.out.println("1. View Total Profit");
            System.out.println("2. View Most Popular Parking Duration");
            System.out.println("3. Return to Main Menu");
            System.out.print("Enter choice: ");
            adminChoice = read.nextInt();

            switch (adminChoice) {
                case 1:
                    System.out.printf("\nTotal Accumulated Profit: %.2f SAR \n", totalProfit);
                    break;
                case 2:
                    displayPopularDuration();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }

    public static void displayPopularDuration() {
        int maxCount = Math.max(duration1Count, Math.max(duration2Count, Math.max(duration3Count, Math.max(duration4Count, duration5Count))));
        
        if (maxCount == 0) {
            System.out.println("\nNo data: No reservations have been made yet.");
            return;
        }

        System.out.print("\nMost Popular Duration(s): ");
        if (duration1Count == maxCount) System.out.print("1 Hour ");
        if (duration2Count == maxCount) System.out.print("2 Hours ");
        if (duration3Count == maxCount) System.out.print("3 Hours ");
        if (duration4Count == maxCount) System.out.print("4 Hours ");
        if (duration5Count == maxCount) System.out.print("Day Pass ");
        System.out.println("(Selected " + maxCount + " times)");
    }

    public static boolean allSlotsOccupied() {
        return !slot1.isAvailable() && !slot2.isAvailable() && !slot3.isAvailable() && !slot4.isAvailable() && !slot5.isAvailable();
    }
}