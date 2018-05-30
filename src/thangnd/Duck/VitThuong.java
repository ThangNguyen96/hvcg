package thangnd.Duck;

public class VitThuong extends Duck {
	public VitThuong() {
		flyBehavior = new NoFly();
		speakBehavior = new Quack();
	}
	public void Display() {
		System.out.println("look like vit thuong");
	}
}
