class Employee{
    String name;
    int id;
    double salary;
    int experience;
    public Employee(String name,int id,double salary,int experience){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.experience=experience;
    }
    public void displayInfo(){
        System.out.println("Employee ID:"+id);
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Salary:$"+salary);
        System.out.println("Employee exxperience:"+experience);
    }
    public static void main(String[]args){
        //creating an oject of employee
        Employee emp1=new Employee("Soumya",101,150000,5);
        emp1.displayInfo();
    }
}