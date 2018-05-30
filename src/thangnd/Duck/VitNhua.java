package thangnd.Duck;

public class VitNhua extends Duck {
	public VitNhua() {
		flyBehavior = new NoFly();
		speakBehavior = new Squeak();
	}
	public void Display() {
		System.out.println("look like vit nhua");
	}
}
