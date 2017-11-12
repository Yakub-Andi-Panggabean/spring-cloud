package com.dream.painter.user.reg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping(value = UserRegistrationController.BASE_PATH)
public class UserRegistrationController {

  public static final String BASE_PATH = "version";

  @Autowired
  private Environment env;

  @RequestMapping
  public String getVersion() {

    return env.getProperty("application.version");
  }

}
