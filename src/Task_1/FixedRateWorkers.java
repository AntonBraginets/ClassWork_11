package Task_1;

public class FixedRateWorkers extends  Workers implements Interface {
    public FixedRateWorkers(int ID, String name, double rate) {
        super(ID, name, rate);
    }

    @Override
    public void monthlySalary(double rate) {
        this.rate = rate;
    }

}
