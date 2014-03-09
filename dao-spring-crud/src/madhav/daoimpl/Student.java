package madhav.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

public class Student {

JdbcTemplate jt;
public Student(JdbcTemplate jt)
{
	this.jt=jt;
}

public void createstudent()
{
	jt.update("insert into dept values(45,'raju','hyd')");
}
}
