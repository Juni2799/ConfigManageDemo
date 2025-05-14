package com.info.config_demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/build-info")
public class ConfigController {
    @Value("${build.id:1}")
    private String buildId;

    @Value("${build.version:1.1}")
    private String buildVersion;

    @Value("${build.info:Default-build}")
    private String buildInfo;

    @GetMapping
    public String getBuildInfo(){
        return "Build Id: " + buildId + ", Build Version: " + buildVersion + ", Build Info: " + buildInfo;
    }
}
