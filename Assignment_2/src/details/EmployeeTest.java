package details;
import details.Employee;

public class EmployeeTest {

	public static void main(String[] args) {// TODO Auto-generated method stub
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e1.accept();
		e1.display();
		
		e2.accept();
		e2.display();
		
		e1.setMonthlySalary(0.10*(e1.getMonthlySalary()));
		e2.setMonthlySalary(0.10*(e2.getMonthlySalary()));
		
		System.out.println("Salary After Upraisal:");
		e1.display();
		e2.display();
		
		
	}

};
