package com.example.treedb.infastructure

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.time.Clock

@Configuration
class AppConfig {

    @Bean
    fun clock(): Clock = Clock.systemUTC()
}