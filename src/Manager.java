public class Manager extends Employee{
    private double Bonus;
    public Manager(String name, int age, String department, double salary, double bonus) {
        super(name, age, department, salary);
        this.Bonus = bonus;
    }

    public double getBonus(){
        return Bonus;
    }
    public void setBonus(double bonus){
        this.Bonus = bonus;
    }

    public double calculateTotalSalary(){
        return getSalary() + Bonus;
    }
    @Override
    public void DisplayEmployeeInfo(){
        super.DisplayEmployeeInfo();
        System.out.println("Bonus: "+Bonus);

        System.out.println("Total Salary: "+calculateTotalSalary());
    }
}
