import java.util.Scanner;
public class Arraysum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int[] number = new int[5];
		int sum = 0;
		
		System.out.println("Enter the 5 numbers :");
		for(int i=0;i<5;i++){
			number[i] = sc.nextInt();
			sum = sum + number[i];
		}
		System.out.println("Sum of array elements :"+sum);
	}
}