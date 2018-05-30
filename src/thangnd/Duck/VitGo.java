package thangnd.Duck;

public class VitGo extends Duck {
	public VitGo() {
		flyBehavior = new NoFly();
		speakBehavior = new Mute();
	}
	public void Display() {
		System.out.println("look like vit go");
	}
}
