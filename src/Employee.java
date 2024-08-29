public class Employee {

    private String Name;
    private int Age;
    private String Department;
    private double Salary;

    public Employee(String name, int age, String department, double salary){
        this.Name = name;
        this.Age = age;
        this.Department = department;
        this.Salary = salary;
    }

    public void setName(String name){
        this.Name = name;
    }
    public void setAge(int age){
        this.Age = age;
    }
    public void setDepartment(String department){
        this.Department = department;
    }
    public void setSalary(double salary){
        this.Salary = salary;
    }

    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }
    public String getDepartment(){
        return Department;
    }
    public double getSalary(){
        return Salary;
    }

    public void raiseSalary(double percentage){
        Salary += Salary * (percentage / 100);
    }

    public void DisplayEmployeeInfo(){
        System.out.println("Employee Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Department: " + Department);
        System.out.println("Salary: " + Salary);
    }

}
