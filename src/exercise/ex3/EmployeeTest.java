package exercise.ex3;


import org.junit.Test;



import exercise.ex3.Employee;


import static org.junit.Assert.assertEquals;



public class EmployeeTest { 
	 Employee e = new Employee(1, "thang", "nguyen", 10);
   @Test
   
   public void testEmployeeGetSet() {
	   assertEquals(1, e.getID());
	   assertEquals("thang", e.getFirstName());
	   assertEquals("nguyen", e.getLastName());
	   assertEquals(10, e.getSalary());
	   assertEquals(12*10 , e.getAnnualSalary());
	   e.setSalary(12);
	   assertEquals(12*12 , e.getAnnualSalary());
	   assertEquals("thangnguyen", e.getName());
	   assertEquals(18, e.raiseSalary(50));
	   
   }
   
   @Test
   
   public void testToString() {
	   assertEquals("Employee[id = 1, name: thang nguyen, salary =  10 ]", e.toString());
   }
   
 }
    

