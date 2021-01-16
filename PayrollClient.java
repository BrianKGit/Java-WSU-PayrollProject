/*
 * Author: Brian Klein
 * Date:
 * Program:
 * Description:
 */

public class PayrollClient {
    
    public static void main(String [] args) {
        Employee e1;
        ComissionEmployee c1;
        BasePlusComissionEmployee b1;
        SalariedEmployee s1;
        
        e1 = new Employee(12345, "John", "Doe");
        c1 = new ComissionEmployee(8000, 0.15, 23980, "Tom", "Jones");
        b1 = new BasePlusComissionEmployee(1000, 9000, 0.015, 44879, "Jim", "Smith");
        s1 = new SalariedEmployee(1300, 12899, "Joe", "Smith");
        
        System.out.println("\n" + e1);
        System.out.println(e1.earnings());
        
        System.out.println("\n" + c1);
        System.out.println(c1.earnings());
        
        System.out.println("\n" + b1);
        System.out.println(b1.earnings());
        
        System.out.println("\n" + s1);
        System.out.println(s1.earnings());
    }
    
}
