package exercise.ex3;


public class testEmployee {
    public static void main(String[] args) {
        Employee t1 = new Employee(20144206, "Nguyen", "Thang", 10000);

        System.out.println("ID: " + t1.getID());
        System.out.println("Firstname: " + t1.getFirstName());
        System.out.println("Lastename: " + t1.getLastName());
        System.out.println("Fullname: " + t1.getName());
        System.out.println("Salary: " + t1.getSalary());
        System.out.println("Annual Salary: " + t1.getAnnualSalary());

        System.out.println("increase salary by 50%, new salary:  " + t1.raiseSalary(50));


        System.out.println(t1.toString());
        
        
    }
}