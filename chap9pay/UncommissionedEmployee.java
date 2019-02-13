//Names: Justice Gibson, Alex Brehe, William Mayfield
// CommissionEmployee.java
// CommissionEmployee class uses methods to manipulate its 
// private instance variables.
public class UncommissionedEmployee 
{
   private final String firstName;                              
   private final String lastName;                               
   private final String socialSecurityNumber;                   
   private double grossSales; // gross weekly sales

   // five-argument constructor
   public UncommissionedEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales) 
   {
      // implicit call to Object constructor occurs here

      // if grossSales is invalid throw exception
      if (grossSales < 0.0) 
      {
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");
      }
      
      
      this.firstName = firstName;                                    
      this.lastName = lastName;                                    
      this.socialSecurityNumber = socialSecurityNumber;         
      this.grossSales = grossSales;
   } 

   // return first name
   public String getFirstName() 
   {
      return firstName;
   }

   // return last name
   public String getLastName() 
   {
      return lastName;
   }

   // return social security number
   public String getSocialSecurityNumber() 
   {
      return socialSecurityNumber;
   } 

   // set gross sales amount
   public void setGrossSales(double grossSales) 
   {
      if (grossSales < 0.0) 
      {
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");
      }

      this.grossSales = grossSales;
   } 

   // return gross sales amount
   public double getGrossSales() 
   {
      return grossSales;
   } 
   // calculate earnings
   public double earnings() 
   {
      return 10.00 * getGrossSales();
   } 

   // return String representation of CommissionEmployee object
   @Override 
   public String toString() 
   {
      return String.format("%s: %s %s%n%s: %s%n%s: %.2f", 
         "uncommissioned employee", getFirstName(), getLastName(), 
         "social security number", getSocialSecurityNumber(), 
         "gross sales", getGrossSales());
   } 
}







