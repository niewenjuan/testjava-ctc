package com.service.java.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestJava {

        JavaDelegate javaDelegate = new JavaDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = javaDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}