import java.util.Scanner;

class exercise3Lab1 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

System.out.println("Cowboys and cowgirls of all ages go to the Grand Ole Opry. Are you one of them (yes or no)?");
String status = myObj.nextLine();

if(status.equals("yes")){
System.out.println("You go to the Grand Ole Opry at 10pm. There is bingo at 7pm at the same place tho, would you like to go on that too?");
String bingo = myObj.nextLine();

if(bingo.equals("yes")){
  System.out.println("See you at 7pm then!");
}
else{
  System.out.println("See you at 10pm then.");
}
}

else{
System.out.println("Enter your age to see what you should do today:");

int age = myObj.nextInt();

    if(age < 18)
    System.out.println("Get a carry out.");

    else if (age >= 18 && age <= 21)
    System.out.println("Go to the club Clattys.");

    else if (age > 21 && age <= 30)
    System.out.println("Go to the club Trendytwentys");

    else if (age > 30 && age <40)
    System.out.println("Go to the club Dirtythirtys");

    else if (age >= 40 && age < 50)
    System.out.println("Go to Last Chance Disco.");

    else if (age >= 50 && age <= 60)
    System.out.println("Go to the local pub");

    else
    System.out.println("Males go to the OAP club and their wives go to SPA.");
  }}
}
