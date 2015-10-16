package conf;


import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.logging.Logger;

public class TestContextLoader implements ApplicationContextInitializer<ConfigurableApplicationContext>{


    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {

        System.setProperty("appProfile", AppProfile.build.name());
        applicationContext.getEnvironment().setActiveProfiles(AppProfile.build.name());

    }
}
