import interfaces.ISell;

public class Caravan implements ISell {
    private String dateOfManufacture;
    private int numberOfWheels;
    private double rentPerMonth;
    private boolean needRepairs;
    private double maintenanceCost;

    public Caravan(String dateOfManufacture, double rentPerMonth, double maintenanceCost){
        this.dateOfManufacture = dateOfManufacture;
        this.rentPerMonth = rentPerMonth;
        this.maintenanceCost = maintenanceCost;
        this.numberOfWheels = 2;
        this.needRepairs = false;
    }

    public String getDateOfManufacture() {
        return this.dateOfManufacture;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public void setNumberOfWheels(int wheels) {
        this.numberOfWheels = wheels;
    }

    public double getRentPerMonth() {
        return this.rentPerMonth;
    }

    public void setRentPerMonth(double rent) {
        this.rentPerMonth = rent;
    }

    public boolean getNeedRepairs() {
        return this.needRepairs;
    }

    public void setNeedRepairs(boolean needRepairs) {
        this.needRepairs = needRepairs;
    }

    public double getMaintenanceCost() {
        return this.maintenanceCost;
    }
    public void setMaintenanceCost(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public double calculateProfit(double costPerMonth){
        return this.rentPerMonth - costPerMonth;
    }
}
