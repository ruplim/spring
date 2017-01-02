import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		
		System.out.println("cust 24 " + service.findAll().get(0).getFirstname());
	}

}
