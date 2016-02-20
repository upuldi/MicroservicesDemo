package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.Writer;

/**
 * Created by udoluweera on 2/20/16.
 */
@RestController
public class DefaultController {

/*
    com:
    testOne:
    someProperty: 'TEST ONE SOME PROP'
    anotherProperty: 'TEST ONE ANOTHER PROP'
    toBeOverRiddednProperty: 'TEST ONE TO BE OVERRIDDED PROP'
    testTwo:
    someProp: 'TEST TWO SOME PROP'
    anotherProp: 'TEST TWO ANOTHER PROP'
    anotherAnother:
    keyOne: 'KEY ONE VALUE'
    keyTwo: 'KEY TWO VALUE'
*/


    @Value("${com.testOne.someProperty}")
    private String someProperty;

    @Value("${com.testOne.anotherProperty}")
    private String anotherProperty;


    @Value("${com.testOne.toBeOverRiddednProperty}")
    private String toBeOverriddenProperty;


    @RequestMapping("/")
    public void getJson(Writer responseWriter) throws IOException {
        responseWriter.write("Properties Demo \n");
        responseWriter.write(String.format("Some Property %s \n", someProperty));
        responseWriter.write(String.format("Another Property %s \n", anotherProperty));
        responseWriter.write(String.format("To be overridden Property %s \n",toBeOverriddenProperty));

    }

}
