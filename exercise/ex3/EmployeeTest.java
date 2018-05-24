package exercise.ex3;


import org.junit.Test;



import exercise.ex3.Employee;


import static org.junit.Assert.assertEquals;



public class EmployeeTest {
   @Test
	
   public void testAnnualySalary() {
      Employee e = new Employee();
      e.setSalary(10);
      assertEquals(12*10 , e.getAnnualSalary());
   }
 }
    

