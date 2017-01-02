import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service =ctx.getBean("customerService", CustomerService.class);
		
		
		System.out.println("Cust 3:" + service.findAll().get(0).getFirstname());
	}

}
