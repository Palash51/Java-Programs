public class Encapsulate
{ 
   private String geekName;
    private int geekRoll;
    private int geekAge;
 
    public int getAge() 
    {
      return geekAge;
    }
  
    public String getName() 
    {
      return geekName;
    }
     
    public int getRoll() 
    {
       return geekRoll;
    }
  
    public void setAge( int newAge)
    {
      geekAge = newAge;
    }
    public void setName(String newName)
    {
      geekName = newName;
    }
     
    //set method for roll to access 
    //private variable geekRoll
    public void setRoll( int newRoll) 
    {
      geekRoll = newRoll;
    }



public class TestEncapsulation
{   
public static void main(String[] args) 
    {
        Encapsulate obj = new Encapsulate();
         
        //setting values of the variables 
        obj.setName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);
         
        //Displaying values of the variables
        System.out.println("Geek's name: " + obj.getName());
        System.out.println("Geek's age: " + obj.getAge());
        System.out.println("Geek's roll: " + obj.getRoll());
         
        //Direct access of geekRoll is not possible
        //due to encapsulation
        System.out.println("Geek's roll: " + obj.geekName);
         
    }
}
}
