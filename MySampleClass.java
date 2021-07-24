import java.util.ArrayList;
import java.util.List;


public class MySampleClass {
    public static void main(String args[]) {
      List<Employee> emps = new ArrayList<Employee>();
      emps.add(new Employee("emp1", 10, 2000));
      emps.add(new Employee("emp2", 20, 6000));
      emps.add(new Employee("emp3", 20, 5000));
      emps.add(new Employee("emp4", 10, 3000));

      System.out.println("Employees list : " + emps.toString());
      System.out.println("Salary sum for all depId :" +emps.stream().mapToInt(e->e.salary).sum());
      emps.stream().mapToInt(d -> d.depId).distinct().forEach(i-> {
    	  System.out.println("Salary sum for depId "+ i + " : "+emps.stream().filter(e->e.depId==i).mapToInt(e->e.salary).sum());
      });
    }
}

class Employee {
    public Employee (String name, int depId, int salary) {
        this.name = name;
        this.depId = depId;
        this.salary =  salary;
    }
    String name;
    int depId;
    int salary;
    
    @Override
    public String toString() {
        return String.format( "{" + name + "," + depId + "," + salary +"}");
    }
}
