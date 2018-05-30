package exercise.ex3;

public class Employee {
    private int  id;
    private String firstName;
    private String lastName;
    private int salary;
    public double newSalary;


    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int slr){
        this.salary = slr;
    }

    public int getAnnualSalary() {
        return salary*12;
    }

    public int raiseSalary(int percent) {
        salary =(int)( salary *(1 + (double)percent/100));
        return salary;
     
    }

    public String toString() {
        return "Employee[id = " + id + ", name: " + firstName +" "+ lastName + ", salary =  " + salary + " ]";

    }
}