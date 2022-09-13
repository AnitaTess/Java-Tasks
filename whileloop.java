import java.util.Scanner; 
public class whileloop {

public static void main(String[] args) 
{
       
Scanner myIn = new Scanner(System.in);  

int I = 1;
int count = 0;

System.out.println ("how many times would you like Hello Java printed");

count = myIn.nextInt();

while (I <= count)  
	{
	 System.out.println ("Hello Java");

	 I++;
  }
}
}
