package madhav.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import madhav.pojodao.Dept;

import org.springframework.jdbc.core.PreparedStatementSetter;

public class MyPreparedStatementSetter implements PreparedStatementSetter
{
	Dept d;
	public MyPreparedStatementSetter(Dept d)
	{
		this.d=d;
	}
	public void setValues(PreparedStatement ps) throws SQLException
	{
		ps.setInt(1,d.deptno);
        ps.setString(2,d.dname);
        ps.setString(3,d.loc);
	}
	
}

