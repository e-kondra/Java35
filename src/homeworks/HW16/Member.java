package homeworks.HW16;

abstract class Member {
    protected String name;
    protected int age;
    protected String phone;
    protected String address;
    protected int salary;

    public Member(String name, int age, String phone, String address, int salary){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }

    public void PrintSalary(){
        System.out.println("Salary for " + name + " is " + salary);
    }
}