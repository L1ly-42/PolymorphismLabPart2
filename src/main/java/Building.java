public abstract class Building {
    private int numberOfRooms;
    private String dateOfConstruction;
    private int numberOfFloors;
    private double rentPerMonth;
    private boolean needRepairs;

    public Building(int numberOfRooms, int numberOfFloors, String dateOfConstruction, double rentPerMonth) {
        this.numberOfRooms = numberOfRooms;
        this.numberOfFloors = numberOfFloors;
        this.dateOfConstruction = dateOfConstruction;
        this.rentPerMonth = rentPerMonth;
        this.needRepairs = false;

    }

// Properties with only getters as they are fairly permanent qualities
    public int getNumberOfRooms() {
        return this.numberOfRooms;
    }
    public int getNumberOfFloors() {
        return this.numberOfFloors;
    }
    public String getDateOfConstruction() {
        return dateOfConstruction;
    }

// Properties with both getters and setters
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
}

