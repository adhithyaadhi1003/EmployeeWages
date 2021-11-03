

public class employeeattendance{
	public static void main(String[] args){
		int Is_Parttime = 1;
		int Is_Fulltime = 2;
		int Emp_wage_per_hour = 20;
			int Emp_hour = 0;
			int dailywage = 0;
			double empcheck = Math.floor(Math.random()*3);
			if(Is_Parttime == empcheck){
		 	Emp_hour = 4;
			dailywage=(Emp_hour*Emp_wage_per_hour);
			System.out.println("Employee is part time and daily wage is" +dailywage);

			}

			else if(empcheck == Is_Fulltime){
			Emp_hour = 8;
			dailywage=(Emp_hour*Emp_wage_per_hour);
			System.out.println("employee is full time and daily wage is  " +dailywage);
			
			
			}else{
			Emp_hour = 0;
			dailywage=(Emp_hour*Emp_wage_per_hour); 
			System.out.println("Employee is absent and daily wage is " +dailywage);	
			}
			
		}
		} 
