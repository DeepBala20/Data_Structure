import java.util.Scanner;
public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter EmployeeId:");
        int id=sc.nextInt();
        System.out.print("Enter Employee Name:");
        sc.nextLine();
        String name=sc.nextLine();
        System.out.print("Employee Designation:");
        String designation=sc.nextLine();
        System.out.print("Empoyee Salary:");
        int salary=sc.nextInt();
        Employee_Detail e1 = new Employee_Detail(id,name,designation,salary);
        System.out.println("=======================");
        e1.printDetails();
    }
}
class Employee_Detail{
    int EmployeeId;
    String name;
    String designation;
    int salary;
    Employee_Detail(int EmployeeId,String name,String designation,int salary){
        this.EmployeeId=EmployeeId;
        this.name=name;
        this.designation=designation;
        this.salary=salary;
    }
    void printDetails(){
        System.out.println("Employee ID="+this.EmployeeId);
        System.out.println("Employee Name="+this.name);
        System.out.println("Employee Designation="+this.designation);
        System.out.println("Employee Salary="+this.salary);
    }
}