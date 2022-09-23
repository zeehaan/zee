package com.practice.webservices.restfulwebservices;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.LocaleResolver;
//import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
//import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.practice.webservices.restfulwebservices.test5.UserRepository2;
import com.practice.webservices.restfulwebservices.test5.RatingRepository2;

@SpringBootApplication
//@EnableJpaRepositories(basePackages="com.techprimers.db.repository")
public  class RestfulWebServicesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}
	
//	@Autowired
//    private UserRepository2 userRepository2;	
//	@Autowired
//	private RatingRepository2 rateingrepository2;
//	@Bean
//	public LocaleResolver localeResolver() {
//		AcceptHeaderLocaleResolver localeResolver=new AcceptHeaderLocaleResolver();
//		localeResolver.setDefaultLocale(Locale.US);
//		return  localeResolver;
//	}
//
	@Override
	public void run(String... args) throws Exception {
	}
	
//	@Bean
//	public ResourceBundleMessageSource  messageSource() {
//		ResourceBundleMessageSource messageSource=new ResourceBundleMessageSource();
//		messageSource.setBasename("messages");
//		return messageSource;
//	}

}
  