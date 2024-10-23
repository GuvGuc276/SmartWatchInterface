package proje1;

import java.util.*;

public class Proje1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Press 1 to open the menu");
        String bir = "MOM";
        String phobir = "0 533 263 57 47";
        String iki = "DAD";
        String phoiki = "0 522 261 98 24";
        String uc = "SISTER";
        String phouc = "0 545 674 76 12";
        String dort = "HOME ";
        String phodort ="0 216 924 97 89";
        String bes = "BROTHER ";
        String phobes = "0 565 612 25 25";  
        int Correct = 0 ;
        int count = 0 ;
        String logs = "  " ;
        String messages = "  ";
        
        int num = scn.nextInt();
        scn.nextLine();
        while (num == 1) {
          
            
        System.out.println("Menu:");
        System.out.println("1-Display Time");
        System.out.println("2-Stopwatch");
        System.out.println("3-Phone Functions");
        System.out.println("4-Contact Management");
        System.out.println("5-History");
        System.out.println("6-Game");
        System.out.println("7-Exit");
        System.out.print("Enter your choice: ");

        int choice = scn.nextInt();

        switch (choice) {
        case 1:
        long milli = System.currentTimeMillis();
        long second = milli / 1000;
        long currentsec = second % 60;
        long mins = second / 60;
        long currentMins = mins % 60;
        long Hours = mins / 60;
        long currentHour = Hours % 24;
        System.out.println((currentHour + 3) + ":" + currentMins + ":" + currentsec);
        break;
        case 2:
        System.out.println("Write anything  to start the stopwatch");
        scn.next();
        long start = System.currentTimeMillis();


        System.out.println("Write anything to stop");
        scn.next();
        long stop = System.currentTimeMillis();


        long time = (stop - start) / 1000;
        System.out.println(time + " " + "SECONDS");

        break;
        case 3:
        System.out.println("CONTACTS");
        System.out.println("1-"+bir);
        System.out.println("2-"+iki);
        System.out.println("3-"+uc);
        System.out.println("4-"+dort);
        System.out.println("5-"+bes);
        System.out.println("Which contact you want to communicate");
        int choice1 = scn.nextInt();
        switch(choice1){
        case 1:
        System.out.println("Phone Functions Menu:");
        System.out.println("1. Make Call");
        System.out.println("2. Send Text Message");
        int choice2 = scn.nextInt();
        scn.nextLine();
        switch(choice2){
        case 1:
       
        System.out.println("Calling"+bir+"...");
        logs += "Call to "+ bir +"\n";
        break;
        case 2:
        
        System.out.println("Enter your message:");
        String message = scn.nextLine();
        System.out.println("Message sent to " + bir + ": " + message);
        messages += "To:" + bir + "\n" + message + "\n";
        break;
        default:
        System.out.println("Invalid choice. Please try again.");
        }
        
        break;
        case 2 :
        System.out.println("Phone Functions Menu:");
        System.out.println("1. Make Call");
        System.out.println("2. Send Text Message");
        int choice3 = scn.nextInt();
        scn.nextLine();
        switch(choice3){
        case 1:
       
        System.out.println("Calling"+iki+"...");
        logs += "Call to "+ iki +"\n";
        
        break;
        case 2:
        
        System.out.println("Enter your message:");
        String message = scn.nextLine();
        System.out.println("Message sent to " + iki + ": " + message);
        messages += "To:" + iki + "\n" + message + "\n";
        break;
        default:
        System.out.println("Invalid choice. Please try again.");
        }
        break;
        case 3:
        System.out.println("Phone Functions Menu:");
        System.out.println("1. Make Call");
        System.out.println("2. Send Text Message");
        int choice4 = scn.nextInt();
        scn.nextLine();
        switch(choice4){
        case 1:
        
        System.out.println("Calling"+uc+"...");
        logs += "Call to "+ uc +"\n";
        
        
        break;
        case 2:
        
        System.out.println("Enter your message:");        
        String message = scn.next();
        System.out.println("Message sent to " + uc + ": " + message);
        messages += "To:" + uc + "\n" + message + "\n";
        
        
        break;
        default:
        System.out.println("Invalid choice. Please try again.");
        }break;
        case 4:
        System.out.println("Phone Functions Menu:");
        System.out.println("1. Make Call");
        System.out.println("2. Send Text Message");
        int choice7 = scn.nextInt();
        scn.nextLine();
        switch(choice7){
        case 1:
        
        System.out.println("Calling "+dort+"...");
        logs += "Call to "+ dort +"\n";
        
        break;
        case 2:
       
        System.out.println("Enter your message:");
        String message = scn.nextLine();
        System.out.println("Message sent to " + dort + ": " + message);
        messages += "To:" + dort + "\n" + message + "\n";
        
        break;
        default:
        System.out.println("Invalid choice. Please try again.");
        }break;
        case 5:
        System.out.println("Phone Functions Menu:");
        System.out.println("1. Make Call");
        System.out.println("2. Send Text Message");
        int choice8 = scn.nextInt();
        scn.nextLine();
        switch(choice8){
        case 1:
        
        System.out.println("Calling"+bes+"...");
        logs += "Call to "+ bes+"\n";
        
        break;
        case 2:
        
        System.out.println("Enter your message:");
        String message = scn.nextLine();
        System.out.println("Message sent to " + bes + ": " + message);
        messages += "To:" + bes + "\n" + message + "\n";
        break;
        default:
        System.out.println("Invalid choice. Please try again.");
        }
        break;
        default:
        System.out.println("Invalid choice. Please try again.");
        }
        break;
        case 4:
        System.out.println("CONTACTS");
        System.out.println("1-"+bir);
        System.out.println("2-"+iki);
        System.out.println("3-"+uc);
        System.out.println("4-"+dort);
        System.out.println("5-"+bes);
                    
                    
                    
        System.out.println("Select a contact");
        int choice11 =scn.nextInt();
        switch (choice11){
        case 1:
        System.out.println("Contact Management Menu:");
        System.out.println("1-View Contact");
        System.out.println("2-Edit Contact");
        System.out.println("3-Delete Contact");
        int choice9 = scn.nextInt();
        scn.nextLine(); 

        switch (choice9) {
        case 1:
        System.out.println(bir+"-----"+phobir);
        break;
        case 2:
        System.out.print("Change the name(1) or change the number(2)");
        int choice10 = scn.nextInt();
        switch(choice10){
        case 1:
        System.out.println("Enter the new name");
        bir = scn.next();
        break;
        case 2:
        System.out.println("Enter the new number");
        phobir = scn.next();
        System.out.println("New number-----"+phobir);
        break;
        default:
        System.out.println("Invalid choice. Please try again.");
        }
            
        break;
        case 3:
        bir = "  ";
        phobir="   ";
        System.out.println("Contact deleted.");
        break;
        default:
        System.out.println("Invalid choice. Please try again.");
        }break;
        case 2:
        System.out.println("Contact Management Menu:");
        System.out.println("1-View Contact");
        System.out.println("2-Edit Contact");
        System.out.println("3-Delete Contact");
        int choice10 = scn.nextInt();
        scn.nextLine(); 

        switch (choice10) {
        case 1:
        System.out.println(iki+"-----"+phoiki);
        break;
        case 2:
        System.out.print("Change the name(1) or change the number(2)");
        int choice13 = scn.nextInt();
        switch(choice13){
        case 1:
        System.out.println("Enter the new name");
        iki = scn.next();
        break;
        case 2:
        System.out.println("Enter the new number");
        phoiki = scn.next();
        System.out.println("New number-----"+phoiki);
        break;
        default:
        System.out.println("Invalid choice. Please try again.");}
        break;
        case 3:
        iki = "  ";
        phoiki="   ";
        System.out.println("Contact deleted.");     
        break;
        default:
        System.out.println("Invalid choice. Please try again.");
        }
        break;
        case 3:
        System.out.println("Contact Management Menu:");
        System.out.println("1-View Contact");
        System.out.println("2-Edit Contact");
        System.out.println("3-Delete Contact");
        int choice12 = scn.nextInt();
        scn.nextLine(); 

        switch (choice12) {
        case 1:
        System.out.println(uc+"-----"+phouc);
        break;
        case 2:
        System.out.print("Change the name(1) to change the number(2)");
        int choice13= scn.nextInt();
        switch(choice13){
        case 1:
        System.out.println("Enter the new name");
        uc = scn.next();
        break;
        case 2:
        System.out.println("Enter the new number");
        phouc = scn.next();
        System.out.println("New number-----"+phouc);
        break;
        default:
        System.out.println("Invalid choice. Please try again.");
        }

        break;
        case 3:
        uc = "  ";
        phouc="   ";
        System.out.println("Contact deleted.");     
        break;
        default:
        System.out.println("Invalid choice. Please try again.");
        }
        break;
        case 4:
        System.out.println("Contact Management Menu:");
        System.out.println("1-View Contact");
        System.out.println("2-Edit Contact");
        System.out.println("3-Delete Contact");
        int choice14 = scn.nextInt();
        scn.nextLine(); 

        switch (choice14) {
        case 1:
        System.out.println(dort+"-----"+phodort);
        break;
        case 2:
        System.out.print("Change the name(1) to change the number(2)");
        int choice15 = scn.nextInt();
        switch(choice15){
        case 1:
        System.out.println("Enter the new name");
        dort = scn.next();
        break;
        case 2:
        System.out.println("Enter the new number");
        phodort = scn.next();
        System.out.println("New number-----"+phodort);
        break;
        default:
        System.out.println("Invalid choice. Please try again.");
        }
                
        break;
        case 3:
        dort = "  ";
        phodort = "   ";
        System.out.println("Contact deleted.");  
        break;
        default:
        System.out.println("Invalid choice. Please try again.");
        }
        break;
        case 5:
        System.out.println("Contact Management Menu:");
        System.out.println("1-View Contact");
        System.out.println("2-Edit Contact");
        System.out.println("3-Delete Contact");
        int choice16 = scn.nextInt();
        scn.nextLine(); 

        switch (choice16){
        case 1:
        System.out.println(bes+"-----"+phobes);
        break;
        case 2:
        System.out.print("Change the name(1) to change the number(2)");
        int choice17 = scn.nextInt();
        switch(choice17){
        case 1:
        System.out.println("Enter the new name");
        bes = scn.next();
        break;
        case 2:
        System.out.println("Enter the new number");
        phobes = scn.next();
        
        System.out.println("New number-----"+phobes);
        break;
        default:
        System.out.println("Invalid choice. Please try again.");
        }
                
        break;
        case 3:
        bes = "  ";
        phobes = "   ";
        System.out.println("Contact deleted.");
             
        break;
        default:
        System.out.println("Invalid choice. Please try again.");
        }
        break;
        default:
        System.out.println("Invalid choice. Please try again.");
        }
        
        break;                                                                                                           
        case 5:             
        System.out.println("CALL LOGS:");
        System.out.println(logs);
        System.out.println("MESSAGES:");
        System.out.println(messages);
        break;

        case 6:
        int n1 = (int) (Math.random()*20+1);
        System.out.println("Your score is " + Correct + " out of "+ count + "tries" );
        System.out.println("guess a number between 1-20");
        count++;
        int n2 = scn.nextInt();
        if (n1 == n2) {
        System.out.println("You are right");
        Correct++;
         } 
        else {
        System.out.println("You are wrong , the number was " + n1);
        }

        break;
        case 7:

        System.out.println("Exiting the smartwatch.Bye bye!");
        System.exit(0);
        break;
        default:
        System.out.println("Invalid choice. Please try again.");
         }
         
        
        }
        
    }
     
        
 } 