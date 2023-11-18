package com.example.springbootinpractice;

import com.example.springbootinpractice.configurationproperties.AppProperties;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

@SpringBootApplication
//@EnableConfigurationProperties(AppProperties.class)
public class SpringBootInPracticeApplication {

    private static Logger logger =
            LoggerFactory.getLogger(SpringBootInPracticeApplication.class);

    // private final Log loger = LogFactory.getLog(getClass());
    // protected final Logger logger = LoggerFactory.getLogger(getClass());
    // private static final Logger log = LoggerFactory.getLogger(SpringBootInPracticeApplication.class);


    /*@Override
    public void run(String... args) throws Exception {
        logger.info("SpringBootInPracticeApplication CommandLineRunner " +
                "has been executed");
    }*/

    public static void main(String[] args) {

        logger.info("SpringBootInPractice application started" +
                "successfully with Log4j2 configuration. ");

      /*  Properties properties = new Properties();
        properties.setProperty("spring.config.on-not-found", "ignore");
        SpringApplication application = new SpringApplication(SpringBootInPracticeApplication.class);
        application.setDefaultProperties(properties);
        application.run(args);*/

        SpringApplication.run(SpringBootInPracticeApplication.class, args);

/*
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(SpringBootInPracticeApplication.class, args);
        AppService appService = applicationContext.getBean(AppService.class);
        log.info(appService.getAppProperties().toString());*/

       /* DbConfiguration dbConfiguration = applicationContext.getBean(DbConfiguration.class);
        log.info(dbConfiguration.toString());*/
        //SpringApplication.run(SpringBootInPracticeApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            logger.info("CommandLineRunner executed as a bean" +
                    " definition with " + args.length + " arguments");
            for (int i = 0; i < args.length; i++) {
                logger.info("Arguments: " + args[i]);
            }
        };
    }

}
