package week11;

public class Actor {
  
  // fields -> represents the properties of this class
  private boolean isTalented;
  private int age;
  private String name;
  private double height;
  private long salary;
  
  // constructor -> 
  public Actor(String n, int a) 
  {
     age = a;
     name = n;
  }
  
  public int getAge() 
  {
     return age; 
  }
  
  public String getName()
  {
     return name; 
  }
  
  public void setAge(int a) 
  {
    age = a;
  }
  
}