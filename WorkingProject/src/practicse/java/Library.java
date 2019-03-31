package practicse.java;
import java.util.HashMap;
public class Library
{
 
  public Library()
  {
    
  }
  public void getFinishedBooks(HashMap<String,Boolean> library)
  {
        if (library.size() < 1)
    {
      System.out.println("Hey !! Library details are Empty");
    }
    else
    {
      for (String book: library.keySet())
      {
        if (library.get(book)==true)
        {
          System.out.println (book);
        }
      }
    }
      
    
  }
  public static void main (String args [])
  {
    HashMap<String,Boolean> mybooks = new HashMap<String,Boolean>();
    mybooks.put("Road Down The Funnel",true);
    mybooks.put("Rat: A Biology",false);
    mybooks.put("TimeIn",true);
    mybooks.put("3D Food Printing",false);
    Library myLibrary = new Library();
    myLibrary.getFinishedBooks(mybooks);
    
    
    
  }
}