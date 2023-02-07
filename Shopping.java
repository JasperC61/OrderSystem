package j8Java_Concurrency;
import java.util.Scanner;
public class Shopping {
	
	

	
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    double total = 0;
	    int quantity;
	    double price;
	    String item;
	    boolean keepShopping = true;
	  
	    while (keepShopping) {
	      System.out.print("Enter the item: ");
	      item = input.nextLine();
	  
	      System.out.print("Enter the price: ");
	      price = input.nextDouble();
	  
	      System.out.print("Enter the quantity: ");
	      quantity = input.nextInt();
	  
	      total += price * quantity;
	  
	      input.nextLine();
	      System.out.print("Would you like to keep shopping? (yes/no) ");
	      String answer = input.nextLine();
	      if (answer.equals("no")) {
	        keepShopping = false;
	      }
	    }
	    System.out.println("Your total is $" + total);
	  }
	}
	







