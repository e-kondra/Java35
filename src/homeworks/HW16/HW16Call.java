package homeworks.HW16;

public class HW16Call {
    public static void main(String[] args) {
        Employee employee = new Employee("Viktor", 40, "+37069562314", "Vilnius, Tilto g.15-4",
                1830, "driver");
        Manager manager = new Manager("Mark", 36,"+37056231202", "Vilnius, Salininku g. 145",
                3560, "IT");

        employee.PrintSalary();
        manager.PrintSalary();
    }
}
