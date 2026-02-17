import java.util.Scanner;

class userinput{
	public static void main(String args[]){
	Scanner x = new Scanner (System.in);/
	String name = "";
	System.out.print("Please enter youyr name :");
	name = x.next();
	System.out.println("Your name is "+ name);
	
	System.out.println("**************************");
	
	int marks = 0;
	System.out.print("Plase enter your marks :");
	marks = x.nextInt();
	System.out.println("Your marks is "+ marks);
	}
}



