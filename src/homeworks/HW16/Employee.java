package homeworks.HW16;


class Employee extends Member{
    private String specialization;
    public Employee(String name, int age, String phone, String address, int salary, String specialization){
        super(name, age, phone, address, salary);
        this.specialization = specialization;
    }
}