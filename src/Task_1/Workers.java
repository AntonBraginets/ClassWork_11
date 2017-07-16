package Task_1;

public class Workers {
    int ID = 0;
    double rate = 0;
    String name;
    double hoursWorked;

    public Workers(int ID, String name, double rate) {
        this.ID = ID;
        this.rate = rate;
        this.name = name;
    }

    public Workers(int ID, String name, double rate,
                   double hoursWorked) {
        this.ID = ID;
        this.rate = rate * hoursWorked*20.8;
        this.name = name;
        this.hoursWorked = hoursWorked;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double Rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}