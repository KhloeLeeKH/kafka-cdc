package kafka.cdc.common;

import io.cucumber.spring.CucumberContextConfiguration;
import kafka.cdc.OrderApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderApplication.class })
public class CucumberSpingConfiguration {}
