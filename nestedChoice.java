import java.util.Scanner;

class nestedChoice {
  public static void main(String[] args) {
Scanner myIn = new Scanner(System.in);  


System.out.println(" please enter your mark. ");
int mark = myIn.nextInt();

if (mark >= 40)
{
   	   System.out.println("well done ");
 	   System.out.println("you have passed");
}

else
{
   	   System.out.println("were there any extenuating circumstances, Y/N ");
   	   char circumstances = myIn.next().charAt(0);

		if ( circumstances == 'Y' || circumstances == 'y')

		{
		  System.out.println("this will be counted as a first diet exam");
		  System.out.println("hope everything is ok now and you will pass");
		}	
		else
		{
 	             System.out.println("If there are no circumstances then this is a fail");
		 System.out.println("Good luck with the resit");
		}

}
}	}
