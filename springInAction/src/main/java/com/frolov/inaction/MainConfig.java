package com.frolov.inaction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PepConfig.class, CDPlayerConfig.class})
public class MainConfig {

}
