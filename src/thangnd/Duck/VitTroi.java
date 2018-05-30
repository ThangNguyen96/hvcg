package thangnd.Duck;

public class VitTroi extends Duck {
	public VitTroi() {
		flyBehavior = new FlyWithWings();
		speakBehavior = new Quack();
	}
	public void Display() {
		System.out.println("look like vit troi");
	}
}
