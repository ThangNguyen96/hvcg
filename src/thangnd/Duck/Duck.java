package thangnd.Duck;

public abstract class Duck {
	FlyBehavior flyBehavior;
	SpeakBehavior speakBehavior;
	
	public Duck() {
		
	}
	
	public abstract void Display();
	public void Swim() {
		System.out.println("i can swim because I can float");
	}
	
	public void performSpeak() {
		speakBehavior.speak();
	}
	public void performFly() {
		flyBehavior.fly();
	}
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	public void setSpeakBehavior(SpeakBehavior sb) {
		speakBehavior = sb;
	}

}
