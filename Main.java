import java.util.Scanner;
/**
 *Creating proram to calculate disscount for customers
 * @author Gavin Sandhar
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // apply disscounts for customers

    // Create a scanner for user input
    Scanner input = new Scanner(System.in);
   // ask how much they spent
   System.out.println("How much did you spend today?");
    
   // disscounted price for each ammount

    // how much did the customers spend?
    double customerSpending = input.nextDouble();

    double disscountedPrice1 = customerSpending*0.1;
   double disscountedPrice2 = customerSpending*0.2;
   double disscountedPrice3 = customerSpending*0.3;
   double disscountedPrice4 = customerSpending*0.4;

   // Total Cost
   double total1 = customerSpending - disscountedPrice1;
   double total2 = customerSpending - disscountedPrice2;
   double total3 = customerSpending - disscountedPrice3;
   double total4 = customerSpending - disscountedPrice4;
    
     // tell customer their disscount
     if (customerSpending>0 && customerSpending<40.00){
     // tell them if they get a 10% disscount
      System.out.print("You will recieve a 10% disscount and ");
      System.out.print("will save $" + customerSpending*0.1 );
      System.out.print("The new total is $" + total1);
     }
     if (customerSpending>41.00 && customerSpending<80.00){
     // tell them if they get a 20% disscount
     System.out.print("You will recieve a 20% disscount");
     System.out.print("will save $" + customerSpending*0.2 );
     System.out.print("The new total is $" + total2);
     }
     if (customerSpending>81.00 && customerSpending<120.00){
     // tell them if they get a 30% disscount
      System.out.print("You will recieve a 30% disscount");
      System.out.print("will save $" + customerSpending*0.3 );
      System.out.print("The new total is $" + total3);
     }
     if (customerSpending>120.00){
     // tell them if they get a 40% disscount
      System.out.print("You will recieve a 40% disscount"); 
      System.out.print("will save $" + customerSpending*0.4 );
      System.out.print("The new total is $" + total4);
     }

 
    
    
  }
}
