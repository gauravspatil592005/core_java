class Employee{
    String name;
    double baseSalary;


     public double calculatorSalary(){
        return  baseSalary;
     }
     public void displaydeatils(){
        System.out.println("employee name"+name);
        System.out.println("employee salary"+ calculatorSalary());
     }
    }
 class FulltimeEmp extends Employee{
    double bonus;
    @Override 
    public double calculatorSalary(){
        return  baseSalary+bonus;
    }
 }
 class ParttimeEmp extends Employee{
    int hourswork;
    int hoursrate;
    @Override 
    public double calculatorSalary(){
        return  hourswork*hoursrate; 
    }
 }





public  class overriding_ex{
    public static void main(String[] args) {
      FulltimeEmp fte = new FulltimeEmp();
    fte.baseSalary=50000;
    fte.name="yogesh";
    fte.bonus=40000;
    fte.displaydeatils();
        
    ParttimeEmp pte = new ParttimeEmp();
   pte.hoursrate=500;
   pte.hourswork=7;
   pte.name="shiv";
   
    pte.displaydeatils();
    }
}