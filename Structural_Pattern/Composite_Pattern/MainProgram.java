public class MainProgram {
    
    public static void main(String args[])
    {

        Employee CEO = new Employee("John","CEO", 30000);

        Employee headSales = new Employee("Robert","Head Sales", 20000);
  
        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);
  
        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);
  
        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.addEmployee(headSales);
        CEO.addEmployee(headMarketing);

        headSales.addEmployee(salesExecutive1);
        headSales.addEmployee(salesExecutive2);

        headMarketing.addEmployee(clerk1);
        headMarketing.addEmployee(clerk2);

        System.out.println(CEO); 
      
        for (Employee headEmployee : CEO.getSubordinate()) {
            System.out.println(headEmployee);
            
            for (Employee employee : headEmployee.getSubordinate()) {
                System.out.println(employee);
            }
        }	





    }


}
