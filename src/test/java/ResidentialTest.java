import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ResidentialTest {

    private Residential cottage;

    @BeforeEach
    public void setUp() {
        cottage = new Residential("cottage", 4, 6, 2,
                "23/07/2000", 400,100);
    }

    @Test
    public void canGetHouseType() {
        assertThat(cottage.getHouseType()).isEqualTo("cottage");
    }

    @Test
    public void canSetHouseType() {
        cottage.setHouseType("bungalow");
        assertThat(cottage.getHouseType()).isEqualTo("bungalow");
    }

    @Test
    public void canGetNumberOfTenants() {
        assertThat(cottage.getNumberOfTenants()).isEqualTo(4);
    }

    @Test
    public void canSetNumberOfTenants() {
        cottage.setNumberOfTenants(3);
        assertThat(cottage.getNumberOfTenants()).isEqualTo(3);
    }

    @Test
    public void canGetNumberOfComplaints() {
        assertThat(cottage.getNumberOfComplaints()).isEqualTo(0);
    }

    @Test
    public void canSetNumberOfComplaints() {
        cottage.setNumberOfComplaints(3);
        assertThat(cottage.getNumberOfComplaints()).isEqualTo(3);
    }

    @Test
    public void canCalculateProfit(){
        double profit = cottage.calculateProfit(200);
        assertThat(profit).isEqualTo(200);
    }
}




