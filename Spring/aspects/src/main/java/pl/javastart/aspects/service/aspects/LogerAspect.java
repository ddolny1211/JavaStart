package pl.javastart.aspects.service.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import pl.javastart.aspects.model.Book;

import java.util.Arrays;

@Aspect
@Component
public class LogerAspect {

    @Before("pl.javastart.aspects.service.aspects.AspectUtil.allBookRepositoryMethods()")
    public void logInfoBefore(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.printf("Log before %s with args: %s\n",joinPoint.getSignature(), Arrays.toString(args));
    }

    @After("pl.javastart.aspects.service.aspects.AspectUtil.allBookRepositoryMethods()")
    public void logInfoAfter(JoinPoint joinPoint){
        System.out.printf("Method %s executed\n",joinPoint.getSignature());
    }

    @AfterThrowing(
            pointcut = "pl.javastart.aspects.service.aspects.AspectUtil.allBookRepositoryMethods()",
            throwing = "error")
    public void logError(JoinPoint joinPoint, Throwable error){
        System.out.printf("Method %s finished with error %s\n", joinPoint.getSignature(), error.getMessage());
    }

    @AfterReturning(
            pointcut = "execution(* pl.javastart.aspects.service.BookRepository.get(..)) && args(isbn)",
            returning = "result")
    public void logSuccess(JoinPoint joinPoint, Book result, String isbn){
        if(result!=null){
            System.out.printf("Method get() succesfully returned value %s for isbn %s\n",result, isbn);
        }
    }
}
