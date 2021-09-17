package payroll;
//Create an Employee Class and give it a hoursWorked and hourlyPay
//        Then create a method to calculate each employee's pay
//        In main  - create 2 employee objects and use the method to calculate their pay
public class employee {
    public int hoursWorked;
    public int hourlyPay;


    public employee(int hoursWorked, int hourlyPay){
        this.hoursWorked = hoursWorked;
        this.hourlyPay = hourlyPay;

    }

    public int paycheck(){
        return hoursWorked * hourlyPay;
    }

    @Override
    public String toString() {
        return "employee{" +
                "hoursWorked=" + hoursWorked +
                ", hourlyPay=" + hourlyPay +
                '}';
    }
}


}
