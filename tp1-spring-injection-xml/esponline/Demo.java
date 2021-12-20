package tn.esprit.esponline;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tn.esprit.esponline.config.BeansConfiguration;

public class Demo {
	private ApplicationContext context;
	public void verifyBeans (String[] args) {
		
		// Chargement du Conteneur Spring IoC : 
		context = new AnnotationConfigApplicationContext(BeansConfiguration.class);
		 
		System.out.println("Contains userControlImpl " + context.containsBeanDefinition("userControl"));
		System.out.println("Contains userServiceImpl " + context.containsBeanDefinition("userService"));
		System.out.println("Contains userDAOImpl " + context.containsBeanDefinition("userDAO"));
	}

}