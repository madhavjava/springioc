
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
       
        
    	Student student;
    	DeptDao deptdao;
        ApplicationContext beanfactory;
      
        beanfactory=new ClassPathXmlApplicationContext("spring.xml");
        deptdao = (DeptDao)beanfactory.getBean("deptdao");
       deptdao.enterRecord();
System.out.println("record inserted successfully");

//student = (Student)beanfactory.getBean("stu");
//student.createstudent();
//System.out.println("record entered successfully");



	}

}
