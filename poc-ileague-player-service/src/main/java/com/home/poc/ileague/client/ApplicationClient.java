package com.home.poc.ileague.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.poc.ileague.config.AppConfig;
import com.home.poc.ileague.model.Player;
import com.home.poc.ileague.service.PlayerService;

public class ApplicationClient {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConfig.class);
		PlayerService service = appContext.getBean("playerService",PlayerService.class); // Setter Injection
		service.addPlayer(new Player("Shilton Paul", 29, "GK", "IND", "Maslandapur,WB", 7, 77));
	}
}
