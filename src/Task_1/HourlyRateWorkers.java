package Task_1;

public class HourlyRateWorkers extends Workers implements Interface {
    public HourlyRateWorkers(int ID, String name, double rate,
                             double hoursWorked) {
        super(ID, name, rate, hoursWorked);

        //double pay = rate * 20.8 * hoursWorked;
    }

    @Override
    public void monthlySalary(double rate) {
        this.rate = rate * 20.8 * 8;
    }


}
