package com.zero.aspectj.plugin.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * Created by woshi on 2018/6/6.
 */
@Aspect
public class CheckLoginAspect {

    @Pointcut("execution(@com.zero.aspectj.plugin.test.Log * *(..))")
    public void jumpPointCut() {

    }

    @Around("jumpPointCut()")
    public void process(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        android.util.Log.e("plugin", "plugin is successful");
        joinPoint.proceed();
    }
}
