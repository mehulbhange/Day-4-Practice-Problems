public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        
        Employee employee = new Employee();
        employee.isEmployeePresent();
    }
}

class Employee{

    public void isEmployeePresent(){
        int isPresent = 1;
        int empCheck = (int) Math.floor(Math.random()*10)%2;

        if(empCheck == isPresent){
            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is not present");
        }
    }
}
