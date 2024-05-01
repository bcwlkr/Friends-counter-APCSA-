import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Welcome! Please enter your friends' first name. Press 'd' when you are done.");

    ArrayList<String> friends = new ArrayList<String>();
    String userInput = "";
    while(!userInput.equals("d")){
      userInput = keyboard.next();
      if(!userInput.equals("d")){
        friends.add(userInput);
      }
    }
    System.out.println("You have entered " + friends.size() + " friends.");
    System.out.println("Here is your list of friends:");
    int list = 1;
    for(String friend : friends){
      System.out.println(list + ". " + friend);
      list++;
    }
    System.out.println("The two friends that have been randomly chosen to go to the movies with you are...");
    int randomNum1 = (int)(Math.random() * friends.size());
    int randomNum2 = (int)(Math.random() * friends.size());
    while(randomNum1 == randomNum2) {
      randomNum2 = (int)(Math.random() * friends.size());
    }
    System.out.println(friends.get(randomNum1));
    System.out.println(friends.get(randomNum2));
  }
}
