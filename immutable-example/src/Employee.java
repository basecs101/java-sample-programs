public class Employee {
    private String name;
    private int salary;
    private int id;
    private Address address;

    public Employee(String name, int salary, int id, Address address) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.address = new Address(address.flatNum, address.lane1, address.lane2
                , address.city, address.postCode);//deep clone
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }


    public int getId() {
        return id;
    }


    public Address getAddress() {
        return new Address(address.flatNum, address.lane1,
                address.lane2, address.city, address.postCode);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                ", address=" + address +
                '}';
    }
}
