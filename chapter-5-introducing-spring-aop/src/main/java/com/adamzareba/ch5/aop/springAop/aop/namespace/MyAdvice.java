package com.adamzareba.ch5.aop.springAop.aop.namespace;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {

    public void simpleBeforeAdvice(JoinPoint joinPoint) {
        System.out.println("Executing: " + joinPoint.getSignature().getDeclaringTypeName() + " " + joinPoint.getSignature().getName());
    }

    public void simpleBeforeAdvice(JoinPoint joinPoint, int intValue) {
        if (intValue != 100) {
            System.out.println("Executing: " + joinPoint.getSignature().getDeclaringTypeName() + " " + joinPoint.getSignature().getName() + " argument: " + intValue);
        }
    }

    public Object simpleAroundAdvice(ProceedingJoinPoint pjp, int intValue) throws Throwable {
        System.out.println("Before execution: " + pjp.getSignature().getDeclaringTypeName() + " " + pjp.getSignature().getName() + " argument: " + intValue);

        Object retVal = pjp.proceed();

        System.out.println("After execution: " + pjp.getSignature().getDeclaringTypeName() + " " + pjp.getSignature().getName() + " argument: " + intValue);

        return retVal;
    }
}