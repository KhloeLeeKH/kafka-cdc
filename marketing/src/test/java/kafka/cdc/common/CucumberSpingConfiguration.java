package kafka.cdc.common;

import io.cucumber.spring.CucumberContextConfiguration;
import kafka.cdc.MarketingApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MarketingApplication.class })
public class CucumberSpingConfiguration {}
