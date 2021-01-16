/*
 * Author: Brian Klein
 * Date:
 * Program:
 * Description:
 */

public class BasePlusComissionEmployee extends ComissionEmployee{
    
    private double baseSalary;

    public BasePlusComissionEmployee() {
    }

    public BasePlusComissionEmployee(double baseSalary, double sales, 
            double rate, int id, String firstName, String lastName) {
        super(sales, rate, id, firstName, lastName);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double earnings() {
        double pay;
        
        pay = baseSalary + super.earnings();
        //also works
        //pay = baseSalary + this.getSales() * this.getRate();
        //also works
        //pay = baseSalary + super.getSales() * super.getRate();
        
        return pay;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nBase Salary: $" + baseSalary;
    }
    
    
    
}
