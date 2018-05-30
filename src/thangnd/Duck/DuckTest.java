package thangnd.Duck;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DuckTest {
	Duck vth = new VitThuong();
	Duck vtr = new VitTroi();
	Duck vn = new VitNhua();
	Duck vg = new VitGo();
	
	@Test
	public void testPerformFlySpeakDisplay() {
		assertEquals("I am unable to fly", vth.performFly());
		assertEquals("quack quack!!", vth.performSpeak());
		assertEquals("look like vit thuong", vth.Display());
		
		assertEquals("i can fly i'm proud that i can fly !!", vtr.performFly());
		assertEquals("quack quack!!", vtr.performSpeak());
		assertEquals("look like vit troi", vtr.Display());
		
		assertEquals("I am unable to fly", vn.performFly());
		assertEquals("squeak squeak!!", vn.performSpeak());
		assertEquals("look like vit nhua", vn.Display());
		
		assertEquals("I am unable to fly", vg.performFly());
		assertEquals("<<S..I...L..E..N..C..E..>>", vg.performSpeak());
		assertEquals("look like vit go", vg.Display());
		
	}
	
}
