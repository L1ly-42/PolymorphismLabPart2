import interfaces.ISell;

import java.util.ArrayList;

public class Agency {

    private String name;
    private ArrayList<ISell> properties;

    public Agency(String name){
        this.name = name;
        this.properties = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<ISell> getProperties(){
        return this.properties;
    }

    public void addProperty(ISell property){
        this.properties.add(property);
    }

    public void removeProperty(Building building){
        this.properties.remove(building);
    }

}
