package homeworks.HW16;


class Manager extends Member{
    private String department;
    public Manager(String name, int age, String phone, String address, int salary, String department){
        super(name, age, phone, address, salary);
        this.department = department;
    }
}