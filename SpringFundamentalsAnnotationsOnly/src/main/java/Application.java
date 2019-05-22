import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.costalopes.service.CustomerService;

public class Application {

    public static void main(String[] args) {
    	
    	ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
    	
    	CustomerService service = appContext.getBean("customerService", CustomerService.class);
    	System.out.println(service);
    	
    	CustomerService service2 = appContext.getBean("customerService", CustomerService.class);
    	System.out.println(service2);
    	
        System.out.println(service.findAll().get(0).getFirstName());

    }

}