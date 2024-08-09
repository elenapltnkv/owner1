package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${device}.properties",
        "classpath:mobile.properties"
})
public interface MobileConfg extends Config {

    @Key("device.name")
    String getDeviceName();

    @Key("platform.name")
    String getPlatformName();

    @Key("platform.version")
    String getPlatformVersion();
}
