/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ru.skubatko.dev.otus.spring.hw04;

import ru.skubatko.dev.otus.spring.hw04.config.AppProps;
import ru.skubatko.dev.otus.spring.hw04.controller.QuizController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@EnableConfigurationProperties(AppProps.class)
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);
        QuizController controller = ctx.getBean(QuizController.class);
        controller.makeQuizzed();
        ctx.close();
    }
}
