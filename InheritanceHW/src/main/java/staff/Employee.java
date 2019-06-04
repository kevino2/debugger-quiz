package staff;

public abstract class Employee {

    private String name;
    private String nINumber;
    private double salary;

    public Employee(String name, String nINumber, double salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNINumber() {
        return this.nINumber;
    }

    public double getSalary() {
        return this.salary;
    }

//    public double raiseSalary(raise) {
//        getSalary + raise = this.salary;
//    }

    public double payBonus() {
      return (this.salary / 100);
    }



}