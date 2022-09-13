import java.util.Calendar;
import java.util.Scanner;

class exercise2Lab1 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    Calendar cal = Calendar.getInstance();

    if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY)
    System.out.println("It is my working day.");

    else 
    System.out.println("Sorry, I don't work today.");

    System.out.println("Do you have a concession (yes or no)?");
    String concession = myObj.nextLine();

    System.out.println("How old are you?");
    int age = myObj.nextInt();

    if(concession.equals("yes") || age <= 5)
    System.out.println("You are entitled to a discount on a fare.");

    else 
    System.out.println("You have to pay full price.");
  }
}
