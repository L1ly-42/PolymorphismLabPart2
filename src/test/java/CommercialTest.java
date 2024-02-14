import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CommercialTest {

    private Commercial bakery;

    @BeforeEach
    public void setUp(){
        bakery = new Commercial("Doughnotts","bakery",2,
                                2,"04/07/2015",1000,500);
    }

 // A set of tests specific to Commercial subclass

    @Test
    public void canGetCompanyName(){
        assertThat(bakery.getCompanyName()).isEqualTo("Doughnotts");
    }

    @Test
    public void canGetBusinessType(){
        assertThat(bakery.getBusinessType()).isEqualTo("bakery");
    }

    @Test
    public void canSetCompanyName(){
        bakery.setCompanyName("Rudy's Pizza");
        assertThat(bakery.getCompanyName()).isEqualTo("Rudy's Pizza");
    }

    @Test
    public void canSetBusinessType(){
        bakery.setBusinessType("pizzeria");
        assertThat(bakery.getBusinessType()).isEqualTo("pizzeria");
    }

// A set of tests to test the Building parent class

    @Test
    public void canGetNumberOfRooms(){
        assertThat(bakery.getNumberOfRooms()).isEqualTo(2);
    }

    @Test
    public void canGetNumberOfFloors(){
        assertThat(bakery.getNumberOfFloors()).isEqualTo(2);
    }


    @Test
    public void canGetDateOfConstruction(){
        assertThat(bakery.getDateOfConstruction()).isEqualTo("04/07/2015");
    }

    @Test
    public void canGetRentPerMonth(){
        assertThat(bakery.getRentPerMonth()).isEqualTo(1000);
    }

    @Test
    public void canSetRentPerMonth(){
        bakery.setRentPerMonth(1200);
        assertThat(bakery.getRentPerMonth()).isEqualTo(1200);
    }

    @Test
    public void canGetMaintenanceCost(){
        assertThat(bakery.getMaintenanceCost()).isEqualTo(500);
    }

    @Test
    public void canSetMaintenanceCost() {
        bakery.setMaintenanceCost(800);
        assertThat(bakery.getMaintenanceCost()).isEqualTo(800);
    }


    @Test
    public void canGetNeedRepairs(){
        assertThat(bakery.getNeedRepairs()).isEqualTo(false);
    }

    @Test
    public void canSetNeedRepairs(){
        bakery.setNeedRepairs(true);
        assertThat(bakery.getNeedRepairs()).isEqualTo(true);
    }


}

