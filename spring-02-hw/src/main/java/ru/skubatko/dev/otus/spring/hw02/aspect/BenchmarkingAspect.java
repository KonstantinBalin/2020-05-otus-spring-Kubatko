package ru.skubatko.dev.otus.spring.hw02.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class BenchmarkingAspect {

    @Around("@annotation(ru.skubatko.dev.otus.spring.hw02.aspect.Benchmark)")
    public Object benchmarkAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch clock = new StopWatch(joinPoint.toString());
        try {
            clock.start(joinPoint.toShortString());
            return joinPoint.proceed();
        } finally {
            clock.stop();
            System.out.println(clock.prettyPrint());
        }
    }
}
