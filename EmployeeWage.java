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

        System.out.println("Employee wages : "+ 20* employee.empWorkingHrs());

        System.out.println("Employee Daily Wage using switch case : "+ employee.withSwitchCase());

        System.out.println("Monthly wages : "+employee.monthlyWages());

        System.out.println("Total monthly wage :"+ employee.totalMonthlyWage());
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
    public int empWorkingHrs(){
        int isFullTime = 1;
        int isPartTime = 2;
        int fullTimeHrs = 8;
        int partTimeHrs = 4;
        int empCheck = (int) Math.floor(Math.random()*10)%3;

        if(empCheck == isFullTime)
            return fullTimeHrs;
        else if(empCheck == isPartTime)
            return partTimeHrs;
        else
            return 0;
    }

    public int withSwitchCase(){
        int hrs = empWorkingHrs();
        int wagePerHr = 20;
        switch(hrs){
            case 8:
                return wagePerHr * hrs;
            case 4:
                return wagePerHr * hrs;
            default:
                return 0;

        }
    }
    public int monthlyWages(){
        int totalWorkingDays = 20;
        int wagePerHr = 20;
        int totalHrs = 0;
        for(int i=0;i<totalWorkingDays;i++){
            totalHrs += empWorkingHrs();
        }
        return totalHrs*wagePerHr;
    }
    public int totalMonthlyWage(){
        int totalWorkingDays = 20;
        int wagePerHr = 20;
        int totalWorkingHrs = 100;
        int days = 0;
        int hrs = 0;

        while (days < totalWorkingDays && hrs < totalWorkingHrs){
            hrs += empWorkingHrs();
            days++;
        }
        return wagePerHr * hrs;

    }
}
