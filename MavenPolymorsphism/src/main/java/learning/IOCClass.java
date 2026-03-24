package learning;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCClass {
	
	public static void main(String a[]) {
		ApplicationContext application=new ClassPathXmlApplicationContext("metadata.xml");
		Orders ord=(Orders)application.getBean("ordersBean");
		System.out.println(ord.getCustomer());
		System.out.println(ord.getProductName());
		System.out.println(ord.getOrderId());
		
	}
}
