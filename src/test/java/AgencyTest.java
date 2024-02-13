import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AgencyTest {

    private Agency agency;
    private Commercial bakery;
    private Residential cottage;
    private Commercial restaurant;
    private Caravan rv;

    @BeforeEach
    public void setUp() {
        agency = new Agency("BNTA Agency");

        bakery = new Commercial("Doughnotts","bakery",2,
                2,"04/07/2015",1000);

        cottage = new Residential("cottage", 4, 6, 2,
                "23/07/2000", 400);
        restaurant = new Commercial("Rudy's Pizza","pizzeria",1,
                1,"27/12/2023",1500);

        rv = new Caravan("21/11/2007",800);
    }

    @Test
    public void canGetName(){
        assertThat(agency.getName()).isEqualTo("BNTA Agency");
    }

    @Test
    public void canGetProperties(){
        assertThat(agency.getProperties().size()).isEqualTo(0);
    }

    @Test
    public void canAddProperties(){
        agency.addProperty(bakery);
        agency.addProperty(rv);
        assertThat(agency.getProperties().size()).isEqualTo(2);
    }

    @Test
    public void canRemoveProperties(){
        agency.addProperty(bakery);
        agency.addProperty(cottage);
        agency.addProperty(rv);
        agency.addProperty(restaurant);
        agency.removeProperty(cottage);
        assertThat(agency.getProperties().size()).isEqualTo(3);
    }

}
