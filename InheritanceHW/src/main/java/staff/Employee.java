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

    public void setName(String name) {
        if ( (!name.equals(""))  && (name != null) ){
        this.name = name;
        }
    }

    public String getNINumber() {
        return this.nINumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double raise) {
        if (raise >= 0){
            this.salary += raise;
        }
    }

    public double payBonus() {
      return (this.salary / 100);
    }



}