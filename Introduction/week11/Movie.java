package week11;

import java.util.Date;

/*
 * @author Dr.Im
 * Course: ITEC2120 Fall 2012
 * This class describes a movie
 * Purpose - to use it in our Media program
 */
public class Movie {

  private String title;
  private String genre;
  private Date releaseDate;
  private double rating;

  public Movie(String t, double r) 
  { 
    title = t;
    rating = r;
  }
  
  /*
   * Getter for the movie title
   * @return Return title string
   */ 
  public String getTitle() 
  {
     return title; 
  }
  
  public double getRating() 
  {
     return rating; 
  }
  
  /*
   * @param t - sets the title of the movie 
   */ 
  public void setTitle(String t)
  {
     title = t; 
  }
  
  public void setRating(double r)
  {
     rating = r; 
  }
  
  
  public static void main(String[]args) 
  { 
    Movie m = new Movie("Hostel",9.9);
    System.out.println(m.getTitle() + " " + m.getRating());
    
    if (1+1 == 2)
    {
      System.out.println("Hello!");
    }
  } 
  
  
  
}
