//Names: Justice Gibson, Alex Brehe, William Mayfield
// Exercise 9.3 Solution: BasePlusCommissionEmployee.java
// Testing class BasePlusCommissionEmployee.

public class BasePlusEmployeeTest 
{
   public static void main(String[] args) 
   {
      // instantiate BasePlusCommissionEmployee object
      BasePlusCommissionEmployee employee = 
         new BasePlusCommissionEmployee(
         "Hubba", "Bubba", "333-33-3333", 5000, .04, 300);
      
      // get base-salaried commission employee data
      System.out.printf(
         "Commissioned Employee information obtained by get methods: %n%n");
      System.out.printf("%s %s%n", "First name is",
         employee.getFirstName());
      System.out.printf("%s %s%n", "Last name is", 
         employee.getLastName());
      System.out.printf("%s %s%n", "Social security number is", 
         employee.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is", 
         employee.getGrossSales());
      System.out.printf("%s %.2f%n", "Commission rate is",
         employee.getCommissionRate());
      System.out.printf("%s %.2f%n%n", "Base salary is",
         employee.getBaseSalary());
      
      // instantiate BasePlusCommissionEmployee object
      BasePlusUncommissionEmployee ucemployee = 
         new BasePlusUncommissionEmployee(
         "Bubba", "Hubba", "123-45-6789", 100, 5000);
      
      // get base-salaried commission employee data
      System.out.printf(
         "Uncommissioned Employee information obtained by get methods: %n%n");
      System.out.printf("%s %s%n", "First name is",
         ucemployee.getFirstName());
      System.out.printf("%s %s%n", "Last name is", 
         ucemployee.getLastName());
      System.out.printf("%s %s%n", "Social security number is", 
         ucemployee.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is", 
         ucemployee.getGrossSales());
      System.out.printf("%s %.2f%n", "Base salary is",
         ucemployee.getBaseSalary());

      employee.setBaseSalary(1000); // set base salary
      
      ucemployee.setBaseSalary(1000);
      
      System.out.printf("%n%s:%n%n%s%n", 
         "Updated commissioned employee information obtained by toString", 
         employee.toString());
      System.out.printf("%n%s:%n%n%s%n", 
         "Updated uncommissioned employee information obtained by toString", 
         ucemployee.toString());
   }
}
