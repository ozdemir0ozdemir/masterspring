package ozdemir0ozdemir.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;


@Aspect
@Order(2)
@Component
public class LoggerAspect {

    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());


    @Around("execution(* ozdemir0ozdemir.beans.VehicleServices.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info(joinPoint.getSignature().toString() + " method execution start");
        Instant start = Instant.now();

        joinPoint.proceed();

        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();

        logger.info(String.format("Time took to execute the %s method : %d",
                        joinPoint.getSignature().toString(),
                        timeElapsed)
        );
    }

    @AfterThrowing(value = "execution (* ozdemir0ozdemir.beans.VehicleServices.*(..))", throwing = "ex")
    public void logException(JoinPoint joinPoint, Exception ex) {
        logger.log(Level.SEVERE, joinPoint.getSignature() + " " + ex.getMessage());
    }

    @AfterReturning(value = "execution (* ozdemir0ozdemir.beans.VehicleServices.*(..))", returning = "retVal")
    public void logException(JoinPoint joinPoint, Object retVal) {
        logger.log(Level.INFO, joinPoint.getSignature() + " " + retVal.toString());
    }
}
