/*
 * Author: Brian Klein
 * Date:
 * Program:
 * Description:
 */

public class ComissionEmployee extends Employee{
    
    private double sales;
    private double rate;

    public ComissionEmployee() {
    }

    public ComissionEmployee(double sales, double rate, int id, String firstName, String lastName) {
        super(id, firstName, lastName);
        //this.firstName = "Joe-Bob";
        //this.lastName = "Johnson";
        this.sales = sales;
        this.rate = rate;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    public double earnings() {
        return sales * rate;
    }

    public String toString() {
        return super.toString() +
                "\nSales: $" + sales + 
                "\nComission Rate: " + rate;
    }
    
    
    
}
