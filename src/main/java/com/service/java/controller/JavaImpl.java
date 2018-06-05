package com.service.java.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-06-05T02:26:25.395Z")

@RestSchema(schemaId = "java")
@RequestMapping(path = "/java", produces = MediaType.APPLICATION_JSON)
public class JavaImpl {

    @Autowired
    private JavaDelegate userJavaDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userJavaDelegate.helloworld(name);
    }

}
