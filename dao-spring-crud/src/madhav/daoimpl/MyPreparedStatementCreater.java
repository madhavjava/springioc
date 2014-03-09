package madhav.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import madhav.pojodao.Dept;

import org.springframework.jdbc.core.PreparedStatementCreator;

public class MyPreparedStatementCreater implements PreparedStatementCreator {
    Dept d;
    public MyPreparedStatementCreater(Dept d)
    {
          this.d=d;
    }
    public PreparedStatement createPreparedStatement(Connection con)
                throws SQLException {
          // TODO Auto-generated method stub
          PreparedStatement ps=con.prepareStatement("insert into dept values(?,?,?)");
          ps.setInt(1,d.deptno);
          ps.setString(2,d.dname);
          ps.setString(3,d.loc);
          return ps;
    }

}


