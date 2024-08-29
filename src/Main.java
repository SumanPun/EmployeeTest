public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("John Doe",24,"IT",60000);
        Manager manager = new Manager("Peter Parker",35,"HR",80000,10000);
        System.out.println("Employee before salary raise");
        employee.DisplayEmployeeInfo();
        System.out.println();
        manager.DisplayEmployeeInfo();
        employee.raiseSalary(10);
        manager.raiseSalary(10);
        System.out.println("Employee after 10% Salary raise");
        employee.DisplayEmployeeInfo();
        System.out.println();
        manager.DisplayEmployeeInfo();
    }

}