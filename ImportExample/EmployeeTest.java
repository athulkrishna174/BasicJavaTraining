import java.util.*;

public class EmployeeTest {

   public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter Name of Employee 1 : ");
      String emp1_name = sc.nextLine();
      System.out.print("Enter Age of Employee 1 : ");
      int emp1_age = Integer.parseInt(sc.nextLine());
      System.out.print("Enter Salary of Employee 1 : ");
      int emp1_salary = Integer.parseInt(sc.nextLine());

      System.out.print("Enter Name of Employee 2 : ");
      String emp2_name = sc.nextLine();
      System.out.print("Enter Age of Employee 2 : ");
      int emp2_age = Integer.parseInt(sc.nextLine());
      System.out.print("Enter Salary of Employee 2 : ");
      int emp2_salary = Integer.parseInt(sc.nextLine());
     
      
      sc.close();


      /* Create two objects using constructor */
      Employee empOne = new Employee(emp1_name);
      Employee empTwo = new Employee(emp2_name);

      // Invoking methods for each object created
      empOne.empAge(emp1_age);
      empOne.empDesignation("Senior Software Engineer");
      empOne.empSalary(emp1_salary);
      empOne.printEmployee();

      empTwo.empAge(emp2_age);
      empTwo.empDesignation("Software Engineer");
      empTwo.empSalary(emp2_salary);
      empTwo.printEmployee();
   }
}
