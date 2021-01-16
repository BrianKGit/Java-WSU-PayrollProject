/*
 * Author: Brian Klein
 * Date: 9/20/17
 * Program: SalariedEmployee.java
 * Description:
 */

public class SalariedEmployee extends Employee{
    
    private double salary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(double salary, int id, String firstName, 
            String lastName) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    //override earnings() method
    @Override
    public double earnings() {
        return this.salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nFixed Salary: $" + salary;
    }
    
}
