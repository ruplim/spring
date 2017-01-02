import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.samples.repository.CustomerRepository;
import com.samples.repository.HibernateCustomerRepositoryImpl;
import com.samples.service.CustomerService;
import com.samples.service.CustomerServiceImpl;

@Configuration
public class AppConfig {

	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		//CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		CustomerServiceImpl service = new CustomerServiceImpl();
		service.setCustomerRepository(getCustomerRepository());
		return service;
	}
	
	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}
	
}
