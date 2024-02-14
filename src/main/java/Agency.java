import interfaces.ISell;

import java.util.ArrayList;

public class Agency {

    private String name;
    private ArrayList<ISell> properties;

    public Agency(String name) {
        this.name = name;
        this.properties = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<ISell> getProperties() {
        return this.properties;
    }

    public void addProperty(ISell property) {
        this.properties.add(property);
    }

    public void removeProperty(ISell property) {
        this.properties.remove(property);
    }

    public double calculateTax(ISell singleProperty) {
        double profitPerMonth = singleProperty.calculateProfit();
        double yearProfit = profitPerMonth * 12;
        return yearProfit * 0.25;
    }
    public double calculateTax(ArrayList<ISell> allProperties) {
        double profitPerMonth = 0;
        for(ISell property: allProperties){
            profitPerMonth += property.calculateProfit();
        }
        double profitPerYear = profitPerMonth * 12;
        return profitPerYear * 0.25;

    }

}
