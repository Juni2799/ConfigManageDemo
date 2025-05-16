package com.info.config_demo.controller;

import com.info.config_demo.config.BuildInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/build-info")
@RequiredArgsConstructor
public class ConfigController {
//    @Value("${build.id:1}")
//    private String buildId;
//
//    @Value("${build.version:1.1}")
//    private String buildVersion;
//
//    @Value("${build.info:Default-build}")
//    private String buildInfo;

    private final BuildInfo buildInfo;

    @Value("${main-build.id}")
    private String mainBuildInfo;

    @GetMapping
    public String getBuildInfo(){
        return "Build Id: " + buildInfo.getId() + ", Build Version: " + buildInfo.getVersion() +
                ", Build Info: " + buildInfo.getInfo() + ", Main-Build id: " + mainBuildInfo;
    }
}
