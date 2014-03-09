package madhav;

public class Triangle {
	Point point1;

	Triangle(Point point1){
		this.point1=point1;
	}

public Point getPoint1() {
		return point1;
	}

public void show(){
	System.out.println("x="+ point1.getX());
	System.out.println("y="+ point1.getY());
}
}
