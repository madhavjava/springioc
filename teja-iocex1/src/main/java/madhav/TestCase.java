package madhav;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestCase {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       
        //testing the springcontainer

  BeanFactory bf=new XmlBeanFactory(new FileSystemResource("spring.xml"));
         Student s=(Student)bf.getBean("stubeanid");
         s.display();
    

  }
}
