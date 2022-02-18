package com.segovelo.async;

import java.lang.reflect.Method;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;

/** 
* 18 Feb 2022 10:22:57
* @Javadoc TODO 
*
* @author Sebastian Vergara Losada  **/

public class CustomAsyncExceptionHandler implements AsyncUncaughtExceptionHandler {

	@Override
	public void handleUncaughtException(final Throwable ex, final Method method, final Object... params) {
        System.out.println("Exception message - " + ex.getMessage());
        System.out.println("Method name - " + method.getName());
        for (final Object param : params) {
            System.out.println("Param - " + param);
        }
    }
}
