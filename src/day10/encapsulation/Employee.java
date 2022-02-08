package day10.encapsulation;

public class Employee {
    //POJO - plane old java object
    private String name;
    private int phoneNo;
    private double salary;
    private String address;

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setPhoneNo(int phoneNo){
        this.phoneNo = phoneNo;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setAddress(String address){
        this.address = address;
    }
    //getters
    public String getName(){
        return this.name;
    }
    public int getPhoneNo(){
       return this.phoneNo;
    }
    public double getSalary(){
        return this.salary ;
    }
    public String getAddress(){
        return this.address ;
    }


}

class TestEmployee{
    public static void main(String[] args) {
        Employee employee1 = new Employee();
            employee1.setName("Jhon");
            employee1.setPhoneNo(1212122);
            employee1.setSalary(10000.0);
            employee1.setAddress("London");

        Employee employee2 = new Employee();
            employee2.setName("Mark");
            employee2.setPhoneNo(3333);
            employee2.setSalary(20000.0);
            employee2.setAddress("NY");

        System.out.println("Details of Jhon -> "+ employee1.getName()
                + " - "+ employee1.getSalary() + "--"+employee1.getPhoneNo() +"--"+employee1.getAddress());
        System.out.println("Details of Mark -> "+ employee2.getName()
                + " - "+ employee2.getSalary() + "--"+employee2.getPhoneNo() +"--"+employee2.getAddress());



    }
}
