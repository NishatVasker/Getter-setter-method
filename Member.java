class Member{
    String name;
    int age;
    String number;
    String address;
    int salary;
    String department;

    public void printSalary(){
        System.out.println(salary);
    }

}

class Employee extends Member{
    String specialization;
}

class Manager extends Member{
    String department;
}

class AnsOfSoftware{
    public static void main(String[] args){
        Employee e = new Employee();
        e.name = "Nishat";
        e.age = 23;
        e.number = "1608591028";
        e.address = "Dhaka";
        e.salary = 1099;
        e.department = "Employee";

        //this will print the same
        Manager m = new Manager();
        m.name = "Salauddin al Ayubi";
        m.age = 43;
        m.number = "1902378457";
        m.address = "Anatolia";
        m.salary = 99999;
        m.department = "Manager";


    }
}		