package madhav;

import org.springframework.stereotype.Service;


public class Point {
private int x;
private int y;
public Point()
{
	x=45;
	y=56;
}
public int getX() {
     return x;
}
public void setX(int x) {
     this.x = x;
}
public int getY() {
     return y;
}
public void setY(int y) {
     this.y = y;
}

}