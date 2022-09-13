import java.util.Scanner; 
public class gradesWhileloop {
	
	public static void main(String[] args) 
	{
	Scanner myIn = new Scanner(System.in);
	String grade;
	System.out.println("Whats the grade for student? (0 - 100)");
	int mark = myIn.nextInt();
		
	while (mark <= 100 && mark >= 0){
		
if(mark >= 70){
grade = "A";
}
else if (mark >= 60 && mark < 70){
grade = "B1";
}
else if (mark >= 50 && mark < 60){
grade = "B2";
}
else if (mark >= 40 && mark < 50){
grade = "C";
}
else {
	grade = "fail";
}

System.out.println("Your grade is: " + grade);
mark = myIn.nextInt();
} 	
myIn.close();
	}
	}
