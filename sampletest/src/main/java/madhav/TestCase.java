package madhav;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory bf=new XmlBeanFactory(new FileSystemResource("spring.xml"));
	    Triangle t=(Triangle)bf.getBean("t1");
	     t.show();
	}

}
