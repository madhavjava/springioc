package madhav.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowCallbackHandler;

public class DeptResults implements RowCallbackHandler{
    public List list;
    public DeptResults()
    {
            list=new ArrayList();
    }
      public void processRow(ResultSet rs) throws SQLException {
            // TODO Auto-generated method stub
              Dept d=new Dept();
            d.deptno=rs.getInt(1);
            d.dname=rs.getString(2);
            d.loc=rs.getString(3);
            list.add(d);
      }

}