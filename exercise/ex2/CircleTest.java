package exercise.ex2;


import org.junit.Test;



import exercise.ex2.SimpleCircle;


import static org.junit.Assert.assertEquals;



public class CircleTest {
   @Test
	
   public void testGetArea() {
      SimpleCircle c = new SimpleCircle();

      double delta = 0.0001;

      assertEquals(Math.PI , c.getArea(), delta);
   }
   @Test
     
    public void testGetCircumference() {
       SimpleCircle c = new SimpleCircle();
        c.setRadius(2);
       double delta = 0.0001;
 
       assertEquals(2*2*Math.PI , c.getCircumference(), delta);
    }

    @Test

    public void testGetSetRadius() {
        SimpleCircle c = new SimpleCircle();

        c.setRadius(10);

        double delta = 0.0001;

        assertEquals(10 , c.getRadius(), delta);

    }
    

}


    

