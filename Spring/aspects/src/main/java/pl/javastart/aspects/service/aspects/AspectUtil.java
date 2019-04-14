package pl.javastart.aspects.service.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectUtil {
    @Pointcut("execution(* pl.javastart.aspects.service.BookRepository.*(..))")
    public void allBookRepositoryMethods(){}
}
