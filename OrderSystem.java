package j8Java_Concurrency;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class OrderSystem {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double total = 0;
    int quantity;
    double price;
    String item;
    boolean keepOrdering = true;
  
    Map<String, Double> menu = new HashMap<>();
    menu.put("Hamburger", 5.99);
    menu.put("Pizza", 6.99);
    menu.put("Fries", 2.99);
    menu.put("Soda", 1.99);
  
    while (keepOrdering) {
      System.out.println("Menu:");
      for (Map.Entry<String, Double> itemEntry : menu.entrySet()) {
        System.out.println(itemEntry.getKey() + " - $" + itemEntry.getValue());
      }
      System.out.print("Enter your order: ");
      item = input.nextLine();
      if (!menu.containsKey(item)) {
        System.out.println("Sorry, we don't have that item.");
        continue;
      }
  
      price = menu.get(item);
  
      System.out.print("Enter the quantity: ");
      quantity = input.nextInt();
  
      total += price * quantity;
  
      input.nextLine();
      System.out.print("Would you like to order anything else? (yes/no) ");
      String answer = input.nextLine();
      if (answer.equals("no")) {
        keepOrdering = false;
      }
    }
    System.out.println("Your total is $" + total);
  }
}