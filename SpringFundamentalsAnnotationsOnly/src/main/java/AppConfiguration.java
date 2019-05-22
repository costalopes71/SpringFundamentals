import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.costalopes"})
@PropertySource("app.properties")
public class AppConfiguration {

	@Bean
	public PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
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
