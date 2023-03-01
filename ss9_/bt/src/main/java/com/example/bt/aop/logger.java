package com.example.bt.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class logger {
    private static int count = 0;
    private static int countRentReturn = 0;
    @Pointcut("execution(* com.example.bt.controller.LibraryController.*(..))")
    public void getTimeAccess(){
    }
    @Pointcut("execution(* com.example.bt.controller.LibraryController.rent(..))")
    public void getTimeRent(){
    }
    @Pointcut("execution(* com.example.bt.controller.LibraryController.returnBook(..))")
    public void getTimeReturn(){
    }
    @After(value = "getTimeAccess()")
    public void countTime(){
        count++;
        System.out.println("---Access time: " + count);
    }
    @After(value = "getTimeRent()")
    public void countTimeRent(){
        countRentReturn++;
        System.out.println("---Access time rent or return book: " + countRentReturn);
    }
    @After(value = "getTimeReturn()")
    public void countTimeReturn(){
        countRentReturn++;
        System.out.println("---Access time rent or return book: " + countRentReturn);
    }
}
