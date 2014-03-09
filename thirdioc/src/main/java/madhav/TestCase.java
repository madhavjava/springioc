package madhav;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestCase {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       
        //testing the springcontainer

        // TODO Auto-generated method stub

                   //test casse for iocdep(ioc dependency setter based)
                   BeanFactory bf=new XmlBeanFactory(new FileSystemResource("spring.xml"));
                   Triangle t=(Triangle)bf.getBean("triangle");
                   t.show();
    

  }
}
