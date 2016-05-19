package personsManagement.web.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import personsManagement.config.DomainAndPersistanceConfig;


@EnableAutoConfiguration
@ComponentScan(basePackages = { "personsManagement.web" })
@Import({ DomainAndPersistanceConfig.class,WebConfig.class })
public class AppConfig {

}
