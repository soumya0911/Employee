class Employee{
    String name;
    int id;
    double salary;
    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayInfo(){
        System.out.println("Employee ID:"+id);
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Salary:$"+salary);
    }
    public static void main(String[]args){
        //creating an oject of employee
        Employee emp1=new Employee("Soumya",101,150000);
        emp1.displayInfo();
    }
}