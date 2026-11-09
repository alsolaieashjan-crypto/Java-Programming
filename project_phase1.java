//Student name: Ashjan Alsolaie, Shatha Algahtani
//Student ID: 446206911, 446204142
//Lab instructor name: Meerah Alhakbani
//Section number: 80070
import java.util.Scanner;

public class project_phase1 {
   public static void main(String[] args) {
      Scanner read = new Scanner(System.in);
   
   
      int totalprofit = 0;
      int First_slotID = 1, Second_slotID = 2, Third_slotID = 3, Fourth_slotID = 4, Fifth_slotID = 5;
   
   // Status is true if the spot is empty
      boolean First_slotstatus = true, Second_slotstatus = true, Third_slotstatus = true,
         Fourth_slotstatus = true, Fifth_slotstatus = true; 
   
      int duration1Count = 0, duration2Count = 0, duration3Count = 0, duration4Count = 0, duration5Count = 0;
   
      final int HOURLY_PRICE = 5, DAY_PASS_PRICE = 30;
      int Mainchoice;
      int selectedSlot = 0;
      boolean slotpicked = false, durationpicked = false; // false because the customer still didn't pick
      String durationText = " "; 
      int cost = 0;
   
      do // Beginning of main menu
      {
         System.out.println("\n --- Welcome to the parking slot reservation system!--- ");
         System.out.println("1. Customer");
         System.out.println("2. Parking Administrator");
         System.out.println("3. Exit");
         System.out.print("Enter your choice: ");
      
         Mainchoice = read.nextInt();
      
         switch (Mainchoice) {
         
         // Beginning of customer menu
            case 1:
               int Customerchoice = 0;
               while (Customerchoice != 2) {  
               // Check if any slots are actually free
                  if (First_slotstatus != true && Second_slotstatus != true && Third_slotstatus != true
                  && Fourth_slotstatus != true && Fifth_slotstatus != true ) 
                  { 
                  // if statement block
                     System.out.println("\n All parking slots are occupied \n Back to main menu ");
                     break;
                  }
               
                  System.out.println("\n ---Customer Menu---");
                  System.out.println("1. Choose parking slot and duration");
                  System.out.println("2. Return to main menu");
                  System.out.print("Enter your choice: ");
                  Customerchoice = read.nextInt();
               
                  if (Customerchoice == 1) {
                     System.out.println("\nAVAILABLE PARKING SLOTS:");
                     String availableTable = String.format("%-12s %-17s %n", "Slot ID", "Status");
                     if (First_slotstatus) availableTable += String.format("%-12d %-17s %n", First_slotID, "Available");
                     if (Second_slotstatus) availableTable += String.format("%-12d %-17s %n", Second_slotID, "Available");
                     if (Third_slotstatus) availableTable += String.format("%-12d %-17s %n", Third_slotID, "Available");
                     if (Fourth_slotstatus) availableTable += String.format("%-12d %-17s %n", Fourth_slotID, "Available");
                     if (Fifth_slotstatus) availableTable += String.format("%-12d %-17s %n", Fifth_slotID, "Available");
                  
                     System.out.println(availableTable);
                  
                     System.out.print("Enter slotID to select: ");
                     selectedSlot = read.nextInt();
                  
                  // Check if the selected slot is valid and free
                     if ((selectedSlot == First_slotID && First_slotstatus) ||
                     (selectedSlot == Second_slotID && Second_slotstatus) ||
                     (selectedSlot == Third_slotID && Third_slotstatus) ||
                     (selectedSlot == Fourth_slotID && Fourth_slotstatus) ||
                     (selectedSlot == Fifth_slotID && Fifth_slotstatus)) {
                     
                        slotpicked = true;
                        System.out.println("Slot " + selectedSlot + " selected successfully!");
                     
                        System.out.println("\nSelect your duration: ");
                        System.out.println("1. 1 hour for 5SAR ");
                        System.out.println("2. 2 hours for 10SAR ");
                        System.out.println("3. 3 hours for 15SAR ");
                        System.out.println("4. 4 hours for 20SAR ");
                        System.out.println("5. Day pass for 30SAR ");
                        System.out.println("    ");
                        System.out.println("Please select a duration: ");
                        int num = read.nextInt();
                     
                        switch (num) {
                           case 1: 
                              cost = 5; 
                              durationText = "1 Hour"; 
                              duration1Count++; 
                              break;
                        
                           case 2:
                              cost = 10;
                              durationText = "2 Hours";
                              duration2Count++; 
                              break;
                        
                           case 3: 
                              cost = 15; 
                              durationText = "3 Hours";
                              duration3Count++;
                              break;
                        
                           case 4:
                              cost = 20;
                              durationText = "4 Hours";
                              duration4Count++;
                              break;
                        
                           case 5: 
                              cost = 30; 
                              durationText = "Day Pass"; 
                              duration5Count++; 
                              break;
                        }
                     
                        System.out.println("\n ------ INVOICE ------");
                        System.out.println("Slot: " + selectedSlot);
                        System.out.println("Duration: " + durationText);
                        System.out.println("Total Bill: " + cost + " SAR");
                     
                        System.out.print("Confirm? (1-YES, 2-NO): ");
                        int confirm = read.nextInt();
                     
                        if (confirm == 1) {
                        // Mark the specific slot as occupied
                           if (selectedSlot == 1)
                              First_slotstatus = false;
                           
                           else if (selectedSlot == 2)
                              Second_slotstatus = false;
                           
                           else if (selectedSlot == 3) 
                              Third_slotstatus = false;
                           
                           else if (selectedSlot == 4)
                              Fourth_slotstatus = false;
                           
                           else if (selectedSlot == 5) 
                              Fifth_slotstatus = false;
                        
                           totalprofit += cost;
                           System.out.println("Reservation Confirmed.");
                        } else {
                           System.out.println("Transaction Cancelled.");
                        }
                     } else {
                        System.out.println("Invalid Slot or Slot already taken!");
                     }
                  }
               }
               break; 
         // End of customer menu
         
         // Beginning of admin menu
            case 2:
               int adminchoice = 0;
               while (adminchoice != 3) {
                  System.out.println("\n --- Admin menu ---");
                  System.out.println("1. View the total profit from all parking reservations");
                  System.out.println("2. View the most popular parking durations");
                  System.out.println("3. Return to main menu");
                  System.out.print("Enter your choice: ");
               
                  adminchoice = read.nextInt();
               
                  if (adminchoice == 1) {
                     System.out.println("\n Total profit = " + totalprofit + " Riyals");
                  } 
                  else if (adminchoice == 2) {
                     int maxCount = duration1Count;
                     String popularDuration = "1 hour";
                  
                     if (duration2Count > maxCount) { 
                        maxCount = duration2Count; popularDuration = "2 Hours"; 
                     }
                     if (duration3Count > maxCount) {
                        maxCount = duration3Count; popularDuration = "3 Hours";
                     }
                     if (duration4Count > maxCount) {
                        maxCount = duration4Count; popularDuration = "4 Hours";
                     }
                     if (duration5Count > maxCount) { 
                        maxCount = duration5Count; popularDuration = "Day Pass";
                     }
                     if (maxCount == 0) {
                        System.out.println("\nNo reservations made yet.");
                     } 
                     else {
                        System.out.println("\nMost Popular Duration: " + popularDuration + " (" + maxCount + " times)");
                     }
                  } 
                  else if (adminchoice == 3) {
                     System.out.println("Returning to main menu...");
                  } 
                  else {
                     System.out.println("Invalid choice!");
                  }
               }
               break; // End of admin menu
         
            case 3:
               System.out.println("Thank you for using the system. Goodbye!");
               break;
         
            default:
               System.out.println("Invalid choice!");
         } 
      
      } while (Mainchoice != 3); // End of main menu
   
      read.close();
   }
}
