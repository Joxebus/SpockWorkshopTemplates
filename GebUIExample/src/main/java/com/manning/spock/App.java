package com.manning.spock;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@Controller
public class App extends WebMvcConfigurerAdapter {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/html/");
        resolver.setSuffix(".html");
        return resolver;
    }

    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mav){
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView welcome(ModelAndView mav) {
        logger.debug("Welcome page is showing");
        mav.setViewName("welcome");
        return mav;
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public ModelAndView about(ModelAndView mav) {
        logger.debug("Welcome page is showing");
        mav.setViewName("about");
        return mav;
    }
}
