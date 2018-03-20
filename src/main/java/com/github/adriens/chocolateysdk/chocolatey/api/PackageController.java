/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adriens.chocolateysdk.chocolatey.api;

import com.github.adriens.chocolateysdk.chocolatey.sdk.PackageWrapper;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author salad74
 */
@RestController
public class PackageController {

    final static Logger logger = LoggerFactory.getLogger(PackageController.class);

    public PackageController() {
        java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);
    }
    
    @RequestMapping("/")
    public String welcome(){
        String out;
        out = "Main endpoint is : /{package}";
        return out;
    }
    
    @RequestMapping("/{package}")
    public PackageWrapper getPackage(
            @PathVariable("package") String aPackage)
    throws IOException {
        return new PackageWrapper(aPackage);
    }
}
