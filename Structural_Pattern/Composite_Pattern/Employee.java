import java.util.List;
import java.util.ArrayList;

public class Employee {
    
    private String name;

    private String dept;

    private int salary;

    public List<Employee> subOrdinate;

    public Employee(String name,String dept,int salary)
    {

        this.name=name;
        this.dept=dept;
        this.salary=salary;

        subOrdinate=new ArrayList<Employee>();


    }

    public void addEmployee(Employee e)
    {

        subOrdinate.add(e);

    }

    public void removeEmployee(Employee e)
    {

        subOrdinate.remove(e);

    }

    public List<Employee> getSubordinate()
    {

        return subOrdinate;

    }

    public String toString()
    {

        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");

    }


}
