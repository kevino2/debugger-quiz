package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String nINumber, double salary, String deptName) {
        super(name, nINumber, salary);
        this.deptName = deptName;
    }

//    public String getName() {
//        return this.name;
//    }

    public String getDeptName() {
        return this.deptName;
    }


//
//    public
}







//        Add a property to store the department name in a property called deptName.
//        Create a constructor that includes all the parameters needed for Employee and deptName.
//        Add a getter method for deptName.
//        Test all methods including raiseSalary and payBonus




// staff;
//
//public class Employee {
//
//    private String name;
//    private String nINumber;
//    private int salary;
//
//    public Employee(String name, String nINumber, int salary) {
//        this.name = name;
//        this.nINumber = nINumber;
//        this.salary = salary;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public String getNINumber() {
//        return this.nINumber;
//    }
//
//    public int getSalary() {
//        return this.salary;
//    }