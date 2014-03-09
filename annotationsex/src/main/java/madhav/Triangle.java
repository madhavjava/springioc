package madhav;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("t1")
public class Triangle {
@Autowired  // <property name="pointb" ref="point2"></property>

private Point pointb;

public Point getPointb() {
	return pointb;
}



public void setPointb(Point pointb) {
	this.pointb = pointb;
}



public void show()
{
    System.out.printf("pointa=" + "(" + pointb.getX()+"," + pointb.getY()+ ")" +"\n" );
    System.out.println("success");
}

}