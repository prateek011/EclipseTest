import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
 
@Aspect
public class LoggingAspect {
 
	@Before("execution(* src.main.java.aspect.HelloWorld.sayHello(..))")
    public void testBefore2(){
        System.out.println("Yeeha");
    }
	
	@Pointcut("execution(* *.sayHello(..))")
    public void logging() {}
 
    @Around("logging()")
    public Object logging(ProceedingJoinPoint thisJoinPoint) throws Throwable {
        System.out.println("Before " + thisJoinPoint.getSignature());
        Object ret = thisJoinPoint.proceed();
        System.out.println("After " + thisJoinPoint.getSignature());
 
        return ret;
    }
}