import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.costalopes"})
public class AppConfiguration {

//	@Bean(name = "customerService")
//	public CustomerService getCustomerService() {
		
		// constructor injection
		// CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
		
		// setter injection
//		CustomerServiceImpl customerService = new CustomerServiceImpl();
		// customerService.setCustomerRepository(getCustomerRepository());
		
//		return customerService;
//	}
	
//	@Bean(name = "customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	}
	
}
