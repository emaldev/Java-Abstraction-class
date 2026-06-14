abstract class Employee{
    protected String name;
    protected double baseSalary;


      public  Employee(String name, double baseSalary){
        this.name = name;
         this.baseSalary = baseSalary;
     }

     public abstract double CalculateSalary();


     public void displayInfo(){
        System.out.println("Name: " + name + ", Salary: " + CalculateSalary());
     }

}
 

class Manager extends Employee{
    private double bonus;

    public Manager(String name, double baseSalary, double bonus){
        super(name, baseSalary);
        this.bonus = bonus;
    }
       @Override
    public double  CalculateSalary(){
        return baseSalary + bonus;
    }

    public void displayInfo(){
        System.out.println("Name: "+ name + ", baseSalary: "+ baseSalary + ", Bonus: " + bonus + CalculateSalary());
    }
}
         
class Intern extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public Intern(String name, double baseSalary, int hoursWorked, double hourlyRate){
        super(name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    
    public void displayInfo(){
        System.out.println("Name: " +  name + ", BaseSalary: " + baseSalary + ", HoursWorked: " + hoursWorked + ", HourlyRate: " + hourlyRate + CalculateSalary());
    }

         @Override 
         public double CalculateSalary(){
            return hourlyRate * hoursWorked;
         }
}
public class Main {
    public static void main(String[] args){

        Manager myManagerClass = new Manager("Mohammd", 12, 90);
        Intern myInternClass = new Intern("Omar", 12.3, 15, 90);
         
        System.out.println("<<<:::=====================================================================:::>>>");
        System.out.println("<<::++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++::>>");
        myManagerClass.displayInfo();
         System.out.println("<<::++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++::>>");
        myInternClass.displayInfo();
         System.out.println("<<::++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++::>>");
          System.out.println("<<<:::=====================================================================:::>>>");
         
    }
}
