package com.practice.webservices.restfulwebservices.helloworld;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController; 
//Controller
@RestController
public class HelloWorldController {
	@Autowired
	private MessageSource messageSource;
	@GetMapping(path="/hello-world")
	public String helloworld() {
		return "Hello World";
	}
	@GetMapping(path="/hello-world-internationalization")
	public String helloworldInternationalization() {
		return messageSource.getMessage("good.morning.message",null, LocaleContextHolder.getLocale() );
	}
//	@GetMapping(path="/hello-world-internationalization")
//	public String helloworldInternationalization(@RequestHeader(name="Accept-Language",required =false) Locale locale ) {
//		return messageSource.getMessage("good.morning.message",null, LocaleContextHolder.getLocale() );
//	}
		
		//hello-world-bean
		@GetMapping(path = "/hello-world-bean")
		public HelloWorldBean helloWorldBean() {
			return new HelloWorldBean ("Hello-World-Bean");
	}
		//hello-world-bean
				@GetMapping(path = "/hello-world/path-varaible/{name}")
				public HelloWorldBean helloWorldBean(@PathVariable String name) {
					return new HelloWorldBean (String.format("Hello World,%s",name));
			}

}



//Instread using @RequestMapping(method=RequestMapping.Get,path="/hello-world")
//we can use @GetMapping(path="/hello-world")
