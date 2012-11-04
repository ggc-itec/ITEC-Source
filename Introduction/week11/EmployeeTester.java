package week11;


public class EmployeeTester {
  
  
  public static void main(String[] args) { 
    Employee brian = new Employee("brian");
    System.out.println(brian.getName());
    System.out.println(brian.sayHello());
    brian.setHoursWorked(10);
    brian.setHourlyWage(8.5);
    System.out.println("Brian earned " + brian.calculateWage() );
    Employee lois = new Employee("lois");
    System.out.println(lois.getName());
    System.out.println(lois.sayHello());
    lois.setHoursWorked(40);
  }
  
  
}
