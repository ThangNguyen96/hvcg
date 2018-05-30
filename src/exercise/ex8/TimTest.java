package exercise.ex8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TimTest {
	Time t1 = new Time(6, 20, 25);
    Time t2 = new Time(12, 0, 59);
    Time t3 = new Time(12, 59, 59);
    
    @Test
    public void testGetSet() {
    	t1.setHour(1);
    	t1.setMinute(15);
    	t1.setSecond(35);
    	t1.setTime(1, 15, 35);
    	assertEquals(1, t1.getHour());
    	assertEquals(15, t1.getMinute());
    	assertEquals(35, t1.getSecond());
    }
    
    @Test
    public void testToString() {
    	assertEquals("6 : 20 : 25", t1.toString());
    }
    
    @Test
    public void testNextPreSecond() {
    	t1.nextSecond();
    	t2.nextSecond();
    	t3.nextSecond();
    	
    	assertEquals("6 : 20 : 26", t1.toString());
    	assertEquals("12 : 1 : 0", t2.toString());
    	assertEquals("13 : 0 : 0", t3.toString());
    	
    	t1.previousSecond();
    	t2.previousSecond();
    	t3.previousSecond();
    	
    	assertEquals("6 : 20 : 25", t1.toString());
    	assertEquals("12 : 0 : 59", t2.toString());
    	assertEquals("12 : 59 : 59", t3.toString());
    	
    }
    

}
