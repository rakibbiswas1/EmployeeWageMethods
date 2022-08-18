
public class EmployeeWageMethod {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		int present = 1;
		EmployeeWageMethod emp = new EmployeeWageMethod();
		EmployeeWageMethod.attend(present);
	}
	public static void attend(int IS_FULL_TIME) {
		double empCheck = Math.floor(Math.random() * 10) % 2;
 		if (empCheck == IS_FULL_TIME)
 			System.out.println("Employee is Present");
 		else
 			System.out.println("Employee is Absent");
	}
}
