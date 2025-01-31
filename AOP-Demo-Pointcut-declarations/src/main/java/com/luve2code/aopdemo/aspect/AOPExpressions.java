package com.luve2code.aopdemo.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;



@Aspect
public class AOPExpressions {


    // this is where we add all of our related advices for logging

    // let's start with a @Before advice

    @Pointcut("execution(* com.luve2code.aopdemo.dao.*.*(..))")
    public void forDaoPackage(){}


    // create pointcut for getter methods
    @Pointcut("execution(* com.luve2code.aopdemo.dao.*.get*(..))")
    public void getter(){}

    // create pointcut for setter methods
    @Pointcut("execution(* com.luve2code.aopdemo.dao.*.set*(..))")
    public void setter(){}


    // create pointcut: include package ... exclude getter/setter
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter(){}



}
