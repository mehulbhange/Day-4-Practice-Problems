public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        
        Employee employee = new Employee();
        
        if(employee.isEmployeePresent()){
            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is not present");
        }

        System.out.println("Employee Daily Wage : "+employee.calculateEmpDailyWage());
    }
}

class Employee{

    public boolean isEmployeePresent(){
        int isPresent = 1;
        int empCheck = (int) Math.floor(Math.random()*10)%2;

        if(empCheck == isPresent){
            return  true;
        }else{
            return false;
        }
    }
    public int calculateEmpDailyWage(){
        int wagePerHr = 20;
        int fullTimeHrs = 8;
        if(isEmployeePresent()){
            return wagePerHr * fullTimeHrs;
        }else{
            return 0;
        }
    }
    
}
