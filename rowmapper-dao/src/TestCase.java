
import madhav.daoimpl.*;
import madhav.daoimpl.DeptDao;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.*;
import org.apache.commons.dbcp.BasicDataSource;
public class TestCase {

            /**
             * @param args
             */
    public static void main(String[] args) throws Exception {
       
        
        DeptDao deptDao;
        ApplicationContext beanfactory;
      
        beanfactory=new ClassPathXmlApplicationContext("spring.xml");
         deptDao = (DeptDao)beanfactory.getBean("deptdao");

System.out.println("extract data");
//deptDao.selectRecords();
System.out.println("====================================================================\n\n");
deptDao.selectbyresultsetextractor();



	} 

}
