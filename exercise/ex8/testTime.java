package exercise.ex8;
public class testTime {
    public static void main(String[] args) {
        Time t1 = new Time(6, 20, 25);
        Time t2 = new Time(12, 0, 59);
        Time t3 = new Time(12, 59, 59);

        System.out.println("Time1: " + t1.toString());
        System.out.println("Time2: " + t2.toString());
        System.out.println("Time3: " + t3.toString());

        System.out.println("the next second");

        System.out.println("Time1: " + t1.nextSecond().toString());
        System.out.println("Time2: " + t2.nextSecond().toString());
        System.out.println("Time3: " + t3.nextSecond().toString());

        System.out.println("the previous second");
        System.out.println("Time1: " + t1.previousSecond().toString());
        System.out.println("Time2: " + t2.previousSecond().toString());
        System.out.println("Time3: " + t3.previousSecond().toString());
        
    }
}