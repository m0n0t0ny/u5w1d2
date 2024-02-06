package com.antoniobertuccio.u5w1d1;

import com.antoniobertuccio.u5w1d1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Restaurant {

  public static void main(String[] args) {
    SpringApplication.run(Restaurant.class, args);

    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Restaurant.class);

    Menu menu = (Menu) ctx.getBean("getMenu");

    System.out.println(menu);
    ctx.close();
  }

}
