package tn.esprit.espoline;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	private static ApplicationContext context;
	public static void main(String[] args) {

		// Chargement du Conteneur Spring IoC : 
		context = new ClassPathXmlApplicationContext("tp1-beans.xml"); 

		System.out.println("Contains userControlImpl " + context.containsBeanDefinition("UserControl"));
		System.out.println("Contains userServiceImpl " + context.containsBeanDefinition("userService"));
		System.out.println("Contains userDAOImpl " + context.containsBeanDefinition("userDAO"));
	}


}