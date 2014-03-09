package madhav;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		  // BeanFactory ctx=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		  Employee e=(Employee)ctx.getBean("emp");
		   e.setDetails();
		   e.showDetails();
	}

}
