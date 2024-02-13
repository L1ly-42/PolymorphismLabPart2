import interfaces.ISell;

public class Caravan implements ISell {
    private String dateOfManufacture;
    private int numberOfWheels;
    private double rentPerSeason;
    private boolean needRepairs;

    public Caravan(String dateOfManufacture, double rentPerSeason){
        this.dateOfManufacture = dateOfManufacture;
        this.rentPerSeason = rentPerSeason;
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

    public double getRentPerSeason() {
        return this.rentPerSeason;
    }

    public void setRentPerSeason(double rent) {
        this.rentPerSeason = rent;
    }

    public boolean getNeedRepairs() {
        return this.needRepairs;
    }

    public void setNeedRepairs(boolean needRepairs) {
        this.needRepairs = needRepairs;
    }

    public double calculateProfit(double costPerSeason){
        return this.rentPerSeason - costPerSeason;
    }
}
