package com.example.tutiya.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.tutiya.controller.SearchController;

@Aspect
@Component
public class LoggingAspect {

	private static final Logger log = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Around("execution(public * com.example.tutiya.*.*.*(..))")
	public Object log(ProceedingJoinPoint jp) throws Throwable{
		
		log.info("���\�b�h�J�n�F" + jp.getSignature());
		
		Object result = jp.proceed();
		
		log.info("���\�b�h�I���F" + jp.getSignature());
		
		return result;
	}
}
