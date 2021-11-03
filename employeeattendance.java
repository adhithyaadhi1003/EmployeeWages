public class employeeattendance{
	public static final int IsParttime = 1;
	public static final	int IsFulltime = 2;
	public static void main(String[] args){
	
	int Emp_wage_per_hour = 20;
	int Emp_hour = 0;
	int dailywage = 0;
	
	int empcheck = (int) Math.floor((Math.random()*10)%3);
	
	switch (empcheck){

	case IsParttime:
	Emp_hour = 4;
	dailywage=(Emp_hour*Emp_wage_per_hour);
	System.out.println("Employee is part time and daily wage is  "+dailywage);
	break;

	case IsFulltime:
	Emp_hour = 8;
	dailywage=(Emp_hour*Emp_wage_per_hour);
	System.out.println("Employee is full time and daily wage is " +dailywage);
	break;

	default:
	Emp_hour = 0;
	System.out.println("Employee is absent and daily wage is  " +dailywage);
	}
   }
}

