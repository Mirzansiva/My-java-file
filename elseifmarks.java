class elseifmarks{
	public static void main(String args []){
		int marks = 76;
		if ((marks >= 75)&&(marks <= 100)){
			System.out.println("Grade :A");
		} else if ((marks >=65)&&(marks <75)){
			System.out.println("Garde :B");
		} else if ((marks >= 55)&&(marks < 65)){
			System.out.println("Grade : C");
		} else if((marks >= 35)&&(marks < 55)){
			System.out.println("Grade :S");
		} else if ((marks >= 0)&&(marks < 35)){
			System.out.println("Grade :F");
		} else {
			System.out.println("Invalid number You put");
		}
	}
}
	