//Names: Justice Gibson, Alex Brehe, William Mayfield
// BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee using composition.

public class BasePlusUncommissionEmployee 
{
   private UncommissionedEmployee uncommissionedEmployee; // composition
   private double baseSalary; // base salary per week

   // six-argument constructor
   public BasePlusUncommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, double baseSalary) 
   {
          if (baseSalary < 0.0) 
          {
             throw new IllegalArgumentException(
                "Base salary must be >= 0.0");
          }
    
          uncommissionedEmployee = 
             new UncommissionedEmployee(firstName, lastName, socialSecurityNumber, grossSales);
    
          this.baseSalary = baseSalary;
   }

   // return first name
   public String getFirstName() 
   {
      return uncommissionedEmployee.getFirstName();
   }

   // return last name
   public String getLastName() 
   {
      return uncommissionedEmployee.getLastName();
   } 

   // return social security number
   public String getSocialSecurityNumber() 
   {
      return uncommissionedEmployee.getSocialSecurityNumber();
   } 

   // set commission employee's gross sales amount
   public void setGrossSales(double grossSales) 
   {
      uncommissionedEmployee.setGrossSales(grossSales);
   } 

   // return commission employee's gross sales amount
   public double getGrossSales() 
   {
      return uncommissionedEmployee.getGrossSales();
   } 
  
   // set base salary
   public void setBaseSalary(double baseSalary) 
   {
      if (baseSalary < 0.0) 
      {
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");
      }

      this.baseSalary = baseSalary;
   }

   // return base-salaried commission employee's base salary
   public double getBaseSalary() 
   {
      return baseSalary;
   }

   // calculate base-salaried commission employee's earnings
   public double earnings() 
   {
      return getBaseSalary() + uncommissionedEmployee.earnings();
   } 

   // return String representation of BasePlusCommissionEmployee
   @Override
   public String toString() 
   {
      return String.format("%s %s\n%s: %.2f", "base-salaried", 
         uncommissionedEmployee.toString(), "base salary", getBaseSalary());
   } 
}
