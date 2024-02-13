import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CaravanTest {

    private Caravan rv;

    @BeforeEach
    public void setUp(){
        rv = new Caravan("21/11/2007",800);
    }

    @Test
    public void canGetDateOfManufacture(){
        assertThat(rv.getDateOfManufacture()).isEqualTo("21/11/2007");
    }

    @Test
    public void canGetNumberOfWheels(){
        assertThat(rv.getNumberOfWheels()).isEqualTo(2);
    }

    @Test
    public void canSetNumberOfWheels(){
        rv.setNumberOfWheels(4);
        assertThat(rv.getNumberOfWheels()).isEqualTo(4);
    }

    @Test
    public void canGetRentPerSeason(){
        assertThat(rv.getRentPerSeason()).isEqualTo(800);
    }

    @Test
    public void canSetRentPerSeason(){
        rv.setRentPerSeason(10);
        assertThat(rv.getRentPerSeason()).isEqualTo(10);
    }

    @Test
    public void canGetNeedRepairs(){
        assertThat(rv.getNeedRepairs()).isEqualTo(false);
    }

    @Test
    public void canSetNeedRepairs(){
        rv.setNeedRepairs(true);
        assertThat(rv.getNeedRepairs()).isEqualTo(true);
    }

    @Test
    public void canCalculateProfit(){
        double profit = rv.calculateProfit(300);
        assertThat(profit).isEqualTo(500);
    }



}
