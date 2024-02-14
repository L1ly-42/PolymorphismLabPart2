public class Commercial extends Building {

    private String companyName;
    private String businessType;

    public Commercial(String companyName,String businessType, int numberOfRooms, int numberOfFloors, String dateOfConstruction,
                      double rentPerMonth, double maintenanceCost){
        super(numberOfRooms, numberOfFloors, dateOfConstruction, rentPerMonth, maintenanceCost);
        this.companyName = companyName;
        this.businessType = businessType;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBusinessType() {
        return this.businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }
}
