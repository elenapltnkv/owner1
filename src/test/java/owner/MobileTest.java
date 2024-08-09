package owner;

import config.MobileConfg;
import config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MobileTest {
    @Test
    public void mobileTest(){
        MobileConfg confg = ConfigFactory.create(MobileConfg.class, System.getProperties());
        assertThat(confg.getPlatformName()).isEqualTo("IOS");
        assertThat(confg.getDeviceName()).isEqualTo("iPhone 15");
    }
}
