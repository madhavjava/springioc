package madhav;

import java.util.List;

public class Triangle {
private List<Point> points;


public List<Point> getPoints() {
     return points;
}


public void setPoints(List<Point> points) {
     this.points = points;
}


public void show()
{
     for(Point p:points)
     {
    
     System.out.printf("points=" + "(" + p.getX()+"," + p.getY()+ ")" +"\n" );
     }
}

}