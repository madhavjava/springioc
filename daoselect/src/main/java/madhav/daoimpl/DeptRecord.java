package madhav.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;



import org.springframework.jdbc.core.RowMapper;

 class DeptRecord implements RowMapper
{  
            public Object mapRow(ResultSet rs, int rownum) throws SQLException {
                        // TODO Auto-generated method stub
                        Dept d=new Dept();
                        d.deptno=rs.getInt(1);
                        d.dname=rs.getString(2);
                        d.loc=rs.getString(3);
                                    return d;
            }

}