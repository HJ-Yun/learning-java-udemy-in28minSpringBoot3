package com.in28minuates.in28minspringboot3springframework6.ex01.config;

import com.in28minuates.in28minspringboot3springframework6.ex01.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GameConfig {

    @Bean
    @Primary
    public GamingConsole game1(){
        return new PackMan();
    }

    @Bean
    @Qualifier("Mario")
    public GamingConsole game2(){
        return new MarioGame();
    }

    @Bean
    @Qualifier("SuperContra")
    public GamingConsole game3(){
        return new SuperContraGame();
    }

    @Bean
    @Primary
    public GameRunner gameRunner(GamingConsole gamingConsole){
        return new GameRunner(gamingConsole);
    }

    @Bean
    public GameRunner gameRunner1(GamingConsole gamingConsole){
        return new GameRunner(gamingConsole);
    }

    @Bean
    @Qualifier("Mario")
    public GameRunner gameRunner2(@Qualifier("Mario") GamingConsole gamingConsole){
        return new GameRunner(gamingConsole);
    }

    @Bean
    @Qualifier("SuperContra")
    public GameRunner gameRunner3(@Qualifier("SuperContra") GamingConsole gamingConsole){
        return new GameRunner(gamingConsole);
    }
}
