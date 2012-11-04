package week11;


public class Employee {
  
  private int age;
  private double hourlyWage;
  private String name;
  private int hoursWorked;
  
  // constructor <- this makes the object
  public Employee(String name)
  {
    this.name = name;  
  }
  
  public String getName()
  {
    return name; 
  }
  
  public String sayHello() 
  {
     return name + " says hello!"; 
  }
  
  public void setHoursWorked(int hoursWorked) 
  {
    this.hoursWorked = hoursWorked;
  }
  
  public void setHourlyWage(double hourlyWage)
  {
    this.hourlyWage = hourlyWage;  
  }
  
  public double calculateWage()
  {
    return hoursWorked*hourlyWage;
  }
  
}
