
package madhav.daoimpl;




import org.springframework.jdbc.core.*;
import java.util.*;
public class DeptDao {
            JdbcTemplate jt;
            public DeptDao(JdbcTemplate jt)
            {
            this.jt=jt;
            }
            public void selectRecords()
            {
                       
                        String sql="select * from dept";
                        
                  System.out.println("select record form Rommapper");
                  DeptRecord dd=new DeptRecord();
                 List<Object> depts=jt.query(sql, dd);
                 Iterator<Object> it=depts.iterator();
                 while(it.hasNext())
                 {
                         Dept d=(Dept)it.next();
                         System.out.println("deptno = "+ d.deptno);
                         System.out.println("dept name= "+ d.dname);
                         System.out.println("dept loc " + d.loc);
                         
                 }
                 }
            
            public void selectbyresultsetextractor()
            {
            	 System.out.println(" i am trying to select from rowcallbackhanler");
                 String sql="select * from dept";
                 DeptResults dr=new DeptResults();
                 
                 System.out.println("listsize"+ dr.list.size());
           jt.query(sql, dr);
        
          
           Iterator it1=dr.list.iterator();
           while(it1.hasNext())
                      {
                              Dept d=(Dept)it1.next();
                              System.out.println("deptno = "+ d.deptno);
                              System.out.println("dept name= "+ d.dname);
                              System.out.println("dept loc " + d.loc);
                              
                      }
           System.out.println("listsize"+ dr.list.size());
            }
           

}
