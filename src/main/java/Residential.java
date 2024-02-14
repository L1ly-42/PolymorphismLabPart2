public class Residential extends Building {

    private String houseType;
    private int numberOfTenants;
    private int numberOfComplaints;

    public Residential(String houseType, int numberOfTenants,
                       int numberOfRooms, int numberOfFloors, String dateOfConstruction,
                       double rentPerMonth, double maintenanceCost){

        super(numberOfRooms,numberOfFloors,dateOfConstruction,rentPerMonth, maintenanceCost);
        this.houseType = houseType;
        this.numberOfTenants = numberOfTenants;
        this.numberOfComplaints = 0;
    }

    public String getHouseType() {
        return this.houseType;
    }
    public void setHouseType(String type) {
        this.houseType = type;
    }

    public int getNumberOfTenants() {
        return this.numberOfTenants;
    }
    public void setNumberOfTenants(int tenants) {
        this.numberOfTenants = tenants;
    }

    public int getNumberOfComplaints() {
        return this.numberOfComplaints;
    }
    public void setNumberOfComplaints(int complaints) {
        this.numberOfComplaints = complaints;
    }
}
