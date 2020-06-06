/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ru.skubatko.dev.otus.spring.hw02;

import ru.skubatko.dev.otus.spring.hw02.controller.QuizController;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
@PropertySource("classpath:application.properties")
public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
        QuizController controller = ctx.getBean(QuizController.class);

        String participantName = controller.getParticipantName();
        controller.makeQuizzed(participantName);
    }
}
