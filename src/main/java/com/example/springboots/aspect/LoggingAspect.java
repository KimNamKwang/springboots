package com.example.springboots.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import java.util.logging.Logger;

@Aspect
@Component

public class LoggingAspect {
    private Logger logger = Logger.getLogger(getClass().getName());

    /* 모든 서비스 *Service 안의 *(..)모든 function안의 .. 파라미터 */
    // com.example.springboots.service.*Service.*(..)
    @Before(value = "execution(* com.example.springboots.service.*Service.*(..))")
    /* controller의 Mapping으로 url을 걸어준것 처럼 언제 작동되는지를 걸어준다 */
    public void logBefore(JoinPoint joinPoint) {
        logger.info("Entering " + joinPoint.getTarget().getClass().getSimpleName()
                + "'s" + joinPoint.getSignature().getName());/* 클래스와 해당하는 펑션을 역추적해서 이름을 가져오는 것 */

        Object[] args = joinPoint.getArgs(); // params
        for (int i = 0; i < args.length; i++) {
            logger.info("LoggingAspect args[" + i + "] --> " + args[i]);
            // DB에 넣어주는 방법도 있다.
        }
    }

}
