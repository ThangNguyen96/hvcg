package thangnd.Duck;

public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am VIT THUONG");
		Duck vitThuong = new VitThuong();
		vitThuong.performFly();
		vitThuong.performSpeak();
		vitThuong.Display();
		System.out.println("=======================================");
		System.out.println("I am VIT TROI");
		Duck vitTroi = new VitTroi();
		vitTroi.performFly();
		vitTroi.performSpeak();
		vitTroi.Display();
		System.out.println("=======================================");
		System.out.println("I am VIT NHUA");
		Duck vitNhua = new VitNhua();
		vitNhua.performFly();
		vitNhua.performSpeak();
		vitNhua.Display();
		System.out.println("=======================================");
		System.out.println("I am VIT GO");
		Duck vitGo = new VitGo();
		vitGo.performFly();
		System.out.println("when I am equipted with rocket");
		vitGo.setFlyBehavior(new FlyRocketPowered());
		vitGo.performFly();
		vitGo.performSpeak();
		System.out.println("when I am equipted with sound");
		vitGo.setSpeakBehavior(new Squeak());
		vitGo.performSpeak();
		vitGo.Display();
		
		

	}

}
