  
package madhav.daoimpl;
import madhav.pojodao.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.Service;
import java.util.*;
public class DeptDao {
            JdbcTemplate jt;
            public DeptDao(JdbcTemplate jt)
            {
            this.jt=jt;
            }
            
            public void enterRecord()
            {
            	
            //	jt.update("insert into dept values(23,'sales','hyd')");
            	
            /*	int deptno=jt.queryForInt("select deptno from dept where loc='hyd'");
            	System.out.print("deptno=" + deptno);
            	*/
            	
                      Dept d=new Dept();
                        d.setDeptno(777);
                        d.setDname("peers");
                        d.setLoc("cal");
                        /* 
                       MyPreparedStatementCreater ms=new MyPreparedStatementCreater(d);
                        jt.update(ms);
                        System.out.println("record in inserted");*/
                        
                        //i am trying to inserting through PreparedStatementSetter
                        
                       MyPreparedStatementSetter mps= new MyPreparedStatementSetter(d);
                        jt.update("insert into dept values(?,?,?)",mps);
                        
                       System.out.println("record  inserted from setter");
            }


            
    
        
}
