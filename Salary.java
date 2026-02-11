class salary{
	public static void main(String args[]){
		int salary = 7200000;
		double net_salary = 0;
		if (salary>=100000){
			net_salary = 0;
			net_salary = salary*5/100;
		}else if(salary>=80000){
			net_salary = 0;
			net_salary =  salary*3/100;
			System.out.println(net_salary);
		}else{
			System.out.println("PFpf");
		}
	}
}
				