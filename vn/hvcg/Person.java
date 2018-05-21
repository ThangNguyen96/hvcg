package vn.hvcg;

public class Person{
    public static int count;

    public int sayCount(){
        count++;
        return count;
    }

    public static int sayCountStatic() {
        count++;
        return count;
    }
}