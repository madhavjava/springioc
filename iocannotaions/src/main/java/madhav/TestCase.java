package madhav;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TestCase {
    public static void main(String[] args) {
       
                   //test casse for iocdep(ioc dependency setter based)
    	            ApplicationContext bf=new ClassPathXmlApplicationContext("spring.xml");
                   Triangle t=(Triangle)bf.getBean("triangle");
                   t.show();
    

  }
}
