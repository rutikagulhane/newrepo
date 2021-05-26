public class Employee {


    private String name;
    private int emp_id;
    private int salary;
    private String dept;

    public Employee(String name, int emp_id, int salary, String dept) {
        this.name = name;
        this.emp_id = emp_id;
        this.salary = salary;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getSalary() {

        return salary;
    }

    public void setSalary(int salary) {
        if(salary>60000)
        {
            System.out.println("Invalid");
            return;
        }
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }



}
